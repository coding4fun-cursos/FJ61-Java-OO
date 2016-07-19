package br.com.coding4fun;

import javax.swing.JOptionPane;

/**
 * Classe referente ao Laboratório - Exercicio 03 - calculo semestral
 * universidade.
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class CalculoSemestral {
	public static void main(String[] args) {
		String disciplina = JOptionPane.showInputDialog("Nome da disciplina");
		String nomeAluno = JOptionPane.showInputDialog("Nome do aluno");

		double notaAvaliacao1 = Double.parseDouble(JOptionPane.showInputDialog("Nota da avaliação 1"));
		double notaAvaliacao2 = Double.parseDouble(JOptionPane.showInputDialog("Nota da avaliação 2"));

		double trabalho1 = Double.parseDouble(JOptionPane.showInputDialog("Nota da trabalho 1"));
		double trabalho2 = Double.parseDouble(JOptionPane.showInputDialog("Nota da trabalho 2"));
		double mediaFinal = 0;

		mediaFinal = (notaAvaliacao1 + notaAvaliacao2 + trabalho1 + trabalho2) / 4;

		JOptionPane.showMessageDialog(null,
				"Nome da disciplina: " + disciplina + ", aluno: " + nomeAluno + ", média: " + mediaFinal);
	}
}
