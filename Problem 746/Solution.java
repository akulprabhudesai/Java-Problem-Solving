class Solution {
    public static void main(String[] args){
	int[] cost = {10, 15, 20};
	System.out.println(minCostClimbingStairs(cost));
   }
    public static int minCostClimbingStairs(int[] cost) {
        int[] val = new int[cost.length+1];
        val[0] = cost[0];
        val[1] = cost[1];
        
        for(int i = 2; i <= cost.length;i++){
          int cur = (i < cost.length)?cost[i]:0;
          cur += Math.min(val[i-1], val[i-2]);
          val[i] = cur;
        }
        return val[val.length-1];    
    } 
}