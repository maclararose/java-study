package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3;
		final double PI = 3.14159;

		double area = PI * (raio * raio);
		
		System.out.println(area);
		
		raio = 3.4;
		area = PI * (raio * raio);
		System.out.println("A area e:" + area);
	}
}
