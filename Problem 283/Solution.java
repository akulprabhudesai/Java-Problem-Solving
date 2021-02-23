
public class Solution {

	public static void main(String args[]) {

		int[] nums = new int[] { 0, 1, 0, 3, 2 }; // you can change the input

		int loc = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0 && nums[loc] == 0) {
				nums[loc] = nums[i];
				nums[i] = 0;
				loc++;
			}
			if (nums[i] == 0 && nums[loc] != 0)
				loc = i;
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

}