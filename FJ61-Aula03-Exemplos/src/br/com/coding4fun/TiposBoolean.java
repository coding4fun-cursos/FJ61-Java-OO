package br.com.coding4fun;

/**
 * Classe com exemplo de manipulacao de tipos boolean (slide x).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class TiposBoolean {
	public static void main(String[] args) {
		boolean valueBoolean = true;
		// boolean valueBooleanError = 0; // error

		System.out.println("valueBoolean: " + valueBoolean);

		// expressao booleana
		int quantidadeMinima = 60;
		boolean freteGratuito = (quantidadeMinima > 50);
		System.out.println("Frete é gratutito? " + freteGratuito);
	}
}
