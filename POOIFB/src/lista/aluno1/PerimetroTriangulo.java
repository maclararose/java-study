package lista.aluno1;

import java.util.Scanner;

public class PerimetroTriangulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite os três lados do triangulo:");
		int ladoA = scan.nextInt();
		int ladoB = scan.nextInt();
		int ladoC = scan.nextInt();

		int perimetro = ladoA + ladoB + ladoC;

		System.out.println("O perimetro total é: " + perimetro);

		scan.close();

	}

}
