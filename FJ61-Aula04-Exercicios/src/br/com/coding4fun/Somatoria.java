package br.com.coding4fun;

/**
 * Classe Somatoria contendo resolução do exercício 03 - Aula 04.
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class Somatoria {
	public static void main(String[] args) {
		long resultado = 0;
		for (int i = 27; i <= 9200; i++) {
			resultado += i;
		}

		System.out.println("Resultado da soma entre valores: " + resultado);
	}
}
