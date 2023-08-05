package livraria.teste;

import livraria.Autor;
import livraria.produtos.CarrinhoDeCompras;
import livraria.produtos.Ebook;
import livraria.produtos.LivroFisico;

public class RegistroDeVendas {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(ebook);
		carrinho.adiciona(fisico);
		
		System.out.println("Valor total da compra: " + carrinho.getTotal());

	}

}
