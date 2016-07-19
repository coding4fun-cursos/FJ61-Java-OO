package br.com.coding4fun;

/**
 * Classe de representação declaração de métodos sem retorno.
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class MetodoSemRetorno {
	public static void main(String[] args) {
		MetodoSemRetorno object = new MetodoSemRetorno();
		object.imprimir();
		object.imprimirTexto("Java Magazine!");
		object.adicao(80, 90);
		object.multiplicacao(20);
	}

	private void imprimir() {
		System.out.println("[C4F] FJ61 Java orientado a objetos.");
	}

	private void imprimirTexto(String valor) {
		System.out.println(valor);
	}

	private void adicao(int valor1, int valor2) {
		System.out.println("Adição: " + valor1 + valor2);
	}

	private void multiplicacao(int valor) {
		System.out.println("Multiplicação: " + valor * valor);
	}
}
