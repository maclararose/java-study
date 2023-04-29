package fundamentos.controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String texto = "";

		do {
			System.out.println("Voce precisa falar as palavras magicas...");
			System.out.print("Quer sair? ");
			
			texto = scan.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigada!");
		
		scan.close();
	}

}
