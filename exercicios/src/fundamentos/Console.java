package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom ");
		System.out.print("dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d \n",
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salario: %.1f%n", 1234.348596);
		System.out.printf("Nome: %s%n", "João");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = scan.nextLine();
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		
		System.out.printf("Seu nome é: %s %s e sua idade é %d", nome, sobrenome, idade);
		
		scan.close();
	}
}
