package br.com.coding4fun;

/**
 * Classe Multiplos contendo resolução do exercício 03 - Aula 04.
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class Multiplos {
	public static void main(String[] args) {
		/** taboada do 4 **/
		for (int i = 0; i <= 200; i++) {
			if (i % 4 == 0) {
				System.out.println("Número: " + i);
			}
		}
	}
}
