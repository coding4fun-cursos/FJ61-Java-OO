package br.com.coding4fun;

/**
 * Classe com exemplo de declaração de array bidimensional (slide 10).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class ArrayMultidimencional {
	public static void main(String[] args) {

		System.out.println("Planilha de Valores");
		long[][] planilha = new long[3][4];

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				planilha[linha][coluna] = (linha + 1) * (coluna + 1) * 47;
				System.out.println("Linha/Coluna: " + linha + "/" + coluna + ". Valor: " + planilha[linha][coluna]);
			}
		}

		System.out.println("\nPlanilha de Valores 2");
		String[][] valores = new String[][] { { "L0", "L1", "L2" }, { "C0", "C1", "C2", "C3" } };

		for (int linha = 0; linha < valores.length; linha++) {
			for (int coluna = 0; coluna < valores[linha].length; coluna++) {
				System.out.println("Linha/Coluna: " + linha + "/" + coluna + ". Valor: " + valores[linha][coluna]);
			}
		}
	}
}
