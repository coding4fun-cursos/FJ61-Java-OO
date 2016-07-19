package br.com.coding4fun;

/**
 * Classe de exemplo de recursividade - fatorial.
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class Recursividade {
	public static void main(String[] args) {
		Recursividade recursividade = new Recursividade();

		for (int i = 0; i < 10; i++) {
			System.out.println("indice: " + i + ". valor: " + recursividade.fatorial(i));
		}
	}

	private long fatorial(long numero) {
		if (numero <= 1)
			return numero;

		return (numero * fatorial(numero - 1));
	}
}
