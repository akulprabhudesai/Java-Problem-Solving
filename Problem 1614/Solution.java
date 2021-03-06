class Solution {

public static void main(String args[]){
	String s = "(1+(2*3)+((8)/4))+1";
	System.out.println(maxDepth(s));    
}

public static int maxDepth(String s) {
        int count = 0;
        int cur = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '('){
                cur++;
        }
        if(cur > count)count = cur;
        if(s.charAt(i) == ')') cur--;
        }
        return count;
    }
}