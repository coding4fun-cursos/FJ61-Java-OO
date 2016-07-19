package br.com.coding4fun;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * Classe Rifa contendo resolução do exercício 01 - Aula 06.
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class Rifa {
	public static void main(String[] args) {
		// armazenando os nomes informados
		String[] nomes = new String[8];
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite seu nome");
		}

		// realizando o sorteio
		Arrays.sort(nomes);

		String input = JOptionPane.showInputDialog("Informe um número de 1 a 8");
		int numero = Integer.parseInt(input);
		String nomeSorteado = "Nenhum nome foi sorteado.";

		if (numero >= 1 && numero <= 8) {
			nomeSorteado = nomes[numero - 1];
		}

		System.out.println("Nome sorteado: " + nomeSorteado);
	}
}
