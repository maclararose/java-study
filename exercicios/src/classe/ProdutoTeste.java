package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto.desconto = 0.5;
		
		Produto product = new Produto();
		product.nome = "Notebook";
		product.preco = 4300.00;
				
		System.out.println(product.nome + " valor com desconto: " + product.precoComDesconto());
		System.out.println("Valor sem desconto: " + product.preco);
		
		var product2 = new Produto();
		product2.nome = "Celular";
		product2.preco = 1800.00;
		
		System.out.println(product2.nome + " valor com desconto: " + product2.precoComDesconto());
		System.out.println("Valor sem desconto: " + product2.preco);
		
		var product3 = new Produto("Geladeira", 2398);
		
		System.out.println(product3.nome + " valor com desconto: " + product3.precoComDesconto());
		System.out.println("Valor sem desconto: " + product3.preco);
		
		Produto pEspecial = new Produto();
		pEspecial.nome = "Kit de sombras";
		pEspecial.preco = 25;
		
		System.out.println(pEspecial.nome+" valor com desconto: "+pEspecial.precoComDesconto());
		System.out.println("Valor sem desconto: " + pEspecial.preco);
		
		System.out.println(Produto.precoComDescontoEspecial(100, 0.3));
		
		double mediaCarrinho = (product.preco + product2.preco + product3.preco + pEspecial.preco)/4;
		System.out.printf("A media do carrinho de compras é R$%.2f\n", mediaCarrinho);
	}

}
