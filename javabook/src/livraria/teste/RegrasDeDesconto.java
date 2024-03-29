package livraria.teste;

import livraria.Autor;
import livraria.produtos.Ebook;
import livraria.produtos.Livro;
import livraria.produtos.LivroFisico;
import livraria.produtos.MiniLivro;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Roberson");
		Livro livro = new LivroFisico(autor);
		livro.setValor(59.90);
		
		System.out.println("Valor do livro impresso sem desconto: "+livro.getValor());
		
		if(!livro.aplicaDescontoDe(0.2)) {
			System.out.println("Desconto não pode ser maior que 30%!");
		} else {
			System.out.println("Valor do livro impresso com desconto: "+livro.getValor());
		}
		
		Ebook e = new Ebook(autor);
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
