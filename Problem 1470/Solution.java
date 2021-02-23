class Solution {

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 5, 1, 3, 4, 7 };
		int n = 3;
		nums = shuffle(nums, n);

		for (int i = 0; i < nums.length; i++)
			System.out.println(nums[i]);
	}

	public static int[] shuffle(int[] nums, int n) {
		int[] res = new int[2 * n];

		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0)
				res[i] = nums[i / 2];
			else {
				res[i] = nums[n];
				n++;
			}
		}
		return res;
	}
}