package br.com.coding4fun;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

/**
 * Classe com exemplo de utilização de java.lang.System (slide 08).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class JavaSystem {
	public static void main(String[] args) throws IOException {
		PrintStream err = System.err;
		InputStream in = System.in;
		PrintStream out = System.out;

		err.println("[erro] Mensagem utilizando saída de erro padrão.");
		err.flush();

		out.println("Usuário local: " + System.getProperty("user.name"));
		out.println("Hora em milisegundos: " + System.currentTimeMillis());

		System.gc();

		Properties properties = System.getProperties();
		Set<Entry<Object, Object>> entrySet = properties.entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			out.println("Propriedade: " + entry);
		}

		int count = 0;
		Scanner scanner = new Scanner(in);
		System.out.println("Informe sua idade: ");
		System.out.println("Idade: " + scanner.nextInt());

		System.out.println("Informe sua linguagem de programação favorita: ");

		while (scanner.hasNext()) {
			count++;
			System.out.println("Nome [" + count + "]: " + scanner.next());
		}

		System.out.println("Final da contagem de token em uma string.");
		scanner.close();
		System.exit(0);
	}
}
