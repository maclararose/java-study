package lista.aluno1;

import java.util.Scanner;

public class CustoCarro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o custo de fabricação do carro:");
		double custo = scan.nextDouble();

		double custoConsumidor = custo * 1.73;

		System.out.println("O custo final é:" + custoConsumidor);

		scan.close();

	}

}
