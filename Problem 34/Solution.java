class Solution {
    public int[] searchRange(int[] nums, int target) {
     int[] res = new int[]{-1,-1};
	 binarySearch(nums,0,nums.length-1,target, res);
		
		return res;
	}
	 public static void binarySearch(int[] nums, int start, int end,int target, int[] res){
	        int count = 1;
	        while(start <= end){
	            int mid = (start + end) / 2;
	            if(nums[mid] == target){
	               for(int i = start; i <= mid;i++) {
	            	   if(nums[i] == target) {
	            		   res[0] = i;
	            		   break;
	            	   }
	               }
	               if(res[0] == -1)nums[0] = mid;
	               for(int i = end; i >= mid;i--) {
	            	   if(nums[i] == target) {
	            		   res[1] = i;
	            		   break;
	            	   }
	               }
	               if(res[1] == -1)res[1] = mid;
	                break;
	            }
	            else if(nums[mid] < target) {
	            	start = mid + 1;
	            }
	            else if(nums[mid] > target) {
	            	end = mid - 1;
	            }
	            
	        }
	    }
}