package classe.desafios;

public class Data {
	public int dia;
	public int mes;
	public int ano;
	
	Data(){
		dia = 1;
		mes = 01;
		ano = 1970;
	}
	
	public Data(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	public String dataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
