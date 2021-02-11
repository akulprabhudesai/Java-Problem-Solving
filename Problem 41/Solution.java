class Solution{
    public static void main(String[] arg) {
	int[] nums = new int[]{3,4,-1,1};
        if(nums.length == 0) System.out.println(1);
        if(nums.length == 1 && nums[0] != 1) System.out.println(1);
        if(nums.length == 1 && nums[0] == 1) System.out.println(2);
       
        
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 1) {
            	System.out.println(check(nums));
            	System.exit(0);
            }
        }
        
       System.out.println(1);
    }
    
    public static int check(int[] nums){
        
        for(int i = 0; i < nums.length;i++){
        	if(nums[i] <= 0 || nums[i] > nums.length) nums[i] = 1;
        }
        
        for(int i = 0; i < nums.length;i++){
            int loc = Math.abs(nums[i]);
            loc--;
            if(nums[loc]  > 0) nums[loc] *= -1;	
        }
        
        for(int i = 0; i < nums.length;i++){
            if(nums[i] > 0)return i+1;
        }
        
        return nums.length+1;
    }
}