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

			num1=entrada.nextDouble();


	

			System.out.println("ingrese numero real 2");


			num2=entrada.nextDouble();


			System.out.println(
					"(6) Mostrar division de ambos numeros\n (7) mostrar division y residuo de ambos numeros\n (8) ingrese caracter de la cadena ingresar longitud de arreglo ");

				numberOperations();


			break;

			case 3: 

			System.out.println("(9) show in screen the arrays type\n (10) indicate average value of the values etered into the array\n (11) indicate higher value\n (12) make operation with arrays\n (13) link the tree arrays typed \n (14) intercept arrays typed \n (15) turn array type \n (16) sort array ");

			operationsWhitArrays();
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

	public static void numberOperations(){

		opciones2 = entrada.nextInt();

		if (num1<0 && num2<0){

			System.out.println("the num int is less than zero");

		}	else{

					switch (opciones2){

			

				
			

					case 6:
		
					
		
						
		
					 
						System.out.println("la division de ambos numeros es "+num1/num2);
		
						
		
					break;
					
		
					case 7:

						System.out.println("la division de ambos numeros es "+num1/num2+ "el residuo es "+ num1%num2);

					break;

					case 8:

					

					}


				}
			




			

		

	}

	public static  int operationsWhitArrays(int[] array1,int[] array2,int[] array3 ){
		
		

	System.out.println("int the long of array");

	size=entrada.nextInt();

	System.out.println("type "+size +" numbers for array 1");

	opciones2=entrada.nextInt();

	switch(opciones2){

	case 9:

	

	for (int i=0; i<array1.length; i++ ){

		  

	}

	return System.out.println("the value of the arrays is"+ array1[size]);

	break;


	}

	
	 
	

	





	}




	public static void main(String[] args) {

		desplegarMenu1();

		int array1[] = new int[size];

		size=entrada.nextInt();

		int array2[] = new int[size];

		size=entrada.nextInt();

		int array[] = new int[size];

		int result[] = new int[size];


		



	}

}