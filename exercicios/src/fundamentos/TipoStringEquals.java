package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		String s = new String("2");
		
		System.out.println("2" == s);
		System.out.println("2".equals(s)); // avalia o conteudo de strings
		
		Scanner scan = new Scanner(System.in);
		
		String s2 = scan.nextLine().trim();
		
		System.out.println("2" == s2);
		
//	Comparar strings sempre utilizando Equals
		System.out.println("2".equals(s2));
		
		scan.close();
	}
}
