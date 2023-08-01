package javabook;

public class Livro {
	String nome;
	String descricao;
	String isbn;
	private double valor;
	Autor autor;
	
	Livro() {
		System.out.println("Novo livro criado!");
	}
	
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
	
	public boolean aplicaDesconto(double porcentagem) {
		if(porcentagem > 0.3) {
//			System.out.println("O desconto não pode ser maior que 30%");
			return false;
		}
		
		this.valor -= this.valor * porcentagem;
		return true;
	}
	
	boolean temAutor() {
		return this.autor != null;
	}
}
