package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("Os sete maridos de Evelyn Hugo");
		livros.push("O nome do vento");
		livros.add("Daisy Jhones and The Sixs");
		livros.push("O temor do Sábio");
		livros.add("A morte de Ivan Illitch");
		livros.push("1984");
		livros.add("Objetos Cortantes");
		livros.push("Carrie");
		livros.add("Garota Exemplar");
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println("-------------------------------------------------------");
		
		System.out.println(livros.pop()); // lança execao como o remove
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		// livros.size();
		// livros.clear();
		// livros.contains();
		// livros.isEmpty();

	}

}
