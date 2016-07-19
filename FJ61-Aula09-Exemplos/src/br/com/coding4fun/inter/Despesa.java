package br.com.coding4fun.inter;

/**
 * Classe abstrata de despesas (slide 13).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public abstract class Despesa {
	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
