package array.exercicio;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		double[] notasAluno = new double[4];
		notasAluno[0] = 7.9;
		notasAluno[1] = 8;
		notasAluno[2] = 6.7;
		notasAluno[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAluno));;
		System.out.println(notasAluno);
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAluno.length; i++) {
			totalAlunoA += notasAluno[i];
		}
		System.out.println(totalAlunoA/notasAluno.length);
		
		double[] notasAlunoB = {6.9, 8.7, 9.9, 5.5};
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(totalAlunoB/notasAlunoB.length);
	}

}
