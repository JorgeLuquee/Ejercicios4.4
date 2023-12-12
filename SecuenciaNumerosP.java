/**
 * @author Jorge Luque
 * 
 * Programa que realiza mediante un array una secuencia triangular y la muestra hasta el 10.
 */
import java.util.Scanner;

public class SecuenciaNumerosP {

    public static void main(String[] args) {
        
    	Scanner entrada = new Scanner(System.in);
    	
    	//Definimos el número de filas para la secuencia
        int filas = 10;
        //Calculamos el tamaño necesario para almacenar la secuencia
        int tamanoArray = filas * (filas + 1) / 2;
        //Creamos un array para almacenar la secuencia de números triangulares
        int[] secuencia = new int[tamanoArray];

        try {
        	 //Inicializamos el índice para rastrear la posición en el array
            int indice = 0;

            //Generamos la secuencia utilizando dos bucles anidados
            for (int i = 1; i <= filas; i++) {
                for (int j = 0; j < i; j++) {
                    secuencia[indice] = i;
                    indice++;
                }
            }

            //Mostramos la secuencia
            System.out.println("La secuencia es:");

            //Utilizamos un bucle para imprimir cada valor de la secuencia
            for (int i = 0; i < tamanoArray; i++) {
                System.out.print(secuencia[i] + " ");
            }
        } 
        //Excepción
        catch (Exception e) {
            System.out.println("ERROR. Valor invalido.");    
        }
        //Cerramos el Scanner en el finally
        finally {
            entrada.close();
        }
    }
}
