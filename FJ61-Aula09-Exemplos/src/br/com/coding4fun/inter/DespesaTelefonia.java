package br.com.coding4fun.inter;

/**
 * Despesa de telefonia (slide 13).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class DespesaTelefonia extends Despesa {

	private String numero;

	public DespesaTelefonia(double valor, String numero) {
		this.setValor(valor);
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
