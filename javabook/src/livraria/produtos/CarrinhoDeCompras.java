package livraria.produtos;

public class CarrinhoDeCompras {
	private double total;
	private Produto[] produtos = new Produto[10];
	private int contador = 0;
	
//	Polimorfismo dinâmico -> há herança
	public void adiciona(Produto produto) {
		System.out.println("Adicionando: "+produto);
		this.produtos[contador] = produto;
		contador++;
		this.total += produto.getValor();
	}
	
	public void adiciona(Revista revista) {
		System.out.println("Adicionando: "+revista);
		revista.aplicaDescontoDe(0.05);
		this.total += revista.getValor();
	}
	
	public double getTotal() {
		return total;
	}

	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	
//	public void adiciona(Livro livro) {
//		Ebook ebook = (Ebook) livro;
//		ebook.getWaterMark(); // gerará um erro caso o objeto passado não seja um ebook
//	}
	
//	Polimorfismo por sobrecarga (estatico)
//	public void adiciona(LivroFisico livro) {
//		System.out.println("Adicionando: "+livro);
//	}
//	
//	public void adicionar(Ebook ebook) {
//		System.out.println("Adicionando: "+ebook);
//	}
}
