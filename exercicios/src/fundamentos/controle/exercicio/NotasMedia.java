package fundamentos.controle.exercicio;

import java.util.Scanner;

public class NotasMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		scan.close();
		
		double mediaFinal = (nota1+nota2)/2;
		
		if(mediaFinal >= 7.0 && mediaFinal <= 10.0) {
			System.out.println("Aprovado: " + mediaFinal);
		} else if (mediaFinal >= 4.0 && mediaFinal < 7.0) {
			System.out.println("Recuperação: " + mediaFinal);
		} else {
			System.out.println("Reprovado: " + mediaFinal);
		}

	}

}
