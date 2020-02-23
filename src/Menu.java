
import java.util.Scanner;

public class Menu {

	static Scanner entrada = new Scanner(System.in);

	private final static int PALABRAS = 1;

	private final static int NUMEROS = 2;

	private final static int ARREGLOS = 3;

	private static int opciones;

	private static double num1, num2;

	private static int opciones2;

	private static int posicion;

	static String palabras[] = new String[3];

	static int size;

	static int array1[];

	static int array2[];

	static int array3[];

	static double result;

	static int a;

	public static void desplegarMenu1() {

		System.out.println(
				"-------MENU---------\n (1) Ingresar tres palabras\n  (2) Ingresar dos  numeros reales mayores a cero\n  (3) ingresar tres arreglos de numeros enteros(3) ");
		opciones = entrada.nextInt();

		entrada.nextLine();

		switch (opciones) {

			case 1:

				if (opciones == 1) {

					System.out.println("ingrese tres palabra");
					// palabras[0] = entrada.nextLine();
					// palabras[1] = entrada.nextLine();
					// palabras[2] = entrada.nextLine();

					for (int i = 0; i < ARREGLOS; i++) {

						palabras[i] = entrada.nextLine();

						// System.out.println("se imprimio la palabra" + palabras[i] );

					}

					// System.out.println(palabras[0]+""+palabras[1]+palabras[2]);
					System.out.println(
							"(3) Desplegar la lingitud de cada una de las cadenas\n (4) concatenar las tres cadenas\n (5) ingrese caracter de la cadena ");

					opciones2 = entrada.nextInt();

					operacionesConPalabras();

				}

				break;

			case 2:

				System.out.println("ingrese numero real 1");

				num1 = entrada.nextDouble();

				System.out.println("ingrese numero real 2");

				num2 = entrada.nextDouble();

				System.out.println(
						"(6) Mostrar division de ambos numeros\n (7) mostrar division y residuo de ambos numeros\n (8) ingrese caracter de la cadena ");

				numberOperations();

				break;

			case 3:

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

				opciones2 = entrada.nextInt();

				switch (opciones2) {

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



					

						

						

					

					
					

				}

		}

	}

	public static void operacionesConPalabras() {

		switch (opciones2) {

			case 3:

				String resul = "";

				for (int i = 0; i < ARREGLOS; i++) {

					resul += palabras[i];

					System.out.println(resul);

				}

				break;

			case 4:
				System.out.println(palabras[0] + "" + palabras[1] + "" + palabras[2]);

				break;

			case 5:

				System.out.println("type a position");

				posicion = entrada.nextInt();

				posicion--;

				if (posicion > palabras[0].length() && posicion > palabras[1].length() && posicion > palabras[2].length()) {

					System.out.println("the position type is bigger than string ");

				} else {

					System.out.println(palabras[0].charAt(posicion) + "\n" + palabras[1].charAt(posicion) + "\n"
							+ palabras[2].charAt(posicion));

				}
				break;

		}

	}

	public static void numberOperations() {

		opciones2 = entrada.nextInt();

		if (num1 < 0 && num2 < 0) {

			System.out.println("the num int is less than zero");

		} else {

			switch (opciones2) {

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

		opciones2 = entrada.nextInt();

		int suma;

		switch (opciones2) {

			case 1:

				suma = 0;

				for (int i = 0; i < array1.length; i++) {

					suma += array1[i];

				}

				result = suma / array1.length;

				break;

			case 2:

				suma = 0;

				for (int i = 0; i < array2.length; i++) {

					suma += array2[i];

				}

				result = suma / array2.length;

				break;

			case 3:

				suma = 0;

				for (int i = 0; i < array3.length; i++) {

					suma += array3[i];

				}

				

				result = suma / array3.length;

				break;

		}

		return result;

	}

	public static double operationsWithArrays3(int[] array1, int[] array2, int[] array3){

		System.out.println("select a array \n (1) for array1 \n (2) for array2 \n (3) for array3");

		opciones2 = entrada.nextInt();

		int elMayor=0;

		switch (opciones2) {

			case 1:

			elMayor = Integer.MIN_VALUE;

				
				elMayor=0;

				for (int i = 0; i < array1.length; i++) {

					for (int j=0; j< array1.length; j++){

						if (array1[i]>array1[j]){

							elMayor=array1[i];
	
						}
						
						
					}

					

				}

				break;

				

			case 2:

				elMayor = Integer.MIN_VALUE;

				elMayor = 0;

				for (int i = 0; i < array2.length; i++) {

					for (int j=0; j< array2.length; j++){

						if (array2[i]>array2[j]){

							elMayor=array2[i];
	
						}
						
						
					}

					

				}

				break;

			case 3:

				elMayor = 0;

				

				for (int i = 0; i < array3.length; i++) {

					for (int j=0; j< array3.length; j++){

						if (array3[i]>array3[j]){

						elMayor=array3[i];

						}
					}
					
				}

				
			
			break;

			

		}

		return elMayor;

	}

	//public static double operationsWithArrays4(int[] array1, int[] array2, int[] array3){

		//System.out.println("select the operation \n (1) multiply \n (2) divide \n (3) subtract");

		//opciones2 = entrada.nextInt();

		//switch (opciones2){

			//case 1:

			//System.out.println("select two arrays \n (1) for array1 and array2 \n (2) for array1 and array3 \n (3) for array2 and array3");

			//opciones2 = entrada.nextInt();

			//switch(opciones2){

				//case 1:

				
			//}

		//}



		

		




	//}




	



	public static void main(String[] args) {

		desplegarMenu1();

	}

}