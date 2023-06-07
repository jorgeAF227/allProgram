
package ordenselect;

/**
 *
 * @author jorge
 */
public class OrdenSelect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int TAM = 5;
        int[] vec = {67, 4, 30, 12, 5, 27};
        int i, j, aux, men;
        
        System.out.println("ARREGLO ORIGINAL");
        for (i = 0; i < TAM; i++)
            System.out.printf("%4d", vec[i]);
        System.out.println();
        
        for (i = 0; i < TAM; i++) {
            men = i;
            for (j = i + 1; j < TAM; j++) {
                if (vec[j] < vec[men]) {
                    men = j;
                }
            }
            aux = vec[i];
            vec[i] = vec[men];
            vec[men] = aux;
            
            for (j = 0; j < TAM; j++)
                System.out.printf("%d ", vec[j]);
            System.out.println();
        }
        
        System.out.println("\nARREGLO ORDENADO");
        for (i = 0; i < TAM; i++)
            System.out.printf("%3d", vec[i]);
    }
}