package classe.desafios;

public class DataTeste {

	public static void main(String[] args) {
		Data data = new Data();
		
		data.dia = 01;
		data.mes = 10;
		data.ano = 1997;
		
		System.out.println(data.dia);
		System.out.println(data.mes);
		System.out.println(data.ano);
		
		var data2 = new Data();
		data2.dia = 28;
		data2.mes = 07;
		data2.ano = 1999;
		
		var data3 = new Data();
		
		var data4 = new Data(5, 6, 1987);
		
		System.out.println(data.dataFormatada());
		System.out.println(data2.dataFormatada());
		System.out.println(data3.dataFormatada());
		System.out.println(data4.dataFormatada());
	}

}
