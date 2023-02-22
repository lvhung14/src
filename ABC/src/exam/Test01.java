package exam;

import static java.lang.Math.*;

public class Test01 {
	public static void main(String[] args) {
		int[] numbers = { 0, 1, 2, 4, 8, 22, 12, 16, 18, 16, 32, 64 };
		for (int number : numbers) {
			boolean isPoT = isPowerOfTwo2(number);
			System.out.println(number + ": " + isPoT);
		}
	}

	public static boolean isPowerOfTwo(int a) {
		boolean yes = false;
		for (int i = 1; i < 7; i++) {

			if (Math.pow(2, i) == a) {
				yes = true;
				break;
			}
			yes = false;
		}
		return yes;
	}

	public static boolean isPowerOfTwo1(int a) {
		if (a == 0)
			return false;
		double base = log(a) / log(2);

		return ceil(base) == floor(base);
	}

	public static boolean isPowerOfTwo2(int a) {
		int x = a / 2;
		if (x == 2)	return true;
		if (x % 2 != 0) return false;
		return isPowerOfTwo2(x);
	}
}
