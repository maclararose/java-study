package oo.heranca.desafio;

public class Carro {
	int velocidadeAtual = 0;
	final int VELOCIDADE_MAXIMA;
	int delta = 5;
	protected int marcha = 1;
	
	Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	int acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
		return velocidadeAtual;
	}
	
	int frear() {
		if(velocidadeAtual < 0) {
			return 0;
		} else {
			return velocidadeAtual -= 2;
		}
	}
}
