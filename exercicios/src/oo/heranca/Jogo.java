package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 10;
		
		Mob monstro = new Mob();
		monstro.x = 10;
		monstro.y = 11;
		
		System.out.println("O heroi encontrou um monstro e uma batalha se inicia. HP heroi: "+heroi.vida);
		System.out.println("HP monstro: "+monstro.vida);
		
		heroi.atacar(monstro);
		
		System.out.println("O heroi atacou o monstro!");
		System.out.println("HP heroi: "+heroi.vida);
		System.out.println("HP monstro: "+monstro.vida);
	}

}
