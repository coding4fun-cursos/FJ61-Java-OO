package br.com.coding4fun;

import java.util.Arrays;

/**
 * Classe SomaMaiorMenor contendo resolução do exercício 02 - Aula 06.
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class SomaMaiorMenor {
	public static void main(String[] args) {
		double valores[] = { 10.2, 30.0, 80.3, 23.0, 837.7, 73.1, 29.9, 93.89, 9029.20, 20.0 };
		double somatorio = 0;

		// realizando a soma de valores
		for (int i = 0; i < valores.length; i++) {
			somatorio += valores[i];
		}

		// maior e menor valor
		Arrays.sort(valores);
		System.out.println("Menor Valor: " + valores[0]);
		System.out.println("Maior Valor: " + valores[valores.length - 1]);
		System.out.println("Soma de Valores: " + somatorio);
	}
}
