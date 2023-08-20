package lista.aluno1;

import java.util.Scanner;

public class NotaPonderada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite as três notas do aluno:");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();

		double mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

		System.out.println("A media final é: " + mediaPonderada);

		scan.close();

	}

}
