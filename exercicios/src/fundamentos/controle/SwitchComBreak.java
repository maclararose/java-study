package fundamentos.controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		System.out.println("Digite uma nota: ");
		Scanner scan = new Scanner(System.in);

		int nota = scan.nextInt();
		scan.close();

		String conceito = "";

		switch (nota) {
		case 10:
		case 9:
			conceito = "A";
			break;
		case 8:
		case 7:
			conceito = "B";
			break;
		case 6:
		case 5:
			conceito = "C";
			break;
		case 4:
		case 3:
			conceito = "D";
		case 2:
		case 1:
		case 0:
			conceito = "F";
			break;
		default:
			conceito = "Nota não valida";
		}
		System.out.println("Conceito: " + conceito);
	}

}
