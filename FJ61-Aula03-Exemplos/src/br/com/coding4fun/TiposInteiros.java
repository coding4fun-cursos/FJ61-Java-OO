package br.com.coding4fun;

/**
 * Classe com exemplo de manipulacao de tipos inteiros (slide x).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class TiposInteiros {
	public static void main(String[] args) {
		byte valueByte = 125;
		short valueShort = 32765;
		int valueInt = 2147483645;
		long valueLong = 9223372036854775805L;
		int valueIntError = 0;

		valueByte += 1;
		valueShort += 1;
		valueInt += 1;
		valueLong += 1;

		System.out.println("Valor de valueByte = " + valueByte);
		System.out.println("Valor de valueShort = " + valueShort);
		System.out.println("Valor de valueInt = " + valueInt);
		System.out.println("Valor de valueLong = " + valueLong);

		valueLong /= valueIntError; // error, divisao por zero
	}
}
