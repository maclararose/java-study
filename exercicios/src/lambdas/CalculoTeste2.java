package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {

	public static void main(String[] args) {
		// Usando Lambdas Expressions do proprio Java
		
		// Não permite: int -> Double
		// Permite: double -> Double
		
		BinaryOperator<Double> calc = (x, y) -> {
			return x + y;
		};
		
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x, y) ->  x * y;
		System.out.println(calc.apply(3.0, 4.0));
	}

}
