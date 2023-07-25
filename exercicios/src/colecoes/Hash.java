package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Carlos"));
		usuarios.add(new Usuario("Lia"));
		usuarios.add(new Usuario("Maria"));
		
		boolean resultado = usuarios.contains(new Usuario("Maria"));
		System.out.println(resultado);

	}

}
