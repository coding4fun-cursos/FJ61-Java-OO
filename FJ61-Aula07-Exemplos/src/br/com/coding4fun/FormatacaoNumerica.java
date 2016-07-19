package br.com.coding4fun;

import java.text.DecimalFormat;

/**
 * Classe com exemplo de formatação numérica (slide 15).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class FormatacaoNumerica {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();

		short exercicios = 54;
		df.applyPattern("000");
		System.out.println("Quantidade de exercícios: " + df.format(exercicios));

		int estoque = 9750;
		df.applyPattern("#0,000");
		System.out.println("Quantidade em estoque: " + df.format(estoque));

		long alunos = 198564;
		df.applyPattern("#,##0,000");
		System.out.println("Quantidade de alunos: " + df.format(alunos));

		float altura = 1.78F;
		df.applyPattern("#0.00");
		System.out.println("Altura: " + df.format(altura));

		double peso = 79.25;
		df.applyPattern("#0.00");
		System.out.println("Peso: " + df.format(peso));

		String preco = "2583.75";
		df.applyPattern("R$ #,##0.00");
		System.out.println("Preço: " + df.format(Double.parseDouble(preco)));
	}
}
