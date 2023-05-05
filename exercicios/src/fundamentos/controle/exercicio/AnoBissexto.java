package fundamentos.controle.exercicio;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o ano: ");
		int ano = scan.nextInt();
		scan.close();
		
		if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
			System.out.printf("O ano %d é bissexto", ano);
		} else {
			System.out.printf("O ano %d nao é bissexto", ano);
		}
		

	}

}
