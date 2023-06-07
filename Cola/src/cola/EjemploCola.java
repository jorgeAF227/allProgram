 /*utiliza una implementación alternativa de cola utilizando una lista enlazada personalizada
(Cola y Nodo). En este caso, los métodos como encolar(), 
sacar() y recorrerCola() se definen específicamente para esa implementación personalizada.
 */
package cola;

/**
 *
 * @author jorge
 */
public class EjemploCola {
    public static void main(String[] args) {
        Cola cola = new Cola();

        Nodo nodo1 = new Nodo(1, null); 
        Nodo nodo2 = new Nodo(2, null);
        Nodo nodo3 = new Nodo(3, null);

        cola.encolar(nodo1);
        cola.encolar(nodo2);
        cola.encolar(nodo3);

        System.out.println("Elementos en la cola: " + cola.toString());

        cola.sacar();
        cola.sacar();
      
        

        System.out.println("Elementos en la cola despues de sacar: " + cola.toString());
    }
}


    

