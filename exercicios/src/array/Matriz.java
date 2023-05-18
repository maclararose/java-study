package array;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos alunos?");
		int qtdAlunos = scan.nextInt();
		
		System.out.println("Quantas notas por aluno?");
		int qtdNotas = scan.nextInt();
		
		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];
		
		double total = 0;
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d: \n", j, i);
				notasDaTurma[i][j] = scan.nextDouble();
				total += notasDaTurma[i][j];
			}
		}
		
		for(double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		double media = total / (qtdAlunos+qtdNotas);
		System.out.println("A media da turma e: "+media);
		
		scan.close();

	}

}
