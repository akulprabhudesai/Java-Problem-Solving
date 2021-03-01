class Solution {
	public static void main(String args[]) {
		int[] rating = new int[] { 2, 5, 3, 4, 1 };
		System.out.println(numTeams(rating));
	}

	public static int numTeams(int[] rating) {
		int n = rating.length;
		int[] in = new int[n];
		int[] de = new int[n];

		int res = 0;

		for (int i = n - 2; i >= 0; i--) {
			for (int j = i + 1; j < n; j++) {
				if (rating[i] > rating[j]) {
					de[i] += 1;
					res += de[j];
				} else {
					in[i] += 1;
					res += in[j];
				}
			}
		}
		return res;
	}
}