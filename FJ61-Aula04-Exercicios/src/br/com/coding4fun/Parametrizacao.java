package br.com.coding4fun;

import javax.swing.JOptionPane;

/**
 * Classe Parametrizacao contendo resolução do exercício 05 - Aula 04.
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class Parametrizacao {
	public static void main(String[] args) {
		int input = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor númerico inteiro"));
		double valor1 = input, valor2 = 0;

		while (valor2 != 1) {
			if (valor1 % 2 == 0) {
				valor2 = valor1 / 2;
			} else {
				valor2 = 3 * valor1 + 1;
			}

			valor1 = valor2;
			System.out.print("" + valor2 + "  ");
		}
	}
}