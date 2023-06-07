
package burbuja;

/**
 *
 * @author jorge
 */
public class Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int[] vec = {67, 4, 30, 12, 5, 27};
        int TAM = vec.length;

        System.out.println("ARREGLO ORIGINAL");
        for (int i = 0; i < TAM; i++) {
            System.out.printf("%4d", vec[i]);
        }
        System.out.println("\n");

        for (int i = 0; i < TAM - 1; i++) {
            for (int j = 0; j < TAM - i - 1; j++) {
                if (vec[j] > vec[j+1]) {
                    int aux = vec[j];
                    vec[j] = vec[j+1];
                    vec[j+1] = aux;
                }
            }
            System.out.printf("PASADA %d: ", i+1);
            for (int j = 0; j < TAM; j++) {
                System.out.printf("%d ", vec[j]);
            }
            System.out.println();
        }

        System.out.println("ARREGLO ORDENADO");
        for (int i = 0; i < TAM; i++) {
            System.out.printf("%4d", vec[i]);
        }
    }
}
   
