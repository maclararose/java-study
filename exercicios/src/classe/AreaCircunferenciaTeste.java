package classe;

public class AreaCircunferenciaTeste {

	public static void main(String[] args) {
		AreaCircunferencia circ = new AreaCircunferencia(3.9);
		
		AreaCircunferencia circ1 = new AreaCircunferencia(6.9);
		
//		AreaCircunferencia.PI = 0.25; >>> não funciona por ser constante
		
		System.out.println(circ.area());
		System.out.println(circ1.area()); // metodo que pertence a instancia	
		System.out.println(AreaCircunferencia.PI);
		System.out.println(AreaCircunferencia.area(23)); // metodo que pertence a classe 

	}

}
