package oo.heranca.desafio;

public class Ferrari extends Carro {
	Ferrari(int velocidadeMax) {
		super(velocidadeMax);
		delta = 350;
	}
	
	Ferrari() {
		this(315);
	}
	
//	@Override
//	int acelerar() {
//		int x = super.acelerar();
//		x += super.acelerar();
//		x += super.acelerar();
//		
//		return x;
//	}
}
