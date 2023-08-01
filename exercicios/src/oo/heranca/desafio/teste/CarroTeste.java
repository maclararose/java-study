package oo.heranca.desafio.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		Carro civic = new Civic();
		civic.velocidadeAtual = 10;
//		civic.marcha = 2;
		
		Carro ferrari = new Ferrari(250);
		ferrari.velocidadeAtual = 60;
		
		System.out.println(civic.velocidadeAtual);
//		System.out.println(civic.marcha);
		System.out.println(ferrari.velocidadeAtual);
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		civic.frear();
		
		System.out.println("A velocidade do civic agora é: " + civic.velocidadeAtual + "Km/h");
		
		ferrari.acelerar();
		ferrari.acelerar();
		
		System.out.println("A velocidade da Ferrari agora é: " + ferrari.velocidadeAtual + "Km/h");
		
		Ferrari carro = new Ferrari(80);
		carro.ligarAr();
		carro.ligarTurbo();
		
		carro.acelerar();
		carro.acelerar();
		
		System.out.println("Velocidade atual: " + carro.velocidadeAtual + "Km/h");
		
		carro.frear();
		carro.frear();
		carro.desligarTurbo();
		System.out.println("Velocidade atual: " + carro.velocidadeAtual + "Km/h");
		carro.desligarAr();

	}

}
