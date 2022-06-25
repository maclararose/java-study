package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (F - 32) * 5/9 = C
		
		final int SUBTRACAO = 32;
		final double DIVISAO = 5.0/9.0;
		
		double fahrenheit = 76;
		double conversao = (fahrenheit - SUBTRACAO) * DIVISAO;
		
		System.out.println("A temperatura em Celsius e: " + conversao + "°C");
		
		fahrenheit = 62;
		conversao = (fahrenheit - SUBTRACAO) * DIVISAO;
		
		System.out.println("A temperatura em Celsius e: " + conversao + "°C");
	}
}
