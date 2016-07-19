package br.com.coding4fun;

import javax.swing.JOptionPane;

/**
 * Classe referente ao Laboratório - Exercicio 02 - cidades.
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class Cidades {
	public static void main(String[] args) {
		String cidade1 = JOptionPane.showInputDialog("Nome da cidade 1");
		String cidade2 = JOptionPane.showInputDialog("Nome da cidade 2");
		String cidade3 = JOptionPane.showInputDialog("Nome da cidade 3");
		String cidade4 = JOptionPane.showInputDialog("Nome da cidade 4");
		String cidade5 = JOptionPane.showInputDialog("Nome da cidade 5");

		JOptionPane.showMessageDialog(null,
				"Nome das cidades: " + cidade1 + ", " + cidade2 + ", " + cidade3 + ", " + cidade4 + ", " + cidade5);
	}
}
