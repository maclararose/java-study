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
		
		System.out.printf("%d/%d/%d\n", data.dia, data.mes, data.ano);
		System.out.printf("%d/%d/%d", data2.dia, data2.mes, data2.ano);
	}

}
