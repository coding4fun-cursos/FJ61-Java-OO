package br.com.coding4fun;

/**
 * Classe com exemplo de manipulacao de tipos ponto flutuante (slide x).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class FloatError {
	public static void main(String[] args) {
		float valueFloat1 = 24.2345565F; // correto
		// float valueFloat2 = 24.2345565; // error, falta sufixo

		double valueDouble1 = 24.2345565; // correto
		double valueDouble2 = 24.2345565D; // correto, nao necessario (default)

		System.out.println("valueFloat1: " + valueFloat1);
		System.out.println("valueDouble1: " + valueDouble1);
		System.out.println("valueDouble2: " + valueDouble2);

		// representação literal com underscore (java7+)
		double literalValue1 = 25.00_302;
		double literalValue2 = 2_2.99_00;

		System.out.println("literalValue1: " + literalValue1);
		System.out.println("literalValue2: " + literalValue2);
	}
}
