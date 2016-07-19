package br.com.coding4fun;

/**
 * Classe Produto (slide 08).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class Produto extends Object {
	private String descricao;
	private double preco;

	public Produto(String descricao, double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
