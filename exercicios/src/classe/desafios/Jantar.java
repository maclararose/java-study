package classe.desafios;

public class Jantar {

	public static void main(String[] args) {
		Comida comida = new Comida("Arroz", 0.300);
		Comida comida1 = new Comida("Feijão", 0.200);
		Comida comida2 = new Comida("Legumes", 0.200);
		Comida comida3 = new Comida("Carne", 0.300);
		Comida c = new Comida();
		
		Pessoa p1 = new Pessoa("Maria", 70.7);
		
		System.out.printf("Peso da pessoa %s antes de comer: %.3fkg\n", p1.nome, p1.peso);
		p1.comer(comida);
		System.out.printf("Peso da pessoa %s depois de comer: %.3fkg\n", p1.nome, p1.peso);
		p1.comer(comida1);
		System.out.printf("Peso da pessoa %s depois de comer: %.3fkg\n", p1.nome, p1.peso);
		p1.comer(comida2);
		System.out.printf("Peso da pessoa %s depois de comer: %.3fkg\n", p1.nome, p1.peso);
		System.out.printf("Peso da pessoa %s depois de comer: %.3fkg\n", p1.nome, p1.comer(comida3));
		System.out.printf("Peso da pessoa %s depois de comer: %.3fkg\n", p1.nome, p1.comer(c));

	}

}
