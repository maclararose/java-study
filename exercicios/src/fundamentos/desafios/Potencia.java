package fundamentos.desafios;

import java.util.Scanner;

public class Potencia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double valor = scan.nextDouble();
		
		System.out.println("Ao quadrado: " + Math.pow(valor, 2));
		System.out.println("Ao quadrado: " + Math.pow(valor, 3));
		
		scan.close();
	}
}
