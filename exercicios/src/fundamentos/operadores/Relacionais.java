package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		
//	Comportamento estranho
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b); // infix
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(3 <= 7);
		System.out.println(30 != 7);
		
		boolean bomComportamento = true;
		double nota = 9.3;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
//	Codigo da posicao da letra na tabela unicode
		System.out.println('\u0097');
	}
}
