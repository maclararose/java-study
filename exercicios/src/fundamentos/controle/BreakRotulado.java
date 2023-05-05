package fundamentos.controle;

public class BreakRotulado {

	public static void main(String[] args) {
		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1) {
					// esse break vai pular a linha 1 de i, mas caso tenha um rotulo
					// ele quebra o rotulo do laço
					break externo;
				}
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!");
	}

}
