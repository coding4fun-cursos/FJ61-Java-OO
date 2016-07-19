package br.com.coding4fun;

/**
 * Classe com exemplo de utilização de java.lang.StringBuilder (slide 19).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class ManipulacaoStringBuilder {
	public static void main(String[] args) {
		StringBuilder languages = new StringBuilder();
		languages.append("Java "); // internamente +=
		languages.append("Python ");
		languages.append("Ruby ");

		System.out.println("Linguagens: " + languages.toString());

		System.out.println("\nManipulação de Strings");
		System.out.println("Capacidade: " + languages.capacity());

		// insert into string, not position on
		languages.insert(5, "GO ");
		System.out.println("Linguagens: " + languages.toString());

		languages.delete(14, 19); // end - exclusive
		System.out.println("Linguagens: " + languages.toString());

		languages.deleteCharAt(0);
		System.out.println("Linguagens: " + languages.toString());

		languages.reverse();
		System.out.println("Linguagens: " + languages.toString());

		languages.replace(0, 7, "Java"); // end - exclusive
		System.out.println("Linguagens: " + languages.toString());

		// end - exclusive
		System.out.println("Linguagem: " + languages.subSequence(0, 5));
	}
}
