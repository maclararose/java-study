package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	 public static void main(String[] args) {
		double a = 1; // implicita
		System.out.println(a);
		
		// Conversao explicita e CAST, porém quanto maior o valor haverá um truncamento
		// Assim gerando perda de informação
		float b = (float)1.32486390247;
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.99999999;
		int f = (int) e;
		System.out.println(f);
	}
}
