package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Ferrari(int velocidadeMax) {
		super(velocidadeMax);
		setDelta(15);
	}
	
	Ferrari() {
		this(315);
	}
	
	@Override
	public void ligarTurbo() {
		this.ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		this.ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		System.out.println("Ligando Ar");
		this.ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		System.out.println("Desligando Ar");
		this.ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		}else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;			
		}
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
