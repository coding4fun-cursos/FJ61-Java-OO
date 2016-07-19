package br.com.coding4fun;

import javax.swing.JOptionPane;

/**
 * Classe com exemplo estrutura de repeticao - while (slide 14).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class RepeticaoWhile {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Informe um valor inteiro numérico");
		int contador = Integer.parseInt(input);
		while (contador >= 0) {
			System.out.println("Número " + contador);
			contador--;
		}
	}
}
