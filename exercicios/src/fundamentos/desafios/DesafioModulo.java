package fundamentos.desafios;

import java.util.Scanner;

public class DesafioModulo {
	public static void main(String[] args) {
		// Ler dois numeros e e pedir para o usuario a operaçao
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double number1 = scan.nextDouble();
		
		System.out.println("Digite outro número: ");
		double number2 = scan.nextDouble();
		
		System.out.println("Digite a operacao desejada: ");
		String operacao = scan.next();
		
		double resultado = "+".equals(operacao) ? number1 + number2 : 0;
		resultado = "-".equals(operacao) ? number1 - number2 : resultado;
		resultado = "*".equals(operacao) ? number1 * number2 : resultado;
		resultado = "/".equals(operacao) ? number1 / number2 : resultado;
		resultado = "%".equals(operacao) ? number1 / number2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f ", 
				number1, operacao, number2, resultado);
		scan.close();
	}
}
