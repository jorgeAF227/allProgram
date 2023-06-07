
package tree;

import java.util.Scanner;


/**
 *
 * @author jorge
 */
public class Tree {

    /**
     * @param args the command line arguments
     */
  
     

    public static void main(String[] args) {
          Arbol A = new Arbol();
        int opc = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("****BIENVENIDO A ÁRBOL BINARIO ORDENADO****");
        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Recorrido en Preorden");
            System.out.println("4. Recorrido en Inorden");
            System.out.println("5. Recorrido en Postorden");
            System.out.println("6. Buscar elemento");
            System.out.println("7. Salir");
            System.out.print("Seleccione opción ---> ");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Dame el número a insertar: ");
                    int p = leer.nextInt();
                    A.insertar(p);
                     // Llamada al método visualizarArbol() después de insertar
                     A.visualizarArbol();
                    break;

                case 2:
                   
                    System.out.print("Dame el numero a eliminar: ");
                    int q = leer.nextInt();
                    if (A.buscarElemento(q)) {
                        boolean eliminado = A.eliminarNodo(q, null);
                        if (eliminado) {
                            System.out.println("El numero " + q + " ha sido eliminado del arbol.");
                        } else {
                            System.out.println("Ocurrio un error al eliminar el número " + q + ".");
                        }
                    } else {
                        System.out.println("El numero " + q + " no se encuentra en el arbol.");
                    }
                     // Llamada al método visualizarArbol() después de eliminar el nodo
                    A.visualizarArbol();
                    break;


                case 3:
                    A.recorridoPreorden();
                    break;

                case 4:
                    A.recorridoInorden();
                    break;

                case 5:
                    A.recorridoPostorden();
                    break;

                case 6:
                    System.out.print("Ingrese el número a buscar: ");
                    int numBuscar = leer.nextInt();
                    boolean encontrado = A.buscarElemento(numBuscar);
                    if (encontrado) {
                        System.out.println("El número " + numBuscar + " está presente en el árbol.");
                    } else {
                        System.out.println("El número " + numBuscar + " no se encuentra en el árbol.");
                    }
                    break;
            }
        } while (opc != 7);
    }
}