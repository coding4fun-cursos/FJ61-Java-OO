package br.com.coding4fun;

import javax.swing.JOptionPane;

/**
 * Classe com exemplo de manipulação de array (slide 11).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class ArrayComPesquisa {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Qual sua linguagem de programação favorita?");
		String mensagem = "Tecnologia preferida: [indefinida]";

		if (null != input) {
			String[] tecnologias = { "java", "c#", "python", "php", "ruby" };
			for (String tecnologia : tecnologias) {
				if (tecnologia.equals(input.toLowerCase())) {
					mensagem = "Tecnologia preferida: " + tecnologia;
					break;
				}
			}
		}

		System.out.println(mensagem);
	}
}
