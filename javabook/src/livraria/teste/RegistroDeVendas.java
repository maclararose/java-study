package livraria.teste;

import livraria.Autor;
import livraria.produtos.CarrinhoDeCompras;
import livraria.produtos.Ebook;
import livraria.produtos.LivroFisico;
import livraria.produtos.Produto;

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
//		carrinho.adiciona(ebook);
//		carrinho.adiciona(fisico);
//		carrinho.adiciona(ebook);
//		carrinho.adiciona(fisico);
//		carrinho.adiciona(ebook);
//		carrinho.adiciona(fisico);
//		carrinho.adiciona(ebook);
//		carrinho.adiciona(fisico);
		
		Produto[] produtos = carrinho.getProdutos();
		
		for(Produto p: produtos) {
			try {
				System.out.println(p.getValor());
			} catch(NullPointerException e) {
				System.out.println("A posição do objeto está nulo");
			}
		}
		
		// Estudo de API e Object
		
//		Object[] produtoss = carrinho.getProdutos();

//		for(Object object : produtoss) {
//			try {
//				Produto moldado = (Produto) object;
//				System.out.println(moldado.getValor());
//			} catch(Exception x) {
//				System.out.println("O objeto passado não implementa Produto");
//			}
//		}
		
		// Estudo de try e catch
		
//		for(int i = 0; i <= produtos.length; i++) {
//			try {
//				Produto produto = produtos[i];
//				if(produto != null) {
//					System.out.println(produto.getValor());
//				}				
//			} catch (Exception e) {
//				System.out.println("deu expection no indice: " + e);
//				e.printStackTrace();
//			}
//		}
		System.out.println("Fui executado!!!");
		
		System.out.println("Valor total da compra: " + carrinho.getTotal());
		
		// São a mesma coisa graças a classe Object
		System.out.println(ebook);
		System.out.println(ebook.toString());

	}

}
