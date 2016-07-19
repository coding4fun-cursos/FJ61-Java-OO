package br.com.coding4fun;

/**
 * Classe com exemplo de declaração de arrays unidimensional (slide 07).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class ArrayUnidimensional {
	public static void main(String[] args) {
		int numeros[] = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i * 98;
			System.out.println("Número: " + numeros[i]);
		}

		String[] diasSemana = { "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" };
		System.out.println("\nDias da semana");
		for (int i = 0; i < diasSemana.length; i++) {
			System.out.println(i + ". " + diasSemana[i]);
		}

		String[] array = new String[] { "I0", "I1", "I2" };
		System.out.println("\nArray de Elementos String");
		for (String valor : array) {
			System.out.println(valor);
		}
	}
}
