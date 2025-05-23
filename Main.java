package introJava;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Resolution");
		System.out.printf("%s, which price is %.1f;%n", product1, price1);
		System.out.printf("%s, which price is %f;%n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender:%s;%n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %f;%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f;%n", measure);
		System.out.printf("US decimal point: 53.235;");		
		Locale.setDefault(Locale.US);
	}

}
