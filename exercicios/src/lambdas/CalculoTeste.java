package lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		Calculo calculo = new Somar(); // variavel generica instanciando objeto especifico
		System.out.println(calculo.executar(3,7));
				
		calculo = new Multiplicar();
		System.out.println(calculo.executar(3, 5));

	}

}
