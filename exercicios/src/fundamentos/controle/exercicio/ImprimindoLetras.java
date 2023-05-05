package fundamentos.controle.exercicio;

import java.util.Scanner;

public class ImprimindoLetras {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String palavra = scan.next();
		char letras[] = palavra.toCharArray();
		scan.close();
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		scan.close();
	}

}
