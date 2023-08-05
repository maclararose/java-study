package javabook;

public abstract class Livro {
	private String nome;
	private String descricao;
	private String isbn;
	private double valor;
	private Autor autor;
	
	public Livro(Autor autor) {
		this();
		setAutor(autor); // mesma coisa de this.autor = autor
	}
	
	public Livro() {
		setIsbn("000-00-00000-00-0");
	}
	
//	public Livro(String nome, String descricao, String isbn, double valor, Autor autor) {
//		super();
//		this.nome = nome;
//		this.descricao = descricao;
//		this.isbn = isbn;
//		this.valor = valor;
//		this.autor = autor;
//	}

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
	
	void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro:");
		System.out.println("Nome: "+this.nome);
		System.out.println("Descrição: "+this.descricao);
		System.out.println("ISBN: "+this.isbn);
		System.out.println("Valor: R$"+this.valor);
		if(this.temAutor()) {
			autor.mostrarDetalhes();
		}
		System.out.println("-------------------------------------------------");
	}
	
	public abstract boolean aplicaDesconto(double porcentagem);
	
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
