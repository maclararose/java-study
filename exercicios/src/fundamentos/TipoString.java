package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Bom dia, pessoal".charAt(6));
		
		// Strings são objetos imutaveis
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos Silva";
		var idade = 33;
		var salario = 12344.45;
		
		System.out.println("Nome: "+ nome +" Sobrenome: " + sobrenome + " Idade: " + idade + " Salario: " + salario + "\n\n");
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f.\n", 
				nome, sobrenome, idade, salario);
		
		System.out.printf(frase);
		
//		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.", 
//				nome, sobrenome, idade, salario);
		
		var fraseQualquer = "Uma frase qualquer para testes";
		System.out.println(fraseQualquer.substring(6, 13));
		System.out.println(fraseQualquer.indexOf("tes"));
	}
}
