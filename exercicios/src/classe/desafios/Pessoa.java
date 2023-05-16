package classe.desafios;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(){
		nome = "Fulano";
		peso = 54.7;
	}
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	double comer(Comida c) {
		return this.peso + c.taraComida;
	}
}
