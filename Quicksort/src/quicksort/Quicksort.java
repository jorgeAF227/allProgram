
package quicksort;

/**
 *
 * @author jorge
 */
public class Quicksort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int TAM = 5;
        int[] vec = {67, 4, 30, 12, 5};
        quicksort(vec, 0, TAM - 1);
        
         System.out.println("ARREGLO ORIGINAL");
         imprimirArreglo(vec);
       
        System.out.println("Vector ordenado:");
        for (int i = 0; i < TAM; i++) {
            System.out.print(vec[i] + " ");
        }
    }

    public static void quicksort(int[] vec, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = particionar(vec, inicio, fin);
            quicksort(vec, inicio, pivote - 1);
            quicksort(vec, pivote + 1, fin);
        }
    }

    public static int particionar(int[] vec, int inicio, int fin) {
        int pivote = vec[fin];
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (vec[j] < pivote) {
                i++;
                int aux = vec[i];
                vec[i] = vec[j];
                vec[j] = aux;
            }
        }
        int aux = vec[i + 1];
        vec[i + 1] = vec[fin];
        vec[fin] = aux;
        return i + 1;
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
    
    

