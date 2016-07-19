package br.com.coding4fun.abstrato;

/**
 * Classe com exemplo de utilização de abstract (slide x).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public abstract class Veiculo {
	private long id;
	private String marca;
	private String modelo;
	private double velocidade;

	@SuppressWarnings("unused")
	private boolean ligado;

	public void ligar() {
		this.ligado = true;
	}

	public void desligar() {
		this.ligado = false;
	}

	// método abstrato - somente assinatura
	abstract void acelerar();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

}
