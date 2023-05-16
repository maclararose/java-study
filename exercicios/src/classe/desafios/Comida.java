package classe.desafios;

public class Comida {
	String nomeComida;
	double taraComida;
	
	Comida(){
		nomeComida = "Hamburguer";
		taraComida = 0.380;
	}
	
	Comida(String nome, double peso) {
		this.nomeComida = nome;
		this.taraComida = peso;
	}
}
