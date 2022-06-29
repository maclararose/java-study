package fundamentos.desafios;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a altura:");
		double altura = scan.nextDouble();
		
		System.out.println("Digite o peso: ");
		double peso = scan.nextDouble();
		
		double imc = peso / (Math.pow(altura, 2));
		
		System.out.println("IMC: " + imc);
		
		scan.close();
	}
}
