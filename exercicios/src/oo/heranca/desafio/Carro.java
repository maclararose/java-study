package oo.heranca.desafio;

public class Carro {
	public int velocidadeAtual = 0;
	final int VELOCIDADE_MAXIMA;
	private int delta = 5;
	protected int marcha = 1;
	
	Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public int acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}
		return velocidadeAtual;
	}
	
	public int frear() {
		if(velocidadeAtual < 0) {
			return 0;
		} else {
			return velocidadeAtual -= 2;
		}
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
