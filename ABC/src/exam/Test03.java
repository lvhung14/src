package exam;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
			System.out.println("Enter check number: ");
			Scanner ip = new Scanner(System.in);
			int input = ip.nextInt();
			if(input == reverse(input)){
				System.out.println(input + " is a symmetrycal number");
			}
			else System.out.println(input + " is not a symmetrycal number");
	}

	public static int reverse(int a) {
		int result = 0;
		while (a != 0) {
			int div = a % 10;
			result = result * 10 + div;
			a /= 10;
		}
		return result;
	}
}
