package fundamentos.desafios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double total = 0;
		int notasValidas = 0;
		String parada = "";
		
		while(!parada.equalsIgnoreCase("-1")) {
			System.out.println("Digite uma nota: ");
			double nota = scan.nextDouble();
			
			if(nota >= 0.0 && nota <= 10.0) {
				System.out.println(nota);
				notasValidas++;
				total += nota;
				System.out.println("Deseja sair do programa? ");
				parada = scan.next();
			} else {
				System.out.println("Nota invalida");
				System.out.println("Deseja sair do programa? ");
				parada = scan.next();
			}	
		}
		
		System.out.printf("Obrigada por usar nosso sistemas! Tivemos %d nota valida e sua soma e: %.2f\n", notasValidas, total);
		scan.close();
		
		/*
		 * Resolucao do curso
		 * 
		 * 
		 * int quantidadeNotas = 0;
		 * double nota = 0;
		 * double total = 0;
		 * 
		 * while(nota != -1) {
		 * 	System.out.println("Informe a nota (ou -1 p/ sair): ");
		 * 	nota = scan.nextDouble();
		 * 
		 * 	if(nota <= 10.0 && nota >= 0.0){
		 * 		total += nota;
		 * 		quantidadeNotas++;
		 * 	} else if(nota != -1) {
		 * 		System.out.println("Nota Invalida!");
		 * 	}
		 * }
		 * 
		 * double media = total/quantidadeNotas;
		 * System.out.println("Media = "+media);
		 * 
		 * */

	}

}
