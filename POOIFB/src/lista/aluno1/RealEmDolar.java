package lista.aluno1;

import java.util.Scanner;

public class RealEmDolar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor que deseja converter:");
		double valorReal = scan.nextDouble();

		double valorDolar = valorReal / 5.05;

		System.out.printf("O valor em dolár é: U$ %.2f", valorDolar);

		scan.close();
	}
}
