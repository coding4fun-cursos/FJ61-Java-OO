package br.com.coding4fun;

import javax.swing.JOptionPane;

/**
 * Classe CalcularIR contendo resolução do exercício 02 - Aula 04.
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class CalcularIR {
	public static void main(String[] args) {
		String contribuinte = JOptionPane.showInputDialog("Nome do contribuinte");
		double salarioMensal = Double.parseDouble(JOptionPane.showInputDialog("Valor salário bruto mensal"));

		final int QTDE_MESES_ANO = 13;

		double aliquota = 0;
		double salarioAnual = salarioMensal * QTDE_MESES_ANO;

		if (salarioAnual <= 15764.28) {
			aliquota = 0;
		} else if (salarioAnual > 15764.28 && salarioAnual <= 31501.44) {
			aliquota = 15;
		} else if (salarioAnual > 31501.44) {
			aliquota = 27.5;
		}

		double valorDeducao = salarioAnual * aliquota / 100;
		JOptionPane.showMessageDialog(null,
				"Contribuinte: " + contribuinte + "\nSalário bruto mensal: " + salarioMensal + "\nValor anual bruto: "
						+ salarioAnual + "\nAlíquota aplicada: " + aliquota + "\nValor dedução: " + valorDeducao);
	}
}
