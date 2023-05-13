package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto product = new Produto();
		product.nome = "Notebook";
		product.preco = 4300.00;
		product.desconto = 0.15;
		
		double precoFinal = product.precoComDesconto();
		
		System.out.println(product.nome);
		System.out.println(product.preco);
		System.out.println(product.desconto);
		System.out.println(precoFinal);
		
		var product2 = new Produto();
		product2.nome = "Celular";
		product2.preco = 1800.00;
		product2.desconto = 0.35;
		
		double precoFinal2 = product2.precoComDesconto();
		
		System.out.println(product2.nome);
		System.out.println(product2.preco);
		System.out.println(product2.desconto);
		System.out.println(precoFinal2);
		
		var product3 = new Produto("Geladeira", 2398, 0.25);
		
		double precoFinal3 = product3.precoComDesconto();
		
		System.out.println(product3.nome);
		System.out.println(product3.preco);
		System.out.println(product3.desconto);
		System.out.println(precoFinal3);
		
		double mediaCarrinho = (precoFinal + precoFinal2 + precoFinal3)/3;
		System.out.printf("A media do carrinho de compras é R$%.2f\n", mediaCarrinho);
	}

}
