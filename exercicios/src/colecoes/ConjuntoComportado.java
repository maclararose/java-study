package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {

	public static void main(String[] args) {
		Set<String> lista = new HashSet<>(); // operador dimond
		
		// Dados Homogeneos
		lista.add("Maria");
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Pedro");
		lista.add("Lucas");
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
	}

}
