package br.com.coding4fun;

/**
 * Classe referente ao Laboratório - Exercicio 01 - calculadora.
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class Calculadora {

	double valor1;
	double valor2;

	public Calculadora() {
	}

	public Calculadora(double valor1, double valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public double adicao() {
		return this.valor1 + this.valor2;
	}

	public double subtracao() {
		return this.valor1 + this.valor2;
	}

	public double multiplicacao() {
		return this.valor1 * this.valor2;
	}

	public double divisao() {
		return this.valor1 / this.valor2;
	}

	public double modulo() {
		return this.valor1 % this.valor2;
	}
}
