package javabook;

public class CarrinhoDeCompras {
	private double total;
	
//	Polimorfismo dinâmico -> há herança
	public void adiciona(Livro livro) {
		System.out.println("Adicionando: "+livro);
		livro.aplicaDesconto(0.16);
		this.total += livro.getValor();
	}
	
	public double getTotal() {
		return total;
	}
	
//	public void adiciona(Livro livro) {
//		Ebook ebook = (Ebook) livro;
//		ebook.getWaterMark(); // gerará um erro caso o objeto passado não seja um ebook
//	}
	
//	Polimorfismo por sobrecarga (estatico)
//	public void adiciona(LivroFisico livro) {
//		System.out.println("Adicionando: "+livro);
//	}
//	
//	public void adicionar(Ebook ebook) {
//		System.out.println("Adicionando: "+ebook);
//	}
}