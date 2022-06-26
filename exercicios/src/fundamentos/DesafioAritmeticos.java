package fundamentos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a, 3);
//		
//		System.out.println(b);
		
//		Minha resolução
		
		double formula1 = Math.pow((6 * (3 + 2)), 2)/(3*2);
		double formula2 = Math.pow(((1-5)*(2-7)/2), 2);
		double formula3 = Math.pow((formula1 - formula2), 3)/Math.pow(10, 3);
		
		System.out.println(formula3);
		
//		Resolução da aula
		
		double numA = Math.pow((6 * (3 + 2)), 2);
		double numB = Math.pow((1-5)*(2-7), 2);
		double denA = 3 * 2;
		double denB = Math.pow(2, 2);
		
		double superiorA = numA/denA;
		double superiorB = numB/denB;
		
		double superior = superiorA - superiorB;
		double inferior = Math.pow(10, 3);
		
		double resultado = Math.pow(superior, 3)/inferior;
		
		System.out.println(resultado);
	}
}
