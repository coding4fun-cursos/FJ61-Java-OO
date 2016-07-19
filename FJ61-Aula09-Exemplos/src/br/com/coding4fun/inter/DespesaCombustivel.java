package br.com.coding4fun.inter;

/**
 * Despesa de combustível (slide 13).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class DespesaCombustivel extends Despesa {

	private String placa;
	private String kmInicial;
	private String kmFinal;

	public DespesaCombustivel(double valor, String placa, String kmInicial, String kmFinal) {
		this.setValor(valor);
		this.placa = placa;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(String kmInicial) {
		this.kmInicial = kmInicial;
	}

	public String getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(String kmFinal) {
		this.kmFinal = kmFinal;
	}

}
