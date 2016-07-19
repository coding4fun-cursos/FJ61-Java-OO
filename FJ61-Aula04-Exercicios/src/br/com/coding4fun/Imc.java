package br.com.coding4fun;

import javax.swing.JOptionPane;

/**
 * Classe IMC contendo resolução do exercício 01 - Aula 04.
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class Imc {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		String inputPeso = JOptionPane.showInputDialog("Informe seu peso (KG)");
		String inputAltura = JOptionPane.showInputDialog("Informe sua altura (metros)");

		String mensagem = "Indefinido";
		double resultado = 0, peso = 0, altura = 0;

		try {
			peso = Double.parseDouble(inputPeso);
			altura = Double.parseDouble(inputAltura);

			resultado = Math.round(peso / (altura * altura));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Exception: " + e.toString());
		}

		if (resultado < 18.5) {
			mensagem = "Abaixo do peso ideial";
		} else if (resultado >= 18.5 && resultado <= 24.9) {
			mensagem = "Parabéns - seu peso é normal!";
		} else if (resultado >= 25 && resultado <= 29.9) {
			mensagem = "Acima de seu peso (sobrepeso)";
		} else if (resultado >= 30 && resultado <= 34.9) {
			mensagem = "Obesidade grau I";
		} else if (resultado >= 35 && resultado <= 39.9) {
			mensagem = "Obesidade grau II";
		} else if (resultado >= 40) {
			mensagem = "Obesidade grau III";
		}

		JOptionPane.showMessageDialog(null,
				"Nome: " + nome + ".\nResultado do IMC: " + mensagem + "\nValor: " + resultado);
	}
}
