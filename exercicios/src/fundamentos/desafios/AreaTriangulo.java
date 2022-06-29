package fundamentos.desafios;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a base: ");
		double base = scan.nextDouble();
		System.out.println("Digite a altura: ");
		double altura = scan.nextDouble();
		
		double resultado = base * altura / 2;
		
		System.out.println("Area do triangulo: " + resultado);
		
		scan.close();
	}
}
