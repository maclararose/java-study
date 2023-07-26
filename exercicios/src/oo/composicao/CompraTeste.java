package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra c = new Compra();
		c.cliente = "Pedro";
		c.itens.add(new Item("Livros", 2, 39.90));
		c.itens.add(new Item("Caneta", 20, 7.45));
		c.itens.add(new Item("Caderno", 3, 18.79));
		
		System.out.println(c.itens.size());
		System.out.println(c.obterValorTotal());

	}

}
