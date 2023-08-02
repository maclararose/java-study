package lambdas;

@FunctionalInterface
public interface Calculo {
	double executar(double a, double b);
	
	default String retornaString() {
		return "Provando que uma Interface Funcional precisa de apenas 1 metodo abstrato";
	}
	
	static String metodoEstatico() {
		return "Também pode ter metodos estaticos e default"; // funcao relacionada apenas a Interface
	}
}
