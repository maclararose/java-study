package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Maria clara";
		s = s.toUpperCase();
		s = s.replace("C", "B");
		s = s.concat("!!!"); 
		System.out.println(s);
		
		String x = "Ola";
		System.out.println(x.toUpperCase());
		
		String y = "Bom dia X"
				.replace("X", "Mary")
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(y);
		
		// Tipos primitivos nao tem o operador .
		int a = 2;
//		a.
		System.out.println(a);
	}
}
