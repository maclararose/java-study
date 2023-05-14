package classe;

import classe.desafios.Data;

public class ValorVsReferencia {

	public static void main(String[] args) {
		// atribuição por valor
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		// atribuicao por referencia
		Data d1 = new Data(1, 6, 2020);
		Data d2 = d1;
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2023;
		
		System.out.println(d1.dataFormatada() + "    " + d2.dataFormatada());
		voltarDataParaValorPadrao(d1);
		System.out.println(d1.dataFormatada() + "    " + d2.dataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);

	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++; // o que modificar aqui nao ira gerar impacto nas variaveis, foi criado uma copia
	}
}
