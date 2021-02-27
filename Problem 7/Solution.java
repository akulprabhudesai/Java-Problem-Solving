class Solution {

	public static void main(String args[]) {

		int x = 1463847412;
		System.out.println(reverse(x));
	}

	public static int reverse(int x) {

		int res = 0;
		boolean flag = false;

		if (x > 0) {
			x = -x;
			flag = true;
		}

		// System.out.println(Integer.MAX_VALUE/10);
		while (x != 0) {
			if (res >= Integer.MIN_VALUE / 10) {
				res = res * 10;
				if (res >= Integer.MIN_VALUE - (x % 10)) {
					res = res + (x % 10);
				} else {
					res = 0;
					break;
				}

			} else {
				res = 0;
				break;
			}
			x = x / 10;
		}
		if (flag)
			return -res;
		return res;
	}
}