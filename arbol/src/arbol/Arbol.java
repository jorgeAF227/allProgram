package arbol;

/**
 *
 * @author jorge
 */
import java.util.Scanner;

public class Arbol {

    public static void main(String[] args) {
        ArbolB A = new ArbolB();
        int indice;
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
                    System.out.print("Dame el numero a insertar: ");
                    int p = leer.nextInt();
                    A.InsertaNodo(p);
                    break;
                case 2:
                    System.out.print("Dame el numero a eliminar: ");
                    int q = leer.nextInt();
                    if (A.BuscarElemento(q)) {
                        boolean eliminado = A.EliminarNodo(q, null);
                        if (eliminado) {
                            System.out.println("El numero " + q + " ha sido eliminado del arbol.");
                        } else {
                            System.out.println("Ocurrio un error al eliminar el número " + q + ".");
                        }
                    } else {
                        System.out.println("El numero " + q + " no se encuentra en el arbol.");
                    }
                    break;

                case 3:
                    System.out.print("El recorrido en Preorden es: ");
                    A.Preorden(A.raiz);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("El recorrido en Inorden es: ");
                    A.Inorden(A.raiz);
                    System.out.println();
                    break;
                case 5:
                    System.out.print("El recorrido en Postorden es: ");
                    A.PostOrden(A.raiz);
                    System.out.println();
                    break;
                case 6:
                    System.out.print("Ingrese el numero a buscar: ");
                    int num = leer.nextInt();
                    if (A.BuscarElemento(num)) {
                        System.out.println("El numero " + num + " esta presente en el arbol.");
                    } else {
                        System.out.println("El numero " + num + " no se encuentra en el arbol.");
                    }
                    break;
            }
        } while (opc != 7);
    }
}
