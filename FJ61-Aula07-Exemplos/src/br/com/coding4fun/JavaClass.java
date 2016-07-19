package br.com.coding4fun;

/**
 * Classe com exemplo da classe Class do Java API (slide 7).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class JavaClass {
	public void exibirClassName(Object object) {
		System.out.println("Classe de " + object + " é " + object.getClass().getName());
	}

	public static void main(String[] args) {
		new JavaClass().exibirClassName(new JavaClass());
	}
}
