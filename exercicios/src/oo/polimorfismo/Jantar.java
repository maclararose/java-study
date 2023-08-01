package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(99.15);
		
		Arroz arroz = new Arroz(0.35);
		Feijao feijao = new Feijao(0.35);
		Sorvete sorvete = new Sorvete(0.30);
		
		System.out.println(pessoa.getPeso());
		
		pessoa.comer(arroz);
		System.out.println(pessoa.getPeso());
		
		pessoa.comer(feijao);
		System.out.println(pessoa.getPeso());
		
		pessoa.comer(sorvete);
		System.out.println(pessoa.getPeso());
	}

}
