package cola;

/*se utiliza la interfaz Queue estándar en Java 
junto con la implementación proporcionada por la clase LinkedList.
Los métodos offer() y poll() de la interfaz Queue se utilizan 
para agregar y eliminar elementos de la cola respectivamente.
Además, el método mostrarRecorridoCola() utiliza un bucle for-each 
para recorrer los elementos de la cola.
 */
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author jorge
 */
public class colaS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        System.out.println("Valor insertado: 1");
        queue.add("Elemento 1");
        mostrarRecorridoCola(queue);
        System.out.println("Valor insertado: 2");
        queue.offer("Elemento 2");
        mostrarRecorridoCola(queue);
        System.out.println("Valor insertado: 3");
        queue.offer("Elemento 3");
        mostrarRecorridoCola(queue);

        System.out.println("Elementos en la cola: " + queue.toString());

        sacar(queue);
        sacar(queue);

    }
//metodos

    public static void mostrarRecorridoCola(Queue<String> queue) {
        System.out.println("Iniciar metodo recorrerCola");

        for (String elemento : queue) {
            System.out.println("Valor visitado: " + elemento);
        }
    }

    private static void sacar(Queue<String> queue) {
        String elementoSacado = queue.poll();
        if (elementoSacado != null) {
            System.out.println("Valor sacado: " + elementoSacado);
        } else {
            System.out.println("La cola está vacía");
        }

        System.out.println("Elementos en la cola despues de sacar: " + queue.toString());
    }
}
