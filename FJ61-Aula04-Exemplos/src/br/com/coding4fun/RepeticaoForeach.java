package br.com.coding4fun;

import java.util.Arrays;
import java.util.List;

/**
 * Classe com exemplo estrutura de repeticao - foreach (slide 13).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class RepeticaoForeach {
	public static void main(String[] args) {
		List<String> frutas = Arrays.asList("Banana", "Melancia", "Laranja", "Kiwi");
		for (String fruta : frutas) {
			System.out.println("Fruta contida na lista: " + fruta);
		}
	}
}
