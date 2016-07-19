package br.com.coding4fun;

import java.util.Arrays;
import java.util.List;

/**
 * Classe com exemplo de métodos de java.util.Arrays (slide 14).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class MetodosClasseArrays {
	public static void main(String[] args) {
		String[] tecnologias = { "plsql", "c#", "c++", "swift", "javascript", "cobol", "python", "php", "ruby", "java",
				"vbnet", "perl", "object-pascal", "lisp", "prolog", "objective-c" };

		System.out.println("Tecnologias declaradas");
		output(tecnologias);

		Arrays.sort(tecnologias);
		System.out.println("\nTecnologias ordenadas ascendente");
		output(tecnologias);

		List<String> listaTecnologias = Arrays.asList(tecnologias);
		System.out.println("\nTecnologias como java.util.List<>");
		output(listaTecnologias);

		int index = Arrays.binarySearch(tecnologias, "java");
		System.out.println("\nPosição de [key] java: " + index);

		String[] tecnologiasSelecionadas = Arrays.copyOf(tecnologias, 5);
		System.out.println("\nTecnologias selecionadas [5]");
		output(tecnologiasSelecionadas);

		System.out.println("\nComparando arrays de tecnologias");
		System.out.println(
				Arrays.equals(tecnologias, tecnologiasSelecionadas) ? "Arrays identicos" : "Arrays diferentes");

		long[] numeros = new long[20];
		Arrays.fill(numeros, 89);
		System.out.println("\nPreenchendo array com determinado valor");
		output(numeros);

		System.out.println("\nInvocação de método toString() dos elementos");
		System.out.println(Arrays.toString(tecnologias));
	}

	private static void output(String[] values) {
		for (String value : values) {
			System.out.println("Tecnologia: " + value);
		}
	}

	private static void output(List<String> values) {
		for (String value : values) {
			System.out.println("Tecnologia: " + value);
		}
	}

	private static void output(long[] values) {
		for (long value : values) {
			System.out.println("Número: " + value);
		}
	}

}
