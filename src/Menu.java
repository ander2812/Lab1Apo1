
import java.util.Scanner;

public class Menu {

	static Scanner entrada = new Scanner(System.in);

	private final static int WORDS = 1;

	private final static int NUMBERS = 2;

	private final static int ARRAYS = 3;

	private static int options;

	private static double num1, num2;

	private static int options2;

	private static int position;

	static String[] words = new String[3];

	static int size;

	static int array1[];

	static int array2[];

	static int array3[];

	static double result;

	static int operations[];

	static int a;

	public static void desplegarMenu1() {

		System.out.println(
				"-------MENU---------\n (1) Ingresar tres palabras\n  (2) Ingresar dos  numeros reales mayores a cero\n  (3) ingresar tres arreglos de numeros enteros(3) ");
		options = entrada.nextInt();

		entrada.nextLine();

		switch (options) {

			case WORDS:

				if (options == 1) {

					System.out.println("ingrese tres palabra");
					// palabras[0] = entrada.nextLine();
					// palabras[1] = entrada.nextLine();
					// palabras[2] = entrada.nextLine();

					for (int i = 0; i < ARRAYS; i++) {

						words[i] = entrada.nextLine();

						// System.out.println("se imprimio la palabra" + palabras[i] );

					}

					// System.out.println(palabras[0]+""+palabras[1]+palabras[2]);
					System.out.println(
							"(3) Desplegar la lingitud de cada una de las cadenas\n (4) concatenar las tres cadenas\n (5) ingrese caracter de la cadena ");

					options2 = entrada.nextInt();

					operacionesConPalabras();

				}

				break;

			case NUMBERS:

				System.out.println("ingrese numero real 1");

				num1 = entrada.nextDouble();

				System.out.println("ingrese numero real 2");

				num2 = entrada.nextDouble();

				System.out.println(
						"(6) Mostrar division de ambos numeros\n (7) mostrar division y residuo de ambos numeros\n (8) ingrese caracter de la cadena ");

				numberOperations();

				break;

			case ARRAYS:

				System.out.println("enter array1 size");

				size = entrada.nextInt();

				int array1[] = new int[size];

				System.out.println("enter array2 size");

				size = entrada.nextInt();

				int array2[] = new int[size];

				System.out.println("enter array3 size");

				size = entrada.nextInt();

				int array3[] = new int[size];

				System.out.println("enter numbers for array1");

				for (int i = 0; i < array1.length; i++) {

					array1[i] = entrada.nextInt();

				}

				System.out.println("enter numbers for array2");

				for (int i = 0; i < array2.length; i++) {

					array2[i] = entrada.nextInt();

				}

				System.out.println("enter numbers for array3");

				for (int i = 0; i < array3.length; i++) {

					array3[i] = entrada.nextInt();

				}

				System.out.println(
						"(9) show in screen the arrays type\n (10) indicate average value of the values etered into the array\n (11) indicate higher value\n (12) make operation with arrays\n (13) link the tree arrays typed \n (14) intercept arrays typed \n (15) turn array type \n (16) sort array ");

				int[] s = operationsWithArrays5(array1, array2, array3);
				options2 = entrada.nextInt();

				switch (options2) {

					case 9:

						System.out.println("the result is equal to " + operationsWithArrays(array1, array2, array3));

						break;

					case 10:

						System.out.println("the result is equal to " + operationsWithArrays2(array1, array2, array3));

						break;

					case 11:

						System.out.println("the number higher  is " + operationsWithArrays3(array1, array2, array3));

						break;

					case 12:

						if (array1.length == array2.length && array1.length == array3.length) {

							int[] o = operationsWithArrays4(array1, array2, array3);

							for (int i = 0; i < o.length; i++) {

								System.out.println("The result of operation is " + o[i]);

							}

						} else {
							System.out.println("remember that to use this option the arrays must to have iqual size");
						}

						break;

					case 13:

						s = operationsWithArrays5(array1, array2, array3);

						for (int i = 0; i < s.length; i++) {

							System.out.println(s[i]);
						}

					case 14:

						int[] k = duplicate(s);

						for (int i = 0; i < k.length; i++) {

							if (k[i] != 0) {
								System.out.print(k[i]+ " ");
							}

						}

				}

		}

	}

	public static void operacionesConPalabras() {

		switch (options2) {

			case 3:

				String resul = "";

				for (int i = 0; i < ARRAYS; i++) {

					resul += words[i];

					System.out.println(resul);

				}

				break;

			case 4:
				System.out.println(words[0] + "" + words[1] + "" + words[2]);

				break;

			case 5:

				System.out.println("type a position");

				position = entrada.nextInt();

				position--;

				if (position > words[0].length() && position > words[1].length() && position > words[2].length()) {

					System.out.println("the position type is bigger than string ");

				} else {

					System.out.println(words[0].charAt(position) + "\n" + words[1].charAt(position) + "\n"
							+ words[2].charAt(position));

				}
				break;

		}

	}

	public static void numberOperations() {

		options2 = entrada.nextInt();

		if (num1 < 0 && num2 < 0) {

			System.out.println("the num int is less than zero");

		} else {

			switch (options2) {

				case 6:

					System.out.println("la division de ambos numeros es " + num1 / num2);

					break;

				case 7:

					System.out
							.println("la division de ambos numeros es " + num1 / num2 + "el residuo es " + num1 % num2);

					break;

				case 8:

			}

		}

	}

	public static String operationsWithArrays(int[] array1, int[] array2, int[] array3) {

		String c = "";

		c += "\n array1:\n";

		for (int i = 0; i < array1.length; i++) {

			c += " " + array1[i];

		}

		c += "\n array2:\n";

		for (int i = 0; i < array2.length; i++) {

			c += " " + array2[i];

		}

		c += "\n array3:\n";

		for (int i = 0; i < array3.length; i++) {

			c += " " + array3[i];

		}

		return c;

	}

	public static double operationsWithArrays2(int[] array1, int[] array2, int[] array3) {

		System.out.println("select a array \n (1) for array1 \n (2) for array2 \n (3) for array3");

		options2 = entrada.nextInt();

		int sum;

		switch (options2) {

			case 1:

				sum = 0;

				for (int i = 0; i < array1.length; i++) {

					sum += array1[i];

				}

				result = sum / array1.length;

				break;

			case 2:

				sum = 0;

				for (int i = 0; i < array2.length; i++) {

					sum += array2[i];

				}

				result = sum / array2.length;

				break;

			case 3:

				sum = 0;

				for (int i = 0; i < array3.length; i++) {

					sum += array3[i];

				}

				result = sum / array3.length;

				break;

		}

		return result;

	}

	public static double operationsWithArrays3(int[] array1, int[] array2, int[] array3) {

		System.out.println("select a array \n (1) for array1 \n (2) for array2 \n (3) for array3");

		options2 = entrada.nextInt();

		int theOldest = 0;

		switch (options2) {

			case 1:

				theOldest = Integer.MIN_VALUE;

				theOldest = 0;

				for (int i = 0; i < array1.length; i++) {

					for (int j = 0; j < array1.length; j++) {

						if (array1[i] > array1[j]) {

							theOldest = array1[i];

						}

					}

				}

				break;

			case 2:

				theOldest = Integer.MIN_VALUE;

				theOldest = 0;

				for (int i = 0; i < array2.length; i++) {

					for (int j = 0; j < array2.length; j++) {

						if (array2[i] > array2[j]) {

							theOldest = array2[i];

						}

					}

				}

				break;

			case 3:

				theOldest = 0;

				for (int i = 0; i < array3.length; i++) {

					for (int j = 0; j < array3.length; j++) {

						if (array3[i] > array3[j]) {

							theOldest = array3[i];

						}
					}

				}

				break;

		}

		return theOldest;

	}

	public static int[] operationsWithArrays4(int[] array1, int[] array2, int[] array3) {
		int operations[] = new int[array1.length];

		System.out.println("select the operation \n (1) multiply \n (2) sum \n (3) divide \n (4) subtract");

		options2 = entrada.nextInt();

		switch (options2) {

			case 1:

				System.out.println(
						"select two arrays \n (1) for array1 and array2 \n (2) for array2 and array3 \n (3) for array3 and array1 ");

				options2 = entrada.nextInt();

				switch (options2) {

					case 1:

						for (int i = 0; i < operations.length; i++) {

							operations[i] = array1[i] * array2[i];

						}

						break;

					case 2:

						for (int i = 0; i < operations.length; i++) {

							operations[i] = array2[i] * array3[i];

						}

						break;

					case 3:

						for (int i = 0; i < operations.length; i++) {

							operations[i] = array3[i] * array1[i];

						}

						break;

				}

			case 2:

				System.out.println(
						"select two arrays \n (1) for array1 and array2 \n (2) for array2 and array3 \n (3) for array3 and array1 ");

				options2 = entrada.nextInt();

				switch (options2) {

					case 1:

						for (int i = 0; i < operations.length; i++) {

							operations[i] = array1[i] + array2[i];

						}

						break;

					case 2:

						for (int i = 0; i < operations.length; i++) {

							operations[i] = array2[i] + array3[i];

						}

						break;

					case 3:

						for (int i = 0; i < operations.length; i++) {

							operations[i] = array1[i] + array3[i];

						}

						break;

				}

			case 3:

			case 4:

				System.out.println(
						"select two arrays \n (1) for array1 and array2 \n (2) for array2 and array3 \n (3) for array3 and array1 \n (4) for array2 and array1 \n (5) array3 and array2 \n (6) for array1 and array3 ");

				options2 = entrada.nextInt();

				switch (options) {

					case 1:

						for (int i = 0; i < operations.length; i++) {

							operations[i] = array1[i] - array2[i];

						}

					case 2:

						for (int i = 0; i < operations.length; i++) {

							operations[i] = array2[i] - array3[i];

						}

						break;

					case 3:

						for (int i = 0; i < operations.length; i++) {

							operations[i] = array3[i] - array1[i];

						}

						break;

					case 4:

						for (int i = 0; i < operations.length; i++) {

							operations[i] = array2[i] - array1[i];

						}

					case 5:

						for (int i = 0; i < operations.length; i++) {

							operations[i] = array3[i] - array2[i];

						}

						break;
				}

		}

		return operations;

	}

	public static int[] operationsWithArrays5(int[] array1, int[] array2, int[] array3) {

		int[] array = new int[array1.length + array2.length + array3.length];

		for (int i = 0; i < array.length; i++) {

			if (i > -1 && i < array1.length) {
				array[i] = array1[i];
			}

			if (i > array1.length - 1 && i < array1.length + array2.length) {

				array[i] = array2[i - array1.length];

			}

			if (i > array1.length + array2.length - 1) {

				array[i] = array3[i - (array1.length + array2.length)];

			}

		}

		return array;

	}

	public static int operationsWithArrays6(int[] s) {

		int count = 0;

		for (int i = 0; i < s.length; i++) {

			if (s[i] != 0) {

				count++;
			}

		}

		return count;
	}

	public static int[] duplicate(int[] s) {

		int nums[] = new int[operationsWithArrays6(s)];
		;

		for (int i = 0; i < s.length; i++) {

			for (int j = i + 1; j < s.length; j++) {

				if ((s[i] != 0 && s[j] != 0) && s[i] == s[j]) {

					s[j] = 0;

				}

			}

			int j = 0;

			for (int k = 0; k < s.length; k++) {

				if (s[k] != 0) {

					nums[j] = s[k];

					j++;
				}
			}

		}

		return nums;

	}

	public static void main(String[] args) {

		desplegarMenu1();

	}

}