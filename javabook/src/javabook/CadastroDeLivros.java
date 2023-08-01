package javabook;

public class CadastroDeLivros {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.nome = "Rodrigo Turini";
		autor.email = "rodrigo.turini@caelum.com.br";
		autor.cpf = "123.456.789-00";
		
		Livro livro = new Livro();
		livro.nome = "Java 8 Prático";
		livro.descricao = "Novos recursos da linguagem";
		livro.isbn = "978-85-66250-46-6";
		livro.valor = 59.90;
		livro.autor = autor;
		livro.aplicaDesconto(0.1);
		
		livro.mostrarDetalhes();
		
//		System.out.println("O nome do livro é: " + livro.nome);
//		System.out.println(livro.nome);
//		System.out.println(livro.descricao);
//		System.out.println(livro.isbn);
//		System.out.println(livro.valor);
		
		Autor outroAutor = new Autor();
		outroAutor.nome = "Paulo Silveira";
		outroAutor.email = "paulo.silveira@caelum.com.br";
		outroAutor.cpf = "233.455.677-88";
		
		Livro outroLivro = new Livro();
		outroLivro.nome = "Lógica de Programação";
		outroLivro.descricao = "Crie seus primeiros programas";
		outroLivro.isbn = "978-85-66250-22-0";
		outroLivro.valor = 59.90;
		outroLivro.autor = outroAutor;
		
		outroLivro.mostrarDetalhes();
		
//		System.out.println("---------------------------------------------------------");
//		System.out.println(outroLivro.nome);
//		System.out.println(outroLivro.descricao);
//		System.out.println(outroLivro.isbn);
//		System.out.println(outroLivro.valor);
		
//		Autor maria = new Autor();
//		maria.email = "maria@teste.com";
//		maria.cpf = "000.000.987-66";
		
		Livro livroMaria = new Livro();
		livroMaria.nome = "Qualquer coisa";
		livroMaria.descricao = "é so um teste";
		livroMaria.isbn = "984-983-243-13";
		livroMaria.valor = 39.90;
//		livroMaria.autor = maria; autor nulo por comentario
		
		livroMaria.mostrarDetalhes();
		
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();

	}

}
