package fundamentos.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana");
		String dia = scan.next();
		
		scan.close();
		dia.toUpperCase();
		
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println("Dia 1 da semana.");
		} else if(dia.equalsIgnoreCase("segunda")) {
			System.out.println("Dia 2 da semana.");
		} else if(dia.equalsIgnoreCase("terca")) {
			System.out.println("Dia 3 da semana.");
		} else if(dia.equalsIgnoreCase("quarta")) {
			System.out.println("Dia 4 da semana.");
		} else if(dia.equalsIgnoreCase("quinta")) {
			System.out.println("Dia 5 da semana.");
		} else if(dia.equalsIgnoreCase("sexta")) {
			System.out.println("Dia 6 da semana.");
		} else if(dia.equalsIgnoreCase("sabado")) {
			System.out.println("Dia 7 da semana.");
		} else {
			System.out.println("Dia invalido.");
		}

	}

}
