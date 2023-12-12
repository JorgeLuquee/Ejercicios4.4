/**
 * @author Jorge Luque
 * 
 * Programa que crea un array de 10 enteros y luego pide 3 opciones mediante un menú.
 */

import java.util.Scanner;

public class MenuDeValores {
	
	public static void main(String [] args) {
		
		Scanner entrada = new Scanner (System.in);
		int [] Valores = new int [10];
		char Letra;
		String Opcion;
		int Caso = 0;
		int Posicion;
		
		try {
			do {
				//Mostramos el menú
				System.out.println("a. Mostrar valores.");
				System.out.println("b. Introducir valor.");
				System.out.println("c. Salir");
				System.out.println("");
				System.out.println("Introduzca la opcion que desea realizar: ");
				System.out.println("");
				Opcion = entrada.nextLine();
				Letra = Opcion.charAt(0);
				
				//Si la opción está fuera del rango mostramos el mensaje de error.
				if (Letra != 'a' && Letra !='A' && Letra != 'b' && Letra != 'B' && Letra != 'c' && Letra != 'C') {
					System.out.println("Valor introducido invalido");
					System.out.println("");
				}
				
				//Controlamos que las opciones puedan ser mayúsculas o minúsculas y le asignamos un valor para los casos del switch que haremos a continuación.
				if (Letra == 'a' || Letra == 'A') {
					Caso = 1;
				}
				
				if (Letra == 'b' || Letra == 'B') {
					Caso = 2;
				}
				
				//Switch para las opciones
				switch(Caso) {
				
				//Mostrar todos los valores con un for y el array.
				case 1:
					for(int i = 0; i < 10; i++) {
						System.out.println(Valores[i]);
						System.out.println("");
						}
					break;
					
				//Introducir primero la posición y después el número.	
				case 2:
					do {
						System.out.print("Introduzca la posición del numero que quiere introducir (del 1 al 10): ");
						Posicion = entrada.nextInt();
						System.out.println("");
						
						//Si el valor está fuera de rango muestra un mensaje de error.
						if(Posicion > 10 || Posicion <= 0) {
							System.out.println("ERROR. Numero fuera de rango");
							System.out.println("");
						}
						
						//Si es válido mediante un bucle buscamos la posición introducida y le pedimos que introduzca el número.
						else {
							for(int i = 0; i < 10; i++) {
								if (i == Posicion) {
									System.out.print("Introduzca el numero: ");
									Valores [i] = entrada.nextInt();
									entrada.nextLine();	//Limpiamos el Buffer.
								}
							}
						}
						
					}while(Posicion > 10 || Posicion <= 0);
					
					
				}
			}while(Letra != 'C' && Letra != 'c');
		}
		//Excepción con mensaje de error.
		catch(Exception e) {
			System.out.println("ERROR. Valor no valido.");
		}
		
		//Cerramos el Scanner en el finally.
		finally{
			entrada.close();
		}
	}

}