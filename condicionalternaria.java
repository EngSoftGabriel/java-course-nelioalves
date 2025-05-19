package introJava;

import java.util.Scanner;

public class condicionalternaria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 1.0 : preco * 0.05; 
		
		System.out.println(desconto);
		
		sc.close();
	}

}
