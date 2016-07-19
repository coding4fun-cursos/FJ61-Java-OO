package br.com.coding4fun;

import javax.swing.JOptionPane;

/**
 * Classe com exemplo estrutura de repeticao - do..while (slide 15).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class RepeticaoDoWhile {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Informe um valor inteiro numérico");
		int contador = Integer.parseInt(input);
		do {
			System.out.println("Número " + contador);
			contador--;
		} while (contador >= 0);
	}
}
