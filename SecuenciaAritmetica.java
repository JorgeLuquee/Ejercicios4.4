/**
 * @author Jorge Luque
 * 
 * Programa que pide dos valores I y V y crea una secuencia aritmética de dichos números, además de que pedirá cuantos números se van a crear.
 */

import java.util.Scanner;

public class SecuenciaAritmetica {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int valorN = 0, valorI = 0, valorVinicial = 0;

        try {
        	
        	//Pedimos todos los valores al usuario.
            System.out.print("Introduce el valor inicial de V: ");
            valorVinicial = entrada.nextInt();
            System.out.println("");

            System.out.print("Introduce el valor I: ");
            valorI = entrada.nextInt();
            System.out.println("");

            do {
            	
            	//Mientras N sea menor o igual que 0 el programa se lo volverá a pedir.
                System.out.print("Introduce cuántos valores quieres que tenga la secuencia: ");
                valorN = entrada.nextInt();
                System.out.println("");

                if (valorN <= 0) {
                    System.out.println("ERROR. El valor debe ser mayor de 0");
                    System.out.println("");
                }
            } while (valorN <= 0);

            //Declaramos el array ahora para que no de error al ejecutar.
            int[] valorV = new int[valorN];
            valorV[0] = valorVinicial;

            // Crear y mostrar la secuencia aritmética
            System.out.println("La secuencia es: ");

            for (int i = 0; i < valorN; i++) {
                System.out.print(valorV[i] + " ");
                if (i < valorN - 1) {
                    valorV[i + 1] = valorV[i] + valorI;
                }
            }
            //Excepción.
        } catch (Exception e) {
            System.out.println("ERROR. Valor introducido inválido.");
            
            //Cerramos el scanner en el finally.
        } finally {
            entrada.close();
        }
    }
}
