package dsa;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 2, 3, 4, 5 };
		
		System.out.println("Remove duplicate: " + removeKey(arr, 1));
	}

	public static int removeDuplicate(int arr[]) {

		int bingo = 0;
		int check = 1;
		int i = 1;
		while (bingo < arr.length - 1) {
			if (arr[bingo] != arr[check]) {
				bingo = check;
				check = bingo + 1;
				i++;
			} else
				check++;
		}

		return i;
	}
	public static int removeKey(int arr[], int key) {
		int keyCheck = 1;
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] != key) {
				keyCheck++;
			}
		}
		return keyCheck;
	}
}
