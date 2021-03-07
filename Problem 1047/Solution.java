class Solution {
  
public static void main(String args[]){
	String s = "abbaca";
	System.out.println(removeDuplicates(s));
}
public static String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
		int len = 0;
		
		for(char ch : S.toCharArray()) {
			if(len > 0 && sb.charAt(len-1) == ch) {
				sb.deleteCharAt(--len);
				
			}else {
				sb.append(ch);
				len++;
			}
		}
    
      return sb.toString();
  }
}