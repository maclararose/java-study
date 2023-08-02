package javabook;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setValor(59.90);
		
		System.out.println("Valor do livro impresso sem desconto: "+livro.getValor());
		
		if(!livro.aplicaDesconto(0.2)) {
			System.out.println("Desconto não pode ser maior que 30%!");
		} else {
			System.out.println("Valor do livro impresso com desconto: "+livro.getValor());
		}
		
		Ebook e = new Ebook();
		e.setValor(29.90);
		System.out.println("Valor do ebook sem desconto: "+e.getValor());
		
		if(!e.aplicaDesconto(0.15)) {
			System.out.println("Desconto não pode ser maior que 15%!");
		} else {
			System.out.println("Valor do ebook com desconto: "+e.getValor());
		}

	}

}
