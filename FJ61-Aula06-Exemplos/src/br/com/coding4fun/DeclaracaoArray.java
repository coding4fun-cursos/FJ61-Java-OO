package br.com.coding4fun;

/**
 * Classe com exemplo de declaração de arrays (slide 06).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class DeclaracaoArray {
	public static void main(String[] args) {
		String[] frutas = new String[10];
		frutas[0] = "Banana";
		frutas[1] = "Maça";
		frutas[2] = "Laranja";

		System.out.println("Relação de frutas");
		for (String fruta : frutas) {
			System.out.println("Fruta: " + fruta);
		}

		String[] tecnologias = { "Java", ".NET", "PHP", "Python" };
		System.out.println("\nRelação de Tecnologias");
		for (String tecnologia : tecnologias) {
			System.out.println("Tecnologia: " + tecnologia);
		}
	}
}
