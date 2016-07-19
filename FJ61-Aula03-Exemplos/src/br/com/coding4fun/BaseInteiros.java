package br.com.coding4fun;

/**
 * Classe com exemplo de manipulacao de bases inteiros (slide x).
 *
 * @author Ryan Padilha <ryan@coding4fun.com.br>
 * @since 0.1
 *
 */
public class BaseInteiros {
	public static void main(String[] args) {
		// representação do número 357 em bases diferentes
		int baseDecimal = 357;
		int baseOctal = 0545;
		int baseHexadecimal = 0x165;
		int baseBinaria = 0b101100101;

		System.out.println("Base decimal: " + baseDecimal);
		System.out.println("Base octal [0545]: " + baseOctal);
		System.out.println("Base hexadecimal [0x165]: " + baseHexadecimal);
		System.out.println("Base binaria [0b101100101]: " + baseBinaria);

		// representação literal com underscore (java7+)
		baseDecimal = 200_839_920;
		baseOctal = 05_45;
		baseHexadecimal = 0x10_BA_22;
		baseBinaria = 0b1_0_11_00_1_01;

		System.out.println("Base decimal: " + baseDecimal);
		System.out.println("Base octal [05_45]: " + baseOctal);
		System.out.println("Base hexadecimal [0x10_BA_22]: " + baseHexadecimal);
		System.out.println("Base binaria [0b1_0_11_00_1_01]: " + baseBinaria);
	}
}
