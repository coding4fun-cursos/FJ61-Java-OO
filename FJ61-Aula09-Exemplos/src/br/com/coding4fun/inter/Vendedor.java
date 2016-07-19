package br.com.coding4fun.inter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Classe Vendedor - encapsule o que varia (slide 13).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class Vendedor {
	private String nome;
	private List<Despesa> despesas = new ArrayList<>();

	public void adicionarDespesa(Despesa despesa) {
		Objects.requireNonNull(despesa, "despesa não pode ser nulo.");
		despesas.add(despesa);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double calcularReembolso() {
		double reembolso = 0;

		for (Despesa despesa : despesas) {
			reembolso += despesa.getValor();
		}

		return reembolso;
	}
}
