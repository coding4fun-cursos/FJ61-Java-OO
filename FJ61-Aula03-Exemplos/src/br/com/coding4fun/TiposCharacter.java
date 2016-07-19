package br.com.coding4fun;

/**
 * Classe com exemplo de manipulacao de tipo char (slide x).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class TiposCharacter {
	public static void main(String[] args) {
		char c1 = 'K';
		char c2 = '\u0000';
		char c3 = '\uffff';

		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);

		// valores não equivalentes
		char c4 = 90;
		char c5 = '\u0099';

		System.out.println("c4: " + c4);
		System.out.println("c5: " + c5);

		// erro, compilação em número negativo
		// char c6 = -100; // Type mismatch: cannot convert from int to char
		char c7 = (char) -100;
		System.out.println("c7: " + c7);

	}
}
