class Solution {
    
public static void main(String args[]){
		int[] nums = new int[] {4,3,2,7,8,2,3,1}; //you can give desire input here
		findDisappearedNumbers(nums);  
	}

	public static void findDisappearedNumbers(int[] nums) {
	        ArrayList<Integer> res = new ArrayList<Integer>();
	        
	        for(int i = 0; i < nums.length;i++) {
	        	if(nums[Math.abs(nums[i])-1] > 0)nums[Math.abs(nums[i])-1] = nums[Math.abs(nums[i])-1] * -1;
	        }
	        
	        for(int i = 0; i < nums.length;i++) {
	        	if(nums[i] > 0) {
	        		res.add(i+1);
	        	}
	        }
	       System.out.println(res);
	    }
}