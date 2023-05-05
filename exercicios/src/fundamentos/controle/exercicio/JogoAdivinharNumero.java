package fundamentos.controle.exercicio;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinharNumero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int continuar;
		int numeroRandom;
		int tentativas;
		int numero;
		
		do {
			System.out.println("Sorteando um numero entre 0 e 100...");
			Random numeroAleatorio = new Random();
			numeroRandom = numeroAleatorio.nextInt(101);
			
			System.out.println("Começou! Tente me vencer.");
			tentativas = 0;
			
			do {
				tentativas++;
				
				System.out.printf("Tentativa %d\n: ", tentativas);
				numero = scan.nextInt();
				
				if(numero > numeroRandom) {
					System.out.printf("O numero sorteado e menor que %d", numero);
				} else if (numero < numeroRandom) {
					System.out.printf("O numero sorteado e maior que %d", numero);
				} else {
					System.out.printf("Parabens! Voce acertou o numero %d em %d tentativas!", numeroAleatorio,tentativas);
					break;
				}
			} while(tentativas != 10);
			System.out.println("Digite 0 para sair ou qualquer outro numero para continuar: ");
			continuar = scan.nextInt();
		} while(continuar != 0);
		scan.close();
	}

}
