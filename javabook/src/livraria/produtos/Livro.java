package livraria.produtos;

import livraria.Autor;
import livraria.exception.AutorNullException;

public abstract class Livro implements Promocional {
	private String nome;
	private String descricao;
	private String isbn;
	private double valor;
	private Autor autor;
	
	public Livro(Autor autor) {
		if (autor == null) {
			throw new AutorNullException("O Autor do Livro não pode ser nulo"); // criamos nosso proprio Exception
		}
		setAutor(autor); // mesma coisa de this.autor = autor
		setIsbn("000-00-00000-00-0");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro:");
		System.out.println("Nome: "+getNome());
		System.out.println("Descrição: "+getDescricao());
		System.out.println("ISBN: "+getIsbn());
		System.out.println("Valor: R$"+getValor());
		if(this.temAutor()) {
			autor.mostrarDetalhes();
		}
		System.out.println("-------------------------------------------------");
	}
	
	public abstract boolean aplicaDescontoDe(double porcentagem);
	
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
//	void adicionaValor(double valor) {
//		this.valor = valor;
//	}
//	
//	double retornaValor() {
//		return this.valor;
//	}
	
	boolean temAutor() {
		return this.autor != null;
	}
}
