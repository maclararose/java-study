package livraria.teste;

import livraria.Autor;
import livraria.produtos.Ebook;
import livraria.produtos.Livro;
import livraria.produtos.LivroFisico;

public class CadastroDeLivros {
	
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("123.456.789-00");
		
		Livro livro = new LivroFisico(autor);
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setIsbn("978-85-66250-46-6");
//		livro.setValor(59.90);
//		livro.setAutor(autor);
		livro.aplicaDescontoDe(0.1);
		
		livro.mostrarDetalhes();
		
//		System.out.println("O nome do livro é: " + livro.nome);
//		System.out.println(livro.nome);
//		System.out.println(livro.descricao);
//		System.out.println(livro.isbn);
//		System.out.println(livro.valor);
		
		Autor outroAutor = new Autor();
		outroAutor.setNome("Paulo Silveira");
		outroAutor.setEmail("paulo.silveira@caelum.com.br");
		outroAutor.setCpf("233.455.677-88");
		
		Livro outroLivro = new Ebook(outroAutor);
		outroLivro.setNome("Lógica de Programação");
		outroLivro.setDescricao("Crie seus primeiros programas");
		outroLivro.setIsbn("978-85-66250-22-0");
//		outroLivro.valor = 59.90;
//		outroLivro.setAutor(outroAutor);
		
		outroLivro.mostrarDetalhes();
		
//		System.out.println("---------------------------------------------------------");
//		System.out.println(outroLivro.nome);
//		System.out.println(outroLivro.descricao);
//		System.out.println(outroLivro.isbn);
//		System.out.println(outroLivro.valor);
		
		Autor maria = new Autor();
//		maria.setEmail("maria@teste.com");
//		maria.setCpf("000.000.987-66");
		
		Livro livroMaria = new LivroFisico(maria);
		livroMaria.setNome("Qualquer coisa");
		livroMaria.setDescricao("é so um teste");
//		livroMaria.setIsbn("984-983-243-13");
//		livroMaria.setValor(39.90);
//		livroMaria.autor = maria; autor nulo por comentario
		
		livroMaria.mostrarDetalhes();
		
		Ebook ebook = new Ebook(maria);
		
		ebook.setNome("Java 8 Prático");
		
	}

}
