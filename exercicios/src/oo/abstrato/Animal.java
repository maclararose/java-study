package oo.abstrato;

public abstract class Animal {
	public String respirar() {
		return "CO2";
	}
	
	public abstract String mover(); // só é possivel ter metodo abstrato em uma classe abstrata
}
