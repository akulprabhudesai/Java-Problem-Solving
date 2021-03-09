class Solution {
public static void main(String args[]){
String s = "{[]}";    
System.out.println(isValid(s));

}
public static boolean isValid(String s) {
        Stack<Character> sb = new Stack<Character>();
		
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{')sb.push(ch);
            else{
                if(sb.isEmpty())return false;
                if(ch == ')' ){
                    if(sb.peek() == '('){
                        sb.pop();
                	   continue;
                    }else return false;            	
                }
                else if(ch == ']' ){
                    if(sb.peek() == '['){
                        sb.pop();
                	   continue;
                    }else return false;            	
                }
                if(ch == '}' ){
                    if(sb.peek() == '{'){
                        sb.pop();
                	   continue;
                    }else return false;            	
                }
            }
        }
        
        if(sb.isEmpty())return true;
        return false;
    }
}