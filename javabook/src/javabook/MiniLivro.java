package javabook;

public class MiniLivro extends Livro {
	public MiniLivro(Autor autor) {
		super(autor);
	}
	
	@Override
	public boolean aplicaDesconto(double porcentagem) {
		return false;
	}
}
