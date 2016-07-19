package br.com.coding4fun.inter;

import java.util.Date;

/**
 * Despesa de refeição (slide 13).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class DespesaRefeicao extends Despesa {

	private Date data;

	public DespesaRefeicao(double valor, Date data) {
		this.setValor(valor);
		this.data = data;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
