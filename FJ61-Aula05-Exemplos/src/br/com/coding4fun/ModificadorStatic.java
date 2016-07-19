package br.com.coding4fun;

/**
 * Classe com exemplo de modificador static (slide 36).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class ModificadorStatic {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Estoque estoque = new Estoque();

		estoque.incrementaQuantidade();
		estoque.incrementaQuantidadeGlobal();

		Estoque.incrementaQuantidadeGlobal();
		Estoque.incrementaQuantidadeGlobal();

		System.out.println("");
		Estoque.print("Trabalhando com métodos static no Java.");
		System.out.println("Multiplicação: 10x20 = " + Estoque.multiplicar(10, 20));
	}
}
