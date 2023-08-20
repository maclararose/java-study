package lista.aluno1;

import java.util.Scanner;

public class CalculaSalario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o salário fixo do funcionário:");
		double salarioFixo = scan.nextDouble();

		System.out.println("Digite quantos carros foram vendidos:");
		int qtdCarros = scan.nextInt();

		System.out.println("Digite o valor recebido por cada venda:");
		double comissaoFixa = scan.nextDouble();

		System.out.println("Digite o valor total das vendas:");
		double valorVendas = scan.nextDouble();

		double salarioFinal = salarioFixo + (qtdCarros * comissaoFixa + (valorVendas * 0.05));

		System.out.printf("O salario final é: R$ %.2f", salarioFinal);

		scan.close();

	}

}
