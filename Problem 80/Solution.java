package Test;

class Solution {
	public static void main(String args[]) {

		int[] nums = new int[] { 1, 1, 1, 2, 3 }; // you can change the input
		int count = 1;
		int loc = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				count++;
				if (count <= 2) {
					if (loc < i)
						nums[loc] = nums[i];
					loc++;
				}
				if (count > 2) {
					continue;
				}
			} else {
				nums[loc] = nums[i];
				loc++;
				count = 1;
			}
		}
		for (int i = 0; i < loc; i++) {
			System.out.println(nums[i]);
		}
	}
}