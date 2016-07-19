package br.com.coding4fun.abstrato;

/**
 * Classe com exemplo de herança (slide x).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class Motocicleta extends Veiculo {

	private String guidao;

	public void empinar() {
		System.out.println("Empinando a moto.");
	}

	@Override
	void acelerar() {
		this.setVelocidade(5);
	}

	public String getGuidao() {
		return guidao;
	}

	public void setGuidao(String guidao) {
		this.guidao = guidao;
	}

}
