package br.com.coding4fun;

import javax.swing.JOptionPane;

/**
 * Classe com exemplo estrutura if-else - if com else (slide 07).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class IfComElse {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Informe valor entre 0 e 10");
		if (null != input) {
			float valor = Float.parseFloat(input);
			if (valor >= 0 && valor <= 10) {
				JOptionPane.showMessageDialog(null, "Valor: " + valor + " válido.");
			} else {
				JOptionPane.showMessageDialog(null, "Valor: " + valor + " inválido.");
			}
		}
	}
}
