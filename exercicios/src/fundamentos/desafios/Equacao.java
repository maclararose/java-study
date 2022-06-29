package fundamentos.desafios;

import java.util.Scanner;

public class Equacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		int a = scan.nextInt();
		System.out.println("Digite o valor de B: ");
		int b = scan.nextInt();
		System.out.println("Digite o valor de C: ");
		int c = scan.nextInt();
		
		int delta = (b*b) - (4 * a *c);
		
		System.out.printf("A equacao: %dx² + %dx - %d = 0", a, b, c);
		System.out.println("\nO delta fica: " + delta);
		
		double x1 = (-b + Math.sqrt(delta)/(2*a));
		double x2 = (-b - Math.sqrt(delta)/(2*a));
		
		System.out.printf("O x1 da equacao e %.2f, o x2 e %.2f", x1, x2);
		
		scan.close();
	}
}
