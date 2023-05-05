package fundamentos.controle.exercicio;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int maior = 0;
		int cont =0;
		
		do {
			System.out.println("Digite um valor:");
			int valor = scan.nextInt();
			
			if(valor > maior) {
				maior = valor;
			}
			cont++;
		} while(cont != 10);
		System.out.println("O maior valor foi: "+ maior);
		scan.close();
	}

}
