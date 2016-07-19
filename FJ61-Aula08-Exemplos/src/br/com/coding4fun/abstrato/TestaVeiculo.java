package br.com.coding4fun.abstrato;

/**
 * Classe com exemplo de testes de veiculos (slide x).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class TestaVeiculo {
	public static void main(String[] args) {
		Veiculo automovel = new Automovel();
		Veiculo motocicleta = new Motocicleta();

		TestaVeiculo testaVeiculo = new TestaVeiculo();

		testaVeiculo.mecanismoAceleracao(automovel);
		System.out.println("Automovel acelerando: " + automovel.getVelocidade());

		if (automovel instanceof Automovel) {
			((Automovel) automovel).arrancar();
		}

		testaVeiculo.mecanismoAceleracao(motocicleta);
		System.out.println("Motocicleta acelerando: " + motocicleta.getVelocidade());

		if (motocicleta instanceof Motocicleta) {
			((Motocicleta) motocicleta).empinar();
		}

	}

	public void mecanismoAceleracao(Veiculo veiculo) {
		veiculo.acelerar();
	}
}
