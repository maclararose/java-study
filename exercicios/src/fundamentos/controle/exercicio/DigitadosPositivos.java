package fundamentos.controle.exercicio;

import java.util.Scanner;

public class DigitadosPositivos {

	public static void main(String[] args) {
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = scan.nextInt();
		
		while(numero >= 0) {
			total += numero;
			System.out.println("Soma total: " + total);
			System.out.println("Continue digitano numeros positivos para somar ou digite um numero negativo para sair");
			numero = scan.nextInt();
		}
		scan.close();
	}

}
