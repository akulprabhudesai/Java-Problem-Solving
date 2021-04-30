class Solution {

	public static void main(String[] args) {
		int[] nums = new int[] { 6, 2, 6, 5, 1, 2 };
		System.out.println(arrayPairSum(nums));

	}

	public static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);

		for (int i = 2; i < nums.length; i = i + 2) {

			nums[0] += nums[i];
		}
		return nums[0];
	}
}