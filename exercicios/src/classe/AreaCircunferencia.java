package classe;

public class AreaCircunferencia {
	double raio;
	final static double PI = 3.14;
	
	AreaCircunferencia(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return (raio * raio) * PI; 
	}
	
	static double area(double raio) {
		return Math.pow(raio, 2) * PI;
	}
}
