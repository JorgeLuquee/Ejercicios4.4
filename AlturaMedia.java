/**
 * @author Jorge Luque
 * 
 * Programa que pide N alturas y las almacena en array para luego calcular distintos tipos de alturas.
 */

import java.util.Scanner;

public class AlturaMedia {

	public static void main(String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		int valorN = 0;
		double sumaAlturas = 0;
		int contadorEncima = 0;
		int contadorDebajo = 0;
		double alturaMedia;
		double alturaMaxima = 0;
		double alturaMinima = 2000;		//Le ponemos un valor alto para que después se guarde correctamente la altura
		
		try {
			
			//Mientras N sea 0 o menor de 0 se pedirá de nuevo N
			do {
				System.out.print("Ingrese el numero de alturas que quiere introducir: ");
				valorN = entrada.nextInt();
				
				if (valorN <= 0) {
					System.out.println("");
					System.out.println("ERROR. El valor debe ser minimo 1.");
				}
			}while(valorN <= 0);
			
			//Declaramos la altura despues de pedir N
			double [] altura = new double [valorN];
		
			//Bucle para pedir las N alturas
			for(int i = 0; i < valorN; i++) {
				System.out.println("");
				System.out.print("introduzca la altura");
				altura[i] = entrada.nextDouble();
				
				if (altura[i] <= 0) {
					System.out.println("ERROR: La altura no puede ser 0 o menos de 0");
				}
				
				//Guardamos la suma de alturas
				sumaAlturas = sumaAlturas + altura[i];
				
				//Si la altura es mayor que la alturaMaxima actual se actualiza
				if(altura[i] > alturaMaxima) {
					alturaMaxima = altura[i];
				}
				
				//Si la altura es menor que la alturaMinima actual se actualiza
				if(altura[i] < alturaMinima) {
					alturaMinima = altura[i];
				}
			}
			
			//Calculamos la altura media
			alturaMedia = sumaAlturas / valorN;
			
			
			//Bucle para los contadores
			for(int i = 0; i < valorN; i++) {
				
				if (altura[i] < alturaMedia) {
					contadorDebajo++;
				}
			
				else if (altura[i] > alturaMedia) {
					contadorEncima++;
				}
			}
			
			//Mostramos los resultados
			System.out.println("");
			System.out.println("La altura media es: " + alturaMedia);
			System.out.println("");
			System.out.println("La altura maxima es: " + alturaMaxima);
			System.out.println("");
			System.out.println("La altura minima es: " + alturaMinima);
			System.out.println("");
			System.out.println("El numero de personas que estan por encima de la media de altura es: " + contadorEncima);
			System.out.println("");
			System.out.println("El numero de personas que estan por debajo de la media de altura es: " + contadorDebajo);
			System.out.println("");
			
		}
		//Excepción
		catch(Exception e) {
			System.out.println("ERROR. Valor introducido invalido.");
		} 
		//Cerramos el Scanner en el Finally
		finally {
			entrada.close();
		}
	}
}