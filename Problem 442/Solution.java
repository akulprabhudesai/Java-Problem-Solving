class Solution {
    
public static void main(String args[]){
	int[] nums = new int[]{4,3,2,7,8,2,3,1}; // you can give your desired input here
	findDuplicates(nums);	
}




public static void findDuplicates(int[] nums) {
     ArrayList<Integer> res = new ArrayList<Integer>();
        
       for(int i = 0; i < nums.length;i++) {
			if(nums[ Math.abs(nums[i])-1] < 0)res.add(( Math.abs(nums[i])-1)+1);
			nums[ Math.abs(nums[i])-1] *= -1;
		}
        
        System.out.println(res);
    }
}