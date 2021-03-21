class Solution {

    public static void main(String args[]){
	String value = "12345";
	
	System.out.println(myAtoi(value));
    }

    public static int myAtoi(String value) {
    int res = 0;
    boolean isNeg = false;
    int loc = 0;
    
     
		for(char ch : value.toCharArray()) {
          
			if(Character.isDigit(ch)){
                int digit = Character.getNumericValue(ch);
                if(isNeg){
                   if(res >= (Integer.MIN_VALUE + digit) / 10)res = res* 10 - digit;
                    else return Integer.MIN_VALUE;
                }else  {
                    if(res <= (Integer.MAX_VALUE - digit) / 10)res = res* 10 + digit;
                    else return Integer.MAX_VALUE;
              }
            }
            else if((ch == '-' || ch == '+')&&loc  == 0){
                if(ch == '-')isNeg = true;
                loc++;
            }
            else if(ch == '+' && isNeg) {
		            	
		            	break;
		            }
            else if(ch == ' ' && (loc == 0 || loc == -1))continue;
            else break;
             if(ch != ' ') loc++;
        }
        
        return res;
    }
}