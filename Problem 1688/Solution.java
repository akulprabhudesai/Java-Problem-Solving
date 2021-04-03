class Solution {


    public static void main(String[] args){
          int n = 27;
	  System.out.println(numberOfMatches(n));

}
    public static int numberOfMatches(int n) {
        int res = 0;
        while(n > 1){
            if(n % 2 == 0){
                res += n / 2;
                n = n / 2;
            }else{
                res += n / 2;
                n = 1 + (n / 2);
            }
        }
        return res;
    }
}