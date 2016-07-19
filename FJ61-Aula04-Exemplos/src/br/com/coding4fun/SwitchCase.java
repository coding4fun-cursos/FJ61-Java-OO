package br.com.coding4fun;

import javax.swing.JOptionPane;

/**
 * Classe com exemplo estrutura switch-case (slide 10).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class SwitchCase {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Informe um valor entre 1 a 7");
		if (null != input) {
			String diaSemana;
			int dia = Integer.parseInt(input);

			switch (dia) {
			case 1:
				diaSemana = "Domingo";
				break;
			case 2:
				diaSemana = "Segunda";
				break;
			case 3:
				diaSemana = "Terça";
				break;
			case 4:
				diaSemana = "Quarta";
				break;
			case 5:
				diaSemana = "Quinta";
				break;
			case 6:
				diaSemana = "Sexta";
				break;
			case 7:
				diaSemana = "Sábado";
				break;
			default:
				diaSemana = "Dia da semana informado desconhecido.";
				break;
			}

			JOptionPane.showMessageDialog(null, "Dia da semana: " + diaSemana);
		}
	}
}
