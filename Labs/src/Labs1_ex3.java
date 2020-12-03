import java.util.Scanner;

public class Labs1_ex3 {
	public static void main(String args[]) {
		System.out.println("Nombre :");
		int number = (new Scanner(System.in)).nextInt();
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				if (i == 0 || i == number - 1)
					System.out.print("*");
				else if (j == 0 || j == number - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
