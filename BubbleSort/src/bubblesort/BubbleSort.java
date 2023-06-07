
package bubblesort;

import java.util.Random;

/**
 *
 * @author jorge
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int TAM = 50;
        int[] vec = new int[TAM];
        Random rand = new Random();

        // Llenar el arreglo con números aleatorios
        for (int i = 0; i < TAM; i++) {
            vec[i] = rand.nextInt(100); // Generar un número aleatorio entre 0 y 99
        }

        // Imprimir el arreglo original
        System.out.println("Arreglo original:");
        imprimirArreglo(vec);

        // Ordenar el arreglo usando el algoritmo de burbuja
        for (int i = 0; i < TAM - 1; i++) {
            for (int j = 0; j < TAM - i - 1; j++) {
                if (vec[j] > vec[j+1]) {
                    int temp = vec[j];
                    vec[j] = vec[j+1];
                    vec[j+1] = temp;
                }
            }
        }

        // Imprimir el arreglo ordenado
        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(vec);
    }

    public static void imprimirArreglo(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            System.out.printf("%3d ", vec[i]);
            if ((i+1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}