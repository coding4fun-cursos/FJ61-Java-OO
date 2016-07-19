package br.com.coding4fun;

import javax.swing.JOptionPane;

/**
 * Classe com exemplo estrutura if-else - if sem else (slide 06).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class If {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Deseja realmente deletar? Sim (S) / Nao (N)");
		String mensagem = "Caracter informado: " + input;

		if (!input.equals("S") && !input.equals("N")) {
			mensagem += " é invalido";
		}

		JOptionPane.showMessageDialog(null, mensagem);
	}
}
