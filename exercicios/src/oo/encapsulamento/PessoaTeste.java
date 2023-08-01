package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Pedro", "Amoedo", -50);
		// p.idade = -30; // não queremos isso
		// p.alterarIdade(230); // o código está encapsulado, mas a idade está invalida
		
		// System.out.println(p.retornarIdade());
		
		// p.idade = -30; // não queremos isso
		p.setIdade(230); // o código está encapsulado, mas a idade está invalida
		
		System.out.println(p.getNome());
		System.out.println(p.getIdade());
		System.out.println(p); // toString
		System.out.println(p.getNomeCompleto()); // atributo calculado

	}

}
