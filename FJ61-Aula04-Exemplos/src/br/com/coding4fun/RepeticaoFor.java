package br.com.coding4fun;

/**
 * Classe com exemplo estrutura de repeticao - for (slide 12).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class RepeticaoFor {
	public static void main(String[] args) throws InterruptedException {
		for (int horas = 0; horas < 24; horas++) {
			for (int minutos = 0; minutos < 60; minutos++) {
				for (int segundos = 0; segundos < 60; segundos++) {
					System.out.println(horas + "h" + minutos + "m" + segundos + "s");
					Thread.sleep(1000);
					if (segundos == 10) {
						return;
					}
				}
			}
		}
	}
}
