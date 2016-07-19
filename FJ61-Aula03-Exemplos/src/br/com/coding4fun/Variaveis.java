package br.com.coding4fun;

/**
 * Classe com exemplo de declaracao de variaveis (slide x).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class Variaveis {
	public static void main(String[] args) {
		char sexo = 'F';
		byte idade = 32;
		short codigoAluno = 256;
		float nota = 9.9F;
		int alunosGraduacao = 1000, classes = 200;
		long habitantes = 90319000;
		double valorEuro = 4.5;
		boolean isActive = false;

		System.out.println("sexo: " + sexo + ", idade: " + idade);
		System.out.println("nota: " + nota + ", codigo: " + codigoAluno);
		System.out.println("alunos graduacao: " + alunosGraduacao + ", quantidade classes: " + classes);
		System.out.println("habitantes: " + habitantes + ", valor Euro: " + valorEuro);
		System.out.println("aluno ativo: " + isActive);
	}
}
