package array.exercicio;

import java.util.Scanner;

public class DesafioMediaAluno {

	public static void main(String[] args) {
		// Calcular a media de notas de um aluno
		// o usuario que vai passar as informacoes
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas notas voce quer informar?");
		int qtdNotas = scan.nextInt();
		
		double[] arrayNotas = new double[qtdNotas];
		
		for (int i = 0; i < arrayNotas.length; i++) {
			System.out.printf("Digite a nota %d\n", i+1);
			arrayNotas[i] = scan.nextDouble();
		}
		
		double soma = 0;
		for (int i = 0; i < arrayNotas.length; i++) {
			soma += arrayNotas[i];
		}
		
		System.out.println("A media e: " + soma/arrayNotas.length);
		
		scan.close();
		
	}

}
