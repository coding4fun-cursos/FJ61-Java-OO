package br.com.coding4fun;

/**
 * Classe com exemplo de utilização de java.lang.Math (slide 16).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class OperacoesMath {
	public static void main(String[] args) {
		Double valorAtacado = 99.41;
		System.out.println("Valor do produto no atacado: " + valorAtacado);
		System.out.println("Valor absoluto: " + Math.abs(valorAtacado));
		System.out.println("Valor arredondado para cima: " + Math.round(valorAtacado));
		System.out.println("Valor arredondado para cima: " + Math.ceil(valorAtacado));
		System.out.println("Valor arredondado para baixo: " + Math.floor(valorAtacado));
		System.out.println("Menor valor [99.9 e 77.0]: " + Math.min(99.9, 77.0));
		System.out.println("Maior valor [99.9 e 77.0]: " + Math.max(99.9, 77.0));
		System.out.println("Raiz quadrada [9]: " + Math.sqrt(9));
		System.out.println("Potênciação [2,5]:" + Math.pow(2, 5));
		System.out.println("Valor randomico (ponto flutuante): " + Math.random());
	}
}
