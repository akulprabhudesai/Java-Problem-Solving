class Solution_one {
    public static void main(String args[]){
	int[] nums = new int[]{2,0,2,1,1,0}; //you can change input here
	sortColors(nums);
	for(int i = 0; i < nums.length;i++)System.out.println(nums[i]);
   }
    public static void sortColors(int[] nums) {
             int red = 0;
	     int blue = nums.length -1;
	     
             for(int i = 0; i < nums.length;i++){
	         if(nums[i] == 0 && i > red){
	            nums[i] = nums[red];
	            nums[red] = 0;
	            i--;
	            red++;
	          }
	          else if(nums[i] == 2 && i < blue){
	                  nums[i] = nums[blue];
	                  nums[blue] = 2;
	                  i--;
	                  blue--;
	            }
	    }
    }
}