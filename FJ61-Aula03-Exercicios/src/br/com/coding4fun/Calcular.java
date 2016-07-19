package br.com.coding4fun;

import javax.swing.JOptionPane;

/**
 * Classe referente ao Laboratório - Exercicio 01 - calculadora.
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class Calcular {
	public static void main(String[] args) {
		double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor1"));
		double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor2"));

		Calculadora calculadora = new Calculadora(valor1, valor2);

		JOptionPane.showMessageDialog(null,
				"Valores: " + valor1 + " e " + valor2 + "\n\nAdicao = " + calculadora.adicao() + "\nSubtracao = "
						+ calculadora.subtracao() + "\nMultiplicacao = " + calculadora.multiplicacao() + "\nDivisao = "
						+ calculadora.divisao());
	}
}
