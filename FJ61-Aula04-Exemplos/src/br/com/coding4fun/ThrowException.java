package br.com.coding4fun;

import javax.swing.JOptionPane;

/**
 * Classe com exemplo tratamento de exceção - throw new (slide 19).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class ThrowException {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Informe um valor entre 0 a 10");
		float valor = Float.parseFloat(input);
		try {
			if (valor < 0 || valor > 10) {
				throw new Exception("Valor informado fora da faixa de processamento.");
			}

			JOptionPane.showMessageDialog(null, "Valor informado: " + valor);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Exception: " + e.getMessage());
		}
	}
}
