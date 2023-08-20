package lista.aluno1;

import java.util.Scanner;

public class MaiorDeIdade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a idade:");
		int idade = scan.nextInt();

		System.out.println(idade >= 18 ? "Maior de idade" : "Menor de idade");

		scan.close();

	}

}
