package oo.heranca.desafio;

public class Ferrari extends Carro {
	@Override
	int acelerar() {
		int x = super.acelerar();
		x += super.acelerar();
		x += super.acelerar();
		
		return x;
	}
}
