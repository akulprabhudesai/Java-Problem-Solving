class Solution {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
		System.out.println(canMakeArithmeticProgression(arr));

	}

	public static boolean canMakeArithmeticProgression(int[] arr) {
		Arrays.sort(arr);
		int diff = arr[1] - arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - arr[i - 1] != diff) {
				return false;
			}
		}
		return true;
	}
}