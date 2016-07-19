package br.com.coding4fun;

import javax.swing.JOptionPane;

/**
 * Classe com exemplo estrutura if-else - if com else aninhado (slide 08).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class IfComElseAninhado {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Informe um valor entre 1 a 7");
		if (null != input) {
			String diaSemana;
			int dia = Integer.parseInt(input);

			if (dia == 1)
				diaSemana = "Domingo";
			else if (dia == 2)
				diaSemana = "Segunda";
			else if (dia == 3)
				diaSemana = "Terça";
			else if (dia == 4)
				diaSemana = "Quarta";
			else if (dia == 5)
				diaSemana = "Quinta";
			else if (dia == 6)
				diaSemana = "Sexta";
			else if (dia == 7)
				diaSemana = "Sábado";
			else
				diaSemana = "Dia da semana informado desconhecido.";

			JOptionPane.showMessageDialog(null, "Dia da semana: " + diaSemana);
		}
	}
}
