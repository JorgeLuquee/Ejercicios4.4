/**
 * @author Jorge Luque
 * 
 * Programa que guarda en dos arrays números del 1 al 100 de menor a mayor y de menor a mayor
 */

public class NumerosInversos {
	
	public static void main(String [] args) {
		
		int [] Ascendentes = new int [100];		//Primer array
		int [] Descendentes = new int [100];	//Segundo array
		
		System.out.println("Numeros del 1 al 100");
		
		//Bucle que va desde 1 al 100 mostrando los números uno a uno
		for(int i = 0; i < 100; i++) {
			Ascendentes[i] = i + 1;
			System.out.println("");
			System.out.println(Ascendentes[i]);
		}
		
		System.out.println("");
		System.out.println("Numeros del 100 al 1");
		
		//En este bucle Descendentes será igual a el numero de la posición 99 del primer bucle, es decir 100 - por el número por el que vaya el segundo bucle
		for(int i = 0; i < 100; i++) {
			Descendentes[i] = Ascendentes[99-i];
			System.out.println("");
			System.out.println(Descendentes[i]);
		}
	}
}