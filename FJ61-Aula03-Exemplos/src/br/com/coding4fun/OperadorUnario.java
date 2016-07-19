package br.com.coding4fun;

/**
 * Classe com exemplo de operadores aritméticos unários (slide x).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class OperadorUnario {
	public static void main(String[] args) {
		int a = 30;
		int b = 10;
		a++;
		++b;
		System.out.println("sem expressão");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		a = 30;
		b = 10;
		int c = a - ++b;
		System.out.println("\nExpressão pré-incremento");
		System.out.println("c: " + c);
		System.out.println("b: " + b);

		a = 30;
		b = 10;
		int d = a - b++;
		System.out.println("\nExpressão pós-incremento");
		System.out.println("d: " + d);
		System.out.println("b: " + b);

		a = 10;
		a = a++ + a + a-- - a-- + ++a;
		// a = 10 + 11 + 11 - 10 + 10;
		System.out.println(a);

	}
}
