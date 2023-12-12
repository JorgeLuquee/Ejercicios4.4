import java.util.Scanner;

/**
* @author Jorge Luque
* Programa que crea un array de 100 números reales aleatorios entre 0.0 y 1.0 y luego pide al usuario un R
* por último muestra cuantos valores son igual o superior a R
**/

public class cienRealesRandom{

	public static void main(String [] args){
	
		Scanner entrada = new Scanner (System.in);
		double[] numerosAleatorios = new double[100];	//Array de los 100 números random.
		double R;

		for(int i = 0; i < 100; i++){
			numerosAleatorios[i] = Math.random();	//Introducimos los 100 valores entre 0 y 1.
		}
		
		System.out.print("Ingrese un numero real: ");
		R = entrada.nextDouble();

		for (int i = 0; i < 100; i++){
			if (numerosAleatorios[i] >= R){		//Si el valor es igual o mayor se muestra.
				System.out.println("");
				System.out.println(numerosAleatorios[i]);
			}
		}
		//Cerramos el Scanner.
		entrada.close();	
	}
}