package javabook;

public class RegistroDeVendas {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven Development");
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(ebook);
		carrinho.adiciona(fisico);

	}

}
