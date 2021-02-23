class Solution {

    public static void main(String args[]){
	int[][] accounts = { {1,2,3}, {3,2,1} };
	System.out.println(maximumWealth(accounts));
}

    public static int maximumWealth(int[][] accounts) {
     int sum = 0;
        
        for(int row = 0; row < accounts.length;row++){
            int cur = 0;
            for(int col = 0; col < accounts[0].length;col++){
                cur += accounts[row][col];
            }
            if(cur > sum)sum = cur;
        }
        
        return sum;
    }
}