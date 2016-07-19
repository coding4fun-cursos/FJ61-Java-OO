package br.com.coding4fun;

/**
 * Classe de representação declaração de métodos com parâmetro varargs.
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class MetodoVarargs {
	public static void main(String[] args) {
		MetodoVarargs object = new MetodoVarargs();
		System.out.println("Feriados: " + object.feriadosAnual(10, 20));
	}

	// pode ser informado um array ou valores literais separados por vírgula
	public int feriadosAnual(int... days) {
		int quantidade = 0;

		for (int i = 0; i < days.length; i++) {
			quantidade++;
		}

		return quantidade;
	}
}
