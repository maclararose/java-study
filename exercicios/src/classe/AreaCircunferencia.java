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
}
