package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // !condicao2 -> Verdadeiro, logo a expressao seria verdadeira
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1); // !!condicao1 -> Verdadeiro, ja que o não nega na negação
		System.out.println(!condicao2);
		
		// Tabela verdade
		/* Condicao E
		 * V	V	->	V
		 * V	F	->	F
		 * F	V	->	F
		 * F	F	->	F
		 * 
		 * Condicao OU
		 * V	V	->	V
		 * V	F	->	V
		 * F	V	->	V
		 * F	F	->	F
		 * 
		 * Condicao XOR
		 * V	V	->	F
		 * V	F	->	V
		 * F	V	->	V
		 * F	F	->	F
		 * 
		 * Condicao NOT
		 * NOT V	->	F
		 * NOT F	->	V
		 * */
		System.out.println("Tabela verdade E");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && true);
		
		System.out.println("Tabela verdade OU");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("Tabela verdade XOR");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("Tabela verdade do NOT");
		System.out.println(!true);
		System.out.println(!!true);
		System.out.println(!false);
		System.out.println(!!false);
	}
}