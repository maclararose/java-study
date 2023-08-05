package javabook;

public class LivroFisico extends Livro {
	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public LivroFisico() {
		
	}
	
	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}
	
	@Override
	public boolean aplicaDesconto(double porcentagem) {
		if (porcentagem > 0.3) {
			return false;
		}
		
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		System.out.println("Aplicando desconto no livro físico...");
		return true;
	}
}
