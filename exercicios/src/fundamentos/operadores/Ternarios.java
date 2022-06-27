package fundamentos.operadores;

public class Ternarios {
	public static void main(String[] args) {
		double media = 8.6;
		String resultadoParcial = media >= 5.0 ? "Recuperacao." : "Reprovado.";
		String resultado = media >= 7.0 ? "Aprovado!" : resultadoParcial;
		
		System.out.println(resultado);
		
		boolean bomComportamento = true;
		double nota = 9.3;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		String resultadoAluno = temDesconto ? "Sim" : "Nao";
		
		System.out.printf("Tem desconto? %s", resultadoAluno);
	}
}
