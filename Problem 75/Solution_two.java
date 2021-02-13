class Solution_one {
    public static void main(String args[]){
	int[] nums = new int[]{2,0,2,1,1,0}; //you can change input here
	sortColors(nums);
	for(int i = 0; i < nums.length;i++)System.out.println(nums[i]);
   }
     public static void sortColors(int[] nums) {
     int red = 0;
     int white = 0;
     
     for(int i = 0; i < nums.length;i++){
         if(nums[i] == 0)red++;
         if(nums[i] == 1)white++;
           
     }
        
     for(int i = 0; i < red;i++){
         nums[i] = 0;
     }
     
     for(int i = red; i < red + white;i++){
         nums[i] = 1;
     }
     
     for(int i = red + white; i < nums.length;i++){
         nums[i] = 2;
     }
   }
}