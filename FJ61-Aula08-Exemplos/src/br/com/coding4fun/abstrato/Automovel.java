package br.com.coding4fun.abstrato;

/**
 * Classe com exemplo de herança (slide x).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class Automovel extends Veiculo {

	private String volante;

	public void arrancar() {
		System.out.println("Veiculo arrancando.");
	}

	@Override
	void acelerar() {
		this.setVelocidade(20);
	}

	public String getVolante() {
		return volante;
	}

	public void setVolante(String volante) {
		this.volante = volante;
	}

}
