package oo.abstrato;

public class Cachorro extends Mamifero {
	@Override
	public String mover() {
		return "Usando as patas";
	}
	
	@Override
	public String mamar() {
		return "Bebe leite quando filhote";
	}
	
	public String latir() {
		return "O cachorro late";
	}
}
