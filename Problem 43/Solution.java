class Solution{
	public static void main(String args[]){
	String num1 = "998";
	String num2 = "123";
	System.out.println(multiply(num1, num2));
}
    public static String multiply(String num1, String num2) {
       int c = 0;
       String fin = "0";
	   int power = 0;
        if(num1.equals("0") || num2.equals("0"))return "0";
		if (num1.length() <= num2.length()) {

			for (int j = num1.length() - 1; j >= 0; j--) {
				int d1 = Character.getNumericValue(num1.charAt(j));
				String res = "";
				for (int m = 0; m < power; m++)
					res = res + "0";
				for (int i = num2.length() - 1; i >= 0; i--) {

					int d2 = Character.getNumericValue(num2.charAt(i));
					int cur = (d2 * d1) + c;
					c = cur / 10;
					
					res = String.valueOf(cur % 10) + res;

				}
				if (c > 0) {
					res = String.valueOf(c) + res;
					c = 0;
				}
				power++;
				fin = add(fin, res);
			}
			
           return fin;
        }else{
          
			for(int j = num2.length()-1; j >= 0; j--) {
				int d1 = Character.getNumericValue(num2.charAt(j));
				String res = "";
                for (int m = 0; m < power; m++)
					res = res + "0";
				for(int i = num1.length()-1; i >= 0; i--) {
					
	            	int d2 = Character.getNumericValue(num1.charAt(i));
	            	int cur = (d2* d1) + c;
	            	c = cur / 10;
	            	res = String.valueOf(cur % 10) + res;
	            }
				if(c > 0) {
					res = String.valueOf(c) + res;
					c = 0;
				}
				
				power++;
			  
				fin = add(fin, res);
			}  
        }
       int count = 0;
		for(int i = 0; i < fin.length();i++) {
			if(fin.charAt(i) == '0')count++;
			else break;
		}
		if(count > 0 & count < fin.length()) fin = fin.substring(count, fin.length());
		if(count == fin.length())fin = "0";
    return fin;
	}

	public static String add(String fin, String res) {
		int c = 0;
		int sum = 0;
		String val = "";
		int zero = 0;
		if (fin.length() < res.length()) {
			zero = res.length() - fin.length();

			for (int i = 1; i <= zero; i++) {
				fin = "0" + fin;
			}
		} else if (res.length() < fin.length()) {
			zero = fin.length() - res.length();
			for (int i = 1; i <= zero; i++) {
				res = "0" + res;
			}
		}
		for (int i = res.length() - 1; i >= 0; i--) {

			sum = (Character.getNumericValue(res.charAt(i)) + Character.getNumericValue(fin.charAt(i)) + c) % 10;
			val = String.valueOf(sum) + val;
            if((Character.getNumericValue(res.charAt(i)) + Character.getNumericValue(fin.charAt(i)) + c) == 10)c = 1;
			else c = (Character.getNumericValue(res.charAt(i)) + Character.getNumericValue(fin.charAt(i))) / 10;
		}

		if (c > 0)
			val = String.valueOf(c) + val;

		return val;
	}
}