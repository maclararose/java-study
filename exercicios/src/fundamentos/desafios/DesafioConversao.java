package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salario: ");
		String value1 = scan.nextLine();
		
		System.out.println("Digite o segundo salario: ");
		String value2 = scan.nextLine();
		
		System.out.println("Digite o terceiro salario: ");
		String value3 = scan.nextLine();
		
		value1 = value1.replace(",", ".");
		value2 = value2.replace(",", ".");
		value3 = value3.replace(",", ".");
		
		double media = (Double.parseDouble(value1) + Double.parseDouble(value2) + Double.parseDouble(value3))/3;
		
		System.out.println("A media e: " + media);
		
		scan.close();
	}
}
