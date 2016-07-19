package br.com.coding4fun;

/**
 * Classe com exemplo de operadores lógicos (slide x).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class OperadoresLogicos {
	public static void main(String[] args) {
		int a = 30;
		int b = 20;

		System.out.println(a > 30 && b > 10);
		System.out.println(a > 30 || b > 10);
		System.out.println(!(b > 10));
		System.out.println(!(a > 30));
	}
}
