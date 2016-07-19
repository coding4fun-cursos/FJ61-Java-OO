package br.com.coding4fun;

/**
 * Classe com exemplo de conversao de tipos - casting (slide x).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class Casting {
	public static void main(String[] args) {
		double booking1, booking2, worklog, avg;

		booking1 = Double.parseDouble(args[0]);
		booking2 = Double.parseDouble(args[1]);
		worklog = Double.parseDouble(args[2]);

		avg = (booking1 + booking2 + worklog) / 3;
		System.out.println("AVG value = " + avg);
	}
}
