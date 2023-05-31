package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Caractere
		
		System.out.println(conjunto.size());
		
		conjunto.add("Teste");
		conjunto.add('x');
		
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.contains('x'));

	}

}
