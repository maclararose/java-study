package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		// Metódo anonimo no java | Lambda expression
		// Assim não é necessário ficar criando várias classes
		// Mas isso é só possivel porque na Interface tem somente um unico metódo
		
		Calculo calculo = (x, y) -> {
			return x+y;
		};

		System.out.println(calculo.executar(16, 20));
		
		calculo = (x, y) -> x * y; // return está implicito além de que sem o par de chaves diz que terá apenas uma sentença de código
		
		System.out.println(calculo.executar(3, 5));
	}

}
