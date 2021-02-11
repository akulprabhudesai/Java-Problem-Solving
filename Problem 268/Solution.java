class Solution {

    public static void main(String[] args) {
       int[] nums = new int[]{3,0,1}; // you can change your input here
       int count = 0;
        for(int i = 0; i <= nums.length;i++){
            count += i;
        }
        for(int i = 0; i < nums.length;i++){
            count -= nums[i];
        }
    System.out.println(count);
	}

}