package br.com.coding4fun;

/**
 * Classe com exemplo de modificador static (slide 36).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class Estoque {

	public static int quantidadeGlobal = 0;
	public int quantidade = 0;

	public Estoque() {
		System.out.println("Construtor Default.");
	}

	public static void incrementaQuantidadeGlobal() {
		quantidadeGlobal++;
		System.out.println("Quantidade Global: " + quantidadeGlobal);
	}

	public void incrementaQuantidade() {
		quantidade++;
		System.out.println("Quantidade: " + quantidade);
	}

	public static void print(String msg) {
		System.out.println("Mensagem: " + msg);
	}

	public static int multiplicar(int value1, int value2) {
		return (value1 * value2);
	}
}
