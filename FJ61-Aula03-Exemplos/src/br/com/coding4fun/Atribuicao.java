package br.com.coding4fun;

/**
 * Classe com exemplo de operadores de atribuição (slide x).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class Atribuicao {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a = 20;
		int b = a;

		double doubleValue = 30.4;
		float floatValue1 = 20.5F;
		float floatValue2 = floatValue1;

		System.out.println("Soma: " + (b += a));

		a = b = 20;
		System.out.println("Subtração: " + (b -= a));

		a = b = 20;
		System.out.println("Multiplicação: " + (b *= a));

		a = b = 20;
		System.out.println("Divisão: " + (b /= a));

		int value1 = 20, value2 = 83, value3 = 34;
		value1 = value2 = value3;
		System.out.println("value1: " + value1);
	}
}
