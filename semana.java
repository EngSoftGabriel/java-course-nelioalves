package Intro;

import java.util.Scanner;

public class semana {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana:"); 
		
		int x = sc.nextInt();
		String dia;
		
		
		if (x == 1) {
			dia = "domingo";
		} else if (x == 2) {
			dia = "segunda";
		} else if (x == 3) {
			dia = "terça";
		} else if (x == 4) {
			dia = "quarta";
		} else if (x == 5) {
			dia = "quinta";
		} else if (x == 6) {
			dia = "sexta";
		} else if (x == 7) {
			dia = "sábado";
		} else {
			dia = "valor inválido";
		}
		
		System.out.println("Hoje é " + dia);
		sc.close();
		
	}

}
