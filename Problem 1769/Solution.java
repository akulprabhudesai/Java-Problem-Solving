class Solution {

	public static void main(String args[]) {

		String boxes = "001011";
		int[] res = minOperations(boxes);

		for (int i = 0; i < res.length; i++)
			System.out.print(res[i] + " ");
	}

	public static int[] minOperations(String boxes) {

		int[] res = new int[boxes.length()];
		for (int i = 0; i < boxes.length(); i++) {
			if (boxes.charAt(i) == '1') {
				for (int j = 0; j < res.length; j++) {
					res[j] += Math.abs(i - j);
				}
			}
		}

		return res;
	}
}