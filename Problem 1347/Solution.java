class Solution {
    public static void main(String[] args){
        String s = "leetcode";
        String t = "practice";
        
        int res = minSteps(s,t);

        System.out.println(res);
    }
    
    public static int minSteps(String s, String t) {
   	 
   	 int[] sc = new int[26];
        for(int i=0;i<s.length();i++) {
            sc[(int)(s.charAt(i) - 'a')]++;
            sc[(int)(t.charAt(i) - 'a')]--;
        }
        if(sc[0] < 0)sc[0] = 0;
        for(int i = 1; i < sc.length;i++) {
       	 if(sc[i] > 0)sc[0] += sc[i];
        }
         
         return sc[0];
     }
}