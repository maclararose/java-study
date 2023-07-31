package oo.heranca.desafio.teste;

import oo.heranca.Heroi;
import oo.heranca.Mob;

public class Jogo {

	public static void main(String[] args) {
		Heroi heroi = new Heroi(10, 10);
		
		Mob monstro = new Mob();
		
		System.out.println("O heroi encontrou um monstro e uma batalha se inicia. HP heroi: "+heroi.vida);
		System.out.println("HP monstro: "+monstro.vida);
		
		heroi.atacar(monstro);
		
		System.out.println("O heroi atacou o monstro!");
		System.out.println("HP heroi: "+heroi.vida);
		System.out.println("HP monstro: "+monstro.vida);
	}

}
