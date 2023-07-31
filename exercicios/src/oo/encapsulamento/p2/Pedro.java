package oo.encapsulamento.p2;

import oo.encapsulamento.p1.Ana;

public class Pedro extends Ana {
	
	void testeAcesso() {
		Ana mae = new Ana();
		System.out.println(mae.idade);
		System.out.println(vicio); // coisas recebidas por herança não precisam de instancia para os herdeiros acessarem
//		System.out.println(mae.caracteristica); não é possivel acessar por ser package/default
//		System.out.println(esposa.segredo); não é possivel acessar
	}
}
