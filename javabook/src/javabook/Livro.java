package javabook;

public class Livro {
	String nome;
	String descricao;
	String isbn;
	double valor;
	Autor autor;
	
	void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro:");
		System.out.println("Nome: "+nome);
		System.out.println("Descrição: "+descricao);
		System.out.println("ISBN: "+isbn);
		System.out.println("Valor: R$"+valor);
		if(this.temAutor()) {
			autor.mostrarDetalhes();
		}
		System.out.println("-------------------------------------------------");
	}
	
	public void aplicaDesconto(double porcentagem) {
		this.valor -= this.valor * porcentagem;
	}
	
	boolean temAutor() {
		return this.autor != null;
	}
}
