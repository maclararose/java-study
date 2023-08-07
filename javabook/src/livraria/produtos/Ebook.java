package livraria.produtos;

import livraria.Autor;

public class Ebook extends Livro implements Produto {
	private String waterMark;
	
	public Ebook(Autor autor) {
		super(autor);
	}
	
	public String getWaterMark() {
		return waterMark;
	}
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		/*
		 * se o atributo for private mantemos o encapsulamento, mas caso necessário ser modificado
		 * para usar em outros códigos, podemos modifica-lo para protected
		 * e poderiamos acessa-lo diretamente nas classes filhas
		 * como ficaria:
		 * 
		 * this.valor -= this.valor * porcentagem;
		 * 
		 * Para manter o encapsulamento, que é o nosso caso, fariamos como está o código.
		 * outra maneira de aplicar o encapsulamento e retornar o valor para o metódo é o seguinte:
		 * 
		 * return super.aplicaDesconto(porcentagem);
		 * */ 
		
		if(porcentagem > 0.15) {
			return false;
		}
		
		double desconto = this.getValor() * porcentagem;
		
		this.setValor(this.getValor() - desconto);
		System.out.println("aplicando desconto no Ebook");
		return true;
	}
	
}
