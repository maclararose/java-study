package lambdas.desafio;

import lambdas.Produto;

/*
 * 1. A partir do produto calcular o preco real (com desconto)
 * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
 * 3. Frete: >= 3000 (100) / < 3000 (50)
 * 4. Arredondar: Deixar duas casas decimais
 * 5. Formatar: R$1234,56
 * */

public class Desafio {

	public static void main(String[] args) {
		Produto p = new Produto("iPad", 3235.89, 0.13);

	}

}
