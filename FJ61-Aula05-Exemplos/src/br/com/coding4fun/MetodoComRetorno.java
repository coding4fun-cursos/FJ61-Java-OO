package br.com.coding4fun;

/**
 * Classe de representação declaração de métodos com retorno.
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class MetodoComRetorno {

	private String texto;

	public static void main(String[] args) {
		MetodoComRetorno object = new MetodoComRetorno();

		object.setTexto("[C4F] FJ61 Java orientado a objetos.");
		System.out.println(object.getTexto());

		System.out.println(object.imprimirTexto("Java Magazine!"));
		System.out.println(object.adicao(80, 90));
		System.out.println(object.multiplicacao(20));
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	private String imprimirTexto(String valor) {
		return valor;
	}

	private int adicao(int valor1, int valor2) {
		return valor1 + valor2;
	}

	private int multiplicacao(int valor) {
		return valor * valor;
	}
}
