package classe.desafios;

public class PrimeiroTrauma {
	int a = 3;
	static int b = 6;
	
	public static void main(String[] args) {
		PrimeiroTrauma a = new PrimeiroTrauma();
		System.out.println(a.a);
		System.out.println(b); // algo estatico consegue acessar outro estatico
	}

}
