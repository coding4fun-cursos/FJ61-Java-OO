package br.com.coding4fun;

/**
 * Classe com exemplo de declaração de array de objetos (slide 08).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class ArrayObjeto {
	public static void main(String[] args) {

		System.out.println("Produtos");
		Produto[] produtos = new Produto[10];
		for (int i = 0; i < produtos.length; i++) {
			produtos[i] = new Produto("Descritivo bc_" + i, i * 1.15);

			System.out.println(produtos[i]);
			System.out.println(produtos[i].getDescricao() + ". US$ " + produtos[i].getPreco());
		}
	}
}
