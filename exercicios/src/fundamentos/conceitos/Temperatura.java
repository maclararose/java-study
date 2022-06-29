package fundamentos.conceitos;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		// (F - 32) * 5/9 = C
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = scanner.nextDouble();
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		
		double conversaoFahrenheit = ( celsius - 32 ) / 1.8;
		double conversaoCelsius = fahrenheit * 1.8 + 32 ;
		
		System.out.println("Valor em Farenheit: " + conversaoFahrenheit);
		System.out.println("Valor em Celsius: " + conversaoCelsius);
		
		scanner.close();
	}
}