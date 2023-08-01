package oo.abstrato;

public class TesteAbstrato {

	public static void main(String[] args) {
		Animal a = new Cachorro();
		System.out.println(a.mover());
		System.out.println(a.respirar());
		System.out.println("-------------------------------");
		
		Mamifero b = new Cachorro();
		System.out.println(b.mamar());
		System.out.println(b.mover());
		System.out.println(b.respirar());
		System.out.println("-------------------------------");
		
		Cachorro c = new Cachorro(); // classe concreta
		System.out.println(c.mamar());
		System.out.println(c.mover());
		System.out.println(c.respirar());
		System.out.println(c.latir());
		System.out.println("-------------------------------");

	}

}
