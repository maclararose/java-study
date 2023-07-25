package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Clara"));
		lista.add(new Usuario("Pedro"));
		lista.add(new Usuario("Marcelo"));
		lista.add(new Usuario("Roberto"));
		
		System.out.println("----------------------------------------------------------------");
		System.out.println(lista.get(3)); // acessar objeto pelo indice
		System.out.println("----------------------------------------------------------------");
		
		
		System.out.println(">>>>>> "+lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Tem esse objeto? "+lista.contains(new Usuario("Marcelo")));
		System.out.println("Tem esse objeto? "+lista.contains(u1)); // passagem de referencia
		System.out.println("----------------------------------------------------------------");
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
	}

}
