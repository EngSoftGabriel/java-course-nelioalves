package introJava;

import java.util.Scanner;

public class scanear {
	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);

		double x;
		x = sc.nextDouble();
		System.out.println("Voçê digitou: " + x);

		sc.close();

	}

}
