package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		// Quando a fila está cheia, o metodo add() lança uma excessao e o metodo offer() retorna falso
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Clara");
		fila.offer("Daniel");
		fila.add("Gabriel");
		fila.offer("Lucas");
		
		// Se a fila estiver vazia, peek retorna null enquanto element gera uma exceção
		System.out.println("-------------------------------------------------------------");
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		System.out.println("-------------------------------------------------------------");
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...);
		
		System.out.println("-------------------------------------------------------------");
		// o poll -> retorna um elemento removendo-o da fila, caso esteja vazia (fila) ele retorna null
		// o remove -> remove o elemento, porem se a fila estiver vazia, lança uma excessão
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		System.out.println("-------------------------------------------------------------");
		
		
		
	}

}
