package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(99.15);
		
		Arroz arroz = new Arroz(0.35);
		Feijao feijao = new Feijao(0.35);
		Sorvete sorvete = new Sorvete(0.30);
		Comida sorvete2 = new Sorvete(0.5); // possibilidade de uma váriavel generica receber tipo especifico, instancia um objt especif.
//		Comida comida = new Comida(0.5); não vai permitir que o usuario crie algo generico
		
		System.out.println(pessoa.getPeso());
		
//		pessoa.comer(comida);
		pessoa.comer(sorvete2);
		System.out.println(pessoa.getPeso());
		
		pessoa.comer(arroz);
		System.out.println(pessoa.getPeso());
		
		pessoa.comer(feijao);
		System.out.println(pessoa.getPeso());
		
		pessoa.comer(sorvete);
		System.out.println(pessoa.getPeso());
	}

}
