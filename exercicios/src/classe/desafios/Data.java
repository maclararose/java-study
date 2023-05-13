package classe.desafios;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
		dia = 1;
		mes = 01;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String dataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
