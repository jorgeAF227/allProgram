
package busquedaBinaria;

/**
 *
 * @author jorge
 */
public class busquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double [] a = {1, 5, 22, 42, 55, 77,88};
        int posicion = busquedaBR(a, 1, 0, 6);

if (posicion == -1) {
    System.out.println("El valor no se encontró en el arreglo.");
} else {
    System.out.println("El valor se encontró en la posición " + posicion + " del arreglo.");
}
    }

   static int busquedaBR(double a[], double clave,
int inferior, int superior)
{
int central;
if (inferior > superior) // no encontrado
return -1;
else
{
central = (inferior + superior)/2;
if (a[central] == clave)
return central;
else if (a[central] < clave)
return busquedaBR(a, clave, central+1, superior);
else
return busquedaBR(a, clave, inferior, central-1);
}
}
    }


