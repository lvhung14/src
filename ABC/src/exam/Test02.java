package exam;

public class Test02 {
	public static void main(String[] args) {
		
		
		System.out.println(fact(4, 7, 12, 18));
	}
	private static long fact(int ... numbers){
		long x = 0;
		for(int xyzs : numbers) {
			x +=fact(xyzs);
		}
		return x;
	}
	public static long fact(int a) {
		long x = 1;
		for (int i = 2; i <= a; i++) {
			x *= i;
		}
		return x;

	}
}
