package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		String s = new String("Texto"); // instanciando objeto
		s.toUpperCase();
		
		System.out.println(s);
		
//		Tipos primitivos não tem comportamentos como objetos, 
//		porem os wrappers são a versão objeto dos tipos primitvos.
		int a = 123;
		System.out.println(a);
		
//		Tudo em java são objetos, menos os tipos primitivos.
	}
}
