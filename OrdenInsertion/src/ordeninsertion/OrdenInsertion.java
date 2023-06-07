
package ordeninsertion;

/**
 *
 * @author jorge
 */
public class OrdenInsertion {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int TAM = 6;
        int[] vec = {67, 4, 30, 12, 5, 27};
        int i, j, aux;
        
        System.out.println("ARREGLO ORIGINAL");
        for (i = 0; i < TAM; i++)
            System.out.printf("%4d", vec[i]);
        System.out.println();
        
        for (i = 1; i < TAM; i++) {
            aux = vec[i];
            j = i - 1;
            while (j >= 0 && aux < vec[j]) {
                vec[j + 1] = vec[j];
                j--;
            }
            vec[j + 1] = aux;
            
            for (j = 0; j < TAM; j++)
                System.out.printf("%d ", vec[j]);
            System.out.println();
        }
        
        System.out.println("ARREGLO ORDENADO");
        for (i = 0; i < TAM; i++)
            System.out.printf("%4d", vec[i]);
    }
}
