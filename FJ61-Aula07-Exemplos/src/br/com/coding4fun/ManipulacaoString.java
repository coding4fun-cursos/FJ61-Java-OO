package br.com.coding4fun;

/**
 * Classe com exemplo de utilização de java.lang.String (slide 12).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class ManipulacaoString {
	public static void main(String[] args) {
		String lang1 = new String("Java");
		String lang2 = new String("Python");

		char[] arrayOfChar = new char[] { 'J', 'a', 'v', 'a' };
		String lang3 = new String(arrayOfChar);

		System.out.println("[Java == Python]: " + (lang1 == lang2));
		System.out.println("[Java equals Python]: " + lang1.equals(lang2));
		System.out.println("[Java equals Java]: " + lang1.equals(lang3));

		System.out.println("\nManipulação de Strings");
		System.out.println("Tamanho da palavra Java: " + lang1.length());
		System.out.println("Caracter na posição [2]: " + lang1.charAt(2));
		System.out.println("Palavra em lowercase: " + lang1.toLowerCase());
		System.out.println("Palavra em uppercase: " + lang1.toUpperCase());

		// end - exclusive
		System.out.println("Partes da palavra Java: " + lang1.subSequence(1, 3));

		System.out.println("Substituição de caracter 'a': " + lang1.replace('a', 'e'));
		System.out.println("Caracter na posição [a]: " + lang1.indexOf('a'));
	}
}
