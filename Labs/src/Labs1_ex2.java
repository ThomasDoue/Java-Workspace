public class Labs1_ex2 {
	public static void main(String[] args) {

		square(20);
	}

	static void square(int n) {
		int i = 0;
		while (i < n * n) {
			System.out.print(i % n == 0 ? "\n*" : "*");
			i += 1;
		}
	}
}
