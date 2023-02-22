package dsa;

public class TwoPointer {
//	public static void main(String[] args) {
	// int arr[] = { 1, 2, 4, 5, 6, 7 };
	// int target = 8;
	// int result[] = search(arr, target);
//		System.out.println("1");

//	}
	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 5, 6, 7 };
		int target = 8;
		int result[] = search(arr, target);
		System.out.println(result[0] + " " + result[1]);
	}

	public static int[] search(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		
		while (left < right) {
			int tmp = arr[left] + arr[right];
			if (tmp == target) {
				return new int[] { left, right };
			}
			if (tmp < target) {
				left++;
			} else
				right--;
		}
		return new int[] { -1, - 1 };
	}
}
