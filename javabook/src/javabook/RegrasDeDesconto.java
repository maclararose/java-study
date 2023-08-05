package javabook;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		Livro livro = new LivroFisico();
		livro.setValor(59.90);
		
		System.out.println("Valor do livro impresso sem desconto: "+livro.getValor());
		
		if(!livro.aplicaDescontoDe(0.2)) {
			System.out.println("Desconto não pode ser maior que 30%!");
		} else {
			System.out.println("Valor do livro impresso com desconto: "+livro.getValor());
		}
		
		Ebook e = new Ebook();
		e.setValor(29.90);
		System.out.println("Valor do ebook sem desconto: "+e.getValor());
		
		if(!e.aplicaDescontoDe(0.15)) {
			System.out.println("Desconto não pode ser maior que 15%!");
		} else {
			System.out.println("Valor do ebook com desconto: "+e.getValor());
		}
		
		Autor generico = new Autor();
		generico.setNome("Augusto Cury");
		
		MiniLivro mini = new MiniLivro(generico);
		mini.setValor(39.90);
		
		if(!mini.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto do llivro não pode ser maior que 30%");
		} else {
			System.out.println("Valor do livro com desconto: " + mini.getValor());
		}

	}

}
