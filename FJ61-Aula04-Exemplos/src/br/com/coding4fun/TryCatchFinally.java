package br.com.coding4fun;

import javax.swing.JOptionPane;

/**
 * Classe com exemplo tratamento de exceção - try-catch-finally (slide 17).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class TryCatchFinally {
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Informe um valor inteiro numérico A1");
		if (null == input1)
			return;

		String input2 = JOptionPane.showInputDialog("Informe um valor inteiro numérico A2");
		if (null == input2)
			return;
		int valor1 = Integer.parseInt(input1);

		try {
			int valor2 = Integer.parseInt(input2);

			JOptionPane.showMessageDialog(null, "Operação (+): " + (valor1 + valor2));
			JOptionPane.showMessageDialog(null, "Operação (-): " + (valor1 - valor2));
			JOptionPane.showMessageDialog(null, "Operação (*): " + (valor1 * valor2));
			JOptionPane.showMessageDialog(null, "Operação (/): " + (valor1 / valor2));
			JOptionPane.showMessageDialog(null, "Operação (%): " + (valor1 % valor2));
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Divisão por zero.\n" + e.toString());
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Informe apenas números inteiros.\n" + e.toString());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro genérico: " + e.toString());
		} finally {
			JOptionPane.showMessageDialog(null, "Fim da execução da aplicação.");
		}

		// fluxo normal da aplicacao
		System.out.println("Continua o fluxo de execução da minha aplicacao....");
	}
}
