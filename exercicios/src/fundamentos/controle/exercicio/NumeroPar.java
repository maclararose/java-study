package fundamentos.controle.exercicio;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		
		int numero = scan.nextInt();
		
		if(numero >= 0  && numero <= 10 && numero % 2 == 0) {
			System.out.println("Está entre 0 e 10 e é par!");
		} else if (numero >= 0  && numero <= 10 && numero % 2 == 1) {
			System.out.println("Esta no intervalo, mas não é par");
		} else {
			System.out.println("O numero não esta no intervalo de 0 até 10");
		}
		scan.close();
	}

}
