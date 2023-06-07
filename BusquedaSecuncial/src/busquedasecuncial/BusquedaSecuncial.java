
package busquedasecuncial;

/**
 *
 * @author jorge
 */
public class BusquedaSecuncial {

    public static int busquedaSecuencial(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return i;  // Se encontró el elemento, devuelve su índice
            }
        }
        return -1;  // El elemento no se encontró en el arreglo
    }

    public static void main(String[] args) {
        int[] arreglo = { 5, 2, 8, 10, 3 };
        int elementoBuscado = 3;

        int indice = busquedaSecuencial(arreglo, elementoBuscado);

        if (indice != -1) {
            System.out.println("El elemento " + elementoBuscado + " se encuentra en el índice " + indice);
        } else {
            System.out.println("El elemento " + elementoBuscado + " no se encuentra en el arreglo.");
        }
    }
}
