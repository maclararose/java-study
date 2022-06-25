package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		a = 12;
		System.out.println(a); // uma variavel do tipo double consegue receber valores inteiros sem problema
//		a = "...";
		
		var b = 4.5; // Quando var é criado já deve ser inicializado e o valor vai definir o tipo de variavel;
		System.out.println(b);
		
		var c = "Texto teste";
		System.out.println(c);
		
		c = "Recebe outro texto";
		System.out.println(c);
		
//		c = 4.5;
		
		double d;
		d = 3.56;
		System.out.println(d);
		
		var e = 123.45;
		System.out.println(e);
		
		var f = 12; // inteiro
//		f = 12.01; não da para transformar inteiro em double
		System.out.println(f);
	}
}