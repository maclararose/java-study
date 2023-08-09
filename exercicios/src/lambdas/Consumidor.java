package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		Consumer<Produto> imprimir = 
				p -> System.out.println(p.nome + "!!!");
		
		Produto p1 = new Produto("Caneta", 14.50, 0.1);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Caderno", 24.50, 0.1);
		Produto p3 = new Produto("Mochila", 114.50, 0.1);
		Produto p4 = new Produto("Estojo", 44.50, 0.1);
		Produto p5 = new Produto("Marca-texto", 10.50, 0.1);
		
		List <Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir); // ja recebe um consumer, por isso executa o accept
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);

	}

}
