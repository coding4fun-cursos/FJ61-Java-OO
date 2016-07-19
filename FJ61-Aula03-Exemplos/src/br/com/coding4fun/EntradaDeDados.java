package br.com.coding4fun;

import javax.swing.JOptionPane;

/**
 * Classe com exemplo de entrada de dados (slide x).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class EntradaDeDados {
	public static void main(String[] args) {
		String inputValue = JOptionPane.showInputDialog("Input value");

		int option = JOptionPane.showConfirmDialog(null, "Deseja confirmar a operação?", "Sim ou Não",
				JOptionPane.YES_NO_OPTION);
		boolean expression = option == JOptionPane.YES_OPTION;

		JOptionPane.showMessageDialog(null, "Houve um erro na conversão. Message: <>");
		System.out.println("inputValue = " + inputValue + ", expression value = " + expression);
	}
}
