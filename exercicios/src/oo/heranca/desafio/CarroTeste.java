package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		Carro civic = new Civic();
		civic.velocidadeAtual = 10;
		civic.marcha = 2;
		
		Carro ferrari = new Ferrari(250);
		ferrari.velocidadeAtual = 60;
		
		System.out.println(civic.velocidadeAtual);
		System.out.println(civic.marcha);
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

	}

}
