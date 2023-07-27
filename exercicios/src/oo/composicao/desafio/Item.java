package oo.composicao.desafio;

public class Item {
	int qtd;
	Produto produto;
	Compra compra = new Compra();
	
	Item(Produto produto, int qtd) {
		this.produto = produto;
		this.qtd = qtd;
	}
}
