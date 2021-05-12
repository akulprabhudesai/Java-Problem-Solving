class Solution {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } };

		System.out.println(luckyNumbers(matrix));

	}

	public static List<Integer> luckyNumbers(int[][] matrix) {
		List<Integer> res = new ArrayList<>();

		for (int r = 0; r < matrix.length; r++) {
			int min = Integer.MAX_VALUE;
			int col_index = r;
			for (int c = 0; c < matrix[0].length; c++) {
				if (matrix[r][c] < min) {
					min = matrix[r][c];
					col_index = c;
				}
			}

			int max = Integer.MIN_VALUE;

			for (int row = 0; row < matrix.length; row++) {
				if (matrix[row][col_index] > max)
					max = matrix[row][col_index];
			}

			if (max == min)
				res.add(max);
		}

		return res;
	}
}