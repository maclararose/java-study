package oo.encapsulamento.p1;

public class Paulo {
	
	void testeAcesso() {
		Ana esposa = new Ana();
		System.out.println(esposa.idade);
		System.out.println(esposa.vicio);
		System.out.println(esposa.caracteristica);
//		System.out.println(esposa.segredo); não é possivel acessar
	}
}
