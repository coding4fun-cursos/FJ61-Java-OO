package br.com.coding4fun;

import javax.swing.JOptionPane;

/**
 * Classe referente ao Laboratório - Exercicio 04 - apuracao semestral.
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class ApuracaoSemestral {
	public static void main(String[] args) {
		double janeiroFaturamento = 12000;
		double fevereiroFaturamento = 35802;
		double marcoFaturamento = 27210;
		double abrilFaturamento = 14240;
		double maioFaturamento = 19000;
		double junhoFaturamento = 56900;

		double janeiroDespesa = 7000;
		double fevereiroDespesa = 5020;
		double marcoDespesa = 3500;
		double abrilDespesa = 12000;
		double maioDespesa = 8000;
		double junhoDespesa = 10050;

		double totalFaturamento = 0, totalDespesa = 0, lucroApurado = 0;

		totalFaturamento = janeiroFaturamento + fevereiroFaturamento + marcoFaturamento + abrilFaturamento
				+ maioFaturamento + junhoFaturamento;
		totalDespesa = janeiroDespesa + fevereiroDespesa + marcoDespesa + abrilDespesa + maioDespesa + junhoDespesa;
		lucroApurado = totalFaturamento - totalDespesa;

		JOptionPane.showMessageDialog(null, "Total de faturamento: R$ " + totalFaturamento + ", Total de Despesas: R$ "
				+ totalDespesa + ", Lucro Apurado: R$ " + lucroApurado + ". Obteve LUCRO.");
	}
}
