package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		Cliente c = new Cliente("Pedro");
		Cliente m = new Cliente("Maria");
		
		Produto p = new Produto("Caneta", 7.5);
		Produto p1 = new Produto("Caderno", 29.90);
		Produto p2 = new Produto("Borracha", 2.5);
				
		Compra compra = new Compra();
		Item item1 = new Item(p1, 2);
		Item item2 = new Item(p2, 4);
		Item item3 = new Item(p, 6);
		
		Compra compra2 = new Compra();
		compra2.itens.add(item3);
		compra2.itens.add(item1);
		
		compra2.adicionarItem(new Produto("Bolsa", 100), 2);
		compra2.adicionarItem("Estojo", 10, 3);
		
		compra.itens.add(item1);
		compra.itens.add(item2);
		compra.itens.add(item3);
		
		c.compras.add(compra);
		m.compras.add(compra2);
		
		System.out.println("O cliente: " + c.nome + " comprou R$" + c.obterValorTotal() + " em produtos.");
		System.out.println("O cliente: " + m.nome + " comprou R$" + m.obterValorTotal() + " em produtos.");
	}

}
