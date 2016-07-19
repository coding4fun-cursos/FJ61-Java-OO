package br.com.coding4fun.inter;

import java.util.Calendar;

/**
 * Classe executável de calculo de reembolso mensal.
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class ReembolsoMensal {
	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor();
		vendedor.adicionarDespesa(new DespesaCombustivel(200, "FWK-9011", "100200", "100300"));
		vendedor.adicionarDespesa(new DespesaTelefonia(90, "(19) 98029-0920"));
		vendedor.adicionarDespesa(new DespesaRefeicao(560, Calendar.getInstance().getTime()));

		System.out.println("Valor total do reembolso R$ " + vendedor.calcularReembolso());
	}
}
