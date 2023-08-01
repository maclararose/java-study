package javabook;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.valor = 59.90;
		
		System.out.println("Valor do livro sem desconto: "+livro.valor);
		
		if(!livro.aplicaDesconto(0.4)) {
			System.out.println("Desconto não pode ser maior que 30%!");
		} else {
			System.out.println("Valor com desconto: "+livro.valor);
		}

	}

}
