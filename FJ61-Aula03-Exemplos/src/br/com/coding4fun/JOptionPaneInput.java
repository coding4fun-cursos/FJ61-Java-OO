package br.com.coding4fun;

import javax.swing.JOptionPane;

/**
 * Classe com exemplo de entrada de dados com JOptionPane (slide x).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class JOptionPaneInput {
	public static void main(String[] args) {
		try {
			double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Valor da Nota 1"));
			double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Valor da Nota 2"));
			double trabalho = Double.parseDouble(JOptionPane.showInputDialog("Valor do Trabalho"));

			double media = (nota1 + nota2 + trabalho) / 3;
			JOptionPane.showMessageDialog(null, "Valor da Média: " + media);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Houve erro na conversão, digite apenas valores numéricos. Message: " + e.getMessage());
		}
	}
}
