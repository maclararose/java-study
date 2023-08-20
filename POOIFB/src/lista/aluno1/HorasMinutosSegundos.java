package lista.aluno1;

import java.util.Scanner;

public class HorasMinutosSegundos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite as horas, minutos e segundos:");
		int horas = scan.nextInt();
		int minutos = scan.nextInt();
		int segundos = scan.nextInt();

		int conversaoTotal = (horas * 3600) + (minutos * 60) + segundos;

		System.out.println("Total de segundos: " + conversaoTotal);

		scan.close();
	}

}
