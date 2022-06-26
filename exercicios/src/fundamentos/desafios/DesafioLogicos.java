package fundamentos.desafios;

public class DesafioLogicos {
	public static void main(String[] args) {
		// trabalhos na terça ou quinta (V ou F)
		// Se apenas um trabalho der certo -> tv de 32 -> familia vai tomar sorvete
		// Se os dois trabalhos derem certo -> tv de 50 -> familia vai tomar sorvete
		// Se nenhum der certo -> familia em casa e sem sorvete
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		boolean tomarSorvete = true;
		
		System.out.println(trabalho1 && trabalho2 && tomarSorvete);
		System.out.println("Vamos comprar uma tv de 50 polegadas e tomar sorvete");
		
		System.out.println(!trabalho1 ^ trabalho2 && tomarSorvete);
		System.out.println("Vamos comprar uma tv de 32 polegadas e tomar sorvete");
		
		System.out.println(trabalho1 ^ !trabalho2 && tomarSorvete);
		System.out.println("Vamos comprar uma tv de 32 polegadas e tomar sorvete");
		
		System.out.println(!trabalho1 || !trabalho2 && tomarSorvete);
		System.out.println("Vamos ficar em casa e não vamos tomar sorvete");
		
//		Solucao da aula
		/*
		 * boolean trabalho1 = true;
		 * boolean trabalho2 = true;
		 * boolean comprouTV50 = trabalho1 && trabalho2;
		 * boolean comprouTV32 = trabalho1 ^ trabalho2;
		 * boolean comprouSorvete = trabalho1 || trabalho1;
		 * boolean maisSaudavel = !comprouSorvete;
		 * 
		 * System.out.println("Comprou TV 50?" + comprouTV50);
		 * System.out.println("Comprou TV 32?" + comprouTV32);
		 * System.out.println("Comprou Sorvete?" + comprouSorvete);
		 * System.out.println("Mais saudavel" + maisSaudavel);
		 * 
		 * */
	}
}
