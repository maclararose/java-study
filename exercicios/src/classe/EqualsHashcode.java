package classe;

public class EqualsHashcode {

	public static void main(String[] args) {
		Usuario u = new Usuario();
		u.nome = "Maria";
		u.email = "maria@gmail.com";
		
		Usuario u0 = new Usuario();
		u0.nome = "Maria";
		u0.email = "maria@gmail.com";
		
		Usuario u1 = new Usuario();
		u1.nome = "Ana";
		u1.email = "ana@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro";
		u2.email = "pedro@gmail.com";
		
		System.out.println(u == u0); // enderecos de memoria diferentes
		System.out.println(u.equals(u0));
		System.out.println(u0.equals(u));

	}

}
