package fundamentos.controle.exercicio;

import java.util.Scanner;

public class NumeroPrimoSwitch {

	public static void main(String[] args) {
		int contador = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero");

		int numero = scan.nextInt();
		scan.close();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}

		switch (contador) {
		case 0:
			System.out.printf("O numero %d e primo", numero);
			break;
		default:
			System.out.printf("O numero %d nao e primo", numero);
		}

	}

}
