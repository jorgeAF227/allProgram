package ordenamientoshell;

/**
 *
 * @author jorge
 */
public class OrdenamientoShell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max = 7;
        int[] vec = {6, 1, 5, 2, 3, 4, 0};
        int salto, aux, i, j, cambio;

        System.out.println("Arreglo original");
        for (i = 0; i < max; i++) {
            System.out.printf("%4d ", vec[i]); // agregar un espacio entre los elementos
        }
        System.out.println();
        
        salto = max / 2;
        while (salto > 0) {
            cambio = 1;
            while (cambio != 0) {
                cambio = 0; // resetear el flag de cambio
                for (i = salto; i < max; i++) {
                    j = i - salto;
                    if (vec[j] > vec[i]) {
                        aux = vec[i];
                        vec[i] = vec[j];
                        vec[j] = aux;
                        cambio = 1; // marcar que hubo un cambio
                        System.out.printf("Intercambio : %d, %d\n", vec[i], vec[j]);
                    }
                }
                for (i = 0; i < max; i++) {
                    System.out.printf("%4d ", vec[i]); // agregar un espacio entre los elementos
                }
                System.out.println();
            }
            salto = salto / 2;
        }
        System.out.println("Arreglo ordenado");
        for (i = 0; i < max; i++) {
            System.out.printf("%4d ", vec[i]); // corregir la cadena de formato
        }
        System.out.println();
    }
}
