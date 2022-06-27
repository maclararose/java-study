package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++;
		System.out.println(a);
		
		a--;
		System.out.println(a);
		
		++b;
		System.out.println(b);
		
		--b;
		System.out.println(b);
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == b--); // true
		System.out.println(a == b); // false
		System.out.println(a); // 2
		System.out.println(b); // 1
	}
}
