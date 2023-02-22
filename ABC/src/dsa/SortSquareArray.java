package dsa;

public class SortSquareArray {
	public static void main(String[] args) {
		int[] arr = { -5, -2, -1, 0, 3, 5, 6 };
		int[] results = squareArray(arr);
		for(int result : results) {
			System.out.print(result + " ");
		}
	}

	public static int[] squareArray(int[] arr) {
		int n = arr.length;
		int[] square = new int[n];
		int temp = n - 1;
		int left = 0;
		int right = n - 1;

		while (left < right) {
			int leftSquare = arr[left] * arr[left];
			int rightSquare = arr[right] * arr[right];
			if (leftSquare < rightSquare) {
				square[temp--] = rightSquare;
				right--;
			} else {
				square[temp--] = leftSquare;
				left++;
			}
		}
		return square;
	}
}
