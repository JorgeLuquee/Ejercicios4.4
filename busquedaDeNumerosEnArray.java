/**
 * @author Jorge Luque
 * 
 * Programa que guarda 100 numeros random del 1 al 10 y luego pide un numero N y muestra en que posiciones se han guardado ese número.
 */

import java.util.Scanner;

public class busquedaDeNumerosEnArray{
	
	public static void main(String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		int [] cienN= new int [100];
		int valorN;
		boolean encontrado;
		
		//Bucle para introducir los 100 números random
		for(int i = 0; i < 100; i++) {
			cienN [i] = (int) (1 + Math.random() * 10);
		}
		
		try {
			// Bucle para validar la entrada del usuario
            do {
                System.out.print("Introduzca un numero del 1 al 10: ");
                valorN = entrada.nextInt();

                if (valorN < 1 || valorN > 10) {
                    System.out.println("ERROR. El numero debe estar en el rango del 1 al 10.");
                }
            } while (valorN < 1 || valorN > 10);

            encontrado = false;
            System.out.print("El valor "+ valorN + " se encuentra en las posiciones: ");
            
			//Bucle para buscar por el array de los 100 números.
			for(int i = 0; i < cienN.length; i++) {
				
				//Si se encuentra pues se muestra la posición por la que vaya el bucle.
				if(cienN[i] == valorN) {
					System.out.print(i+" ");
					encontrado = true;
				}				
			}
			
			//Si no se encontró el valor, mostrar mensaje
			if (!encontrado) {
				System.out.println("No hay ningun numero con el valor " + valorN + " guardado");
			}
		}
		//Controlamos los valores que no sean válidos.
		catch(Exception e) {
			System.out.println("ERROR. Valor introducido invalido.");
		}
		//Cerramos el Scanner en el finally.
		finally {
			entrada.close();
		}
	}

}
