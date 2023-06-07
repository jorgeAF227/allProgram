
package pila;

/**
 *
 * @author jorge
 */
public class Pila {
    private Nodo top; // último nodo que se ha incluido
    private int tamanio; // el número de elementos en la pila

    public Pila() {
        top = null; // No hay elementos
        this.tamanio = 0; // el tamaño es cero
    }

    public boolean isEmpty() { // informa si la pila está vacía
        return top == null;
    }

    public int size() { // informa el número de elementos en la pila
        return this.tamanio;
    }

    public Nodo top() { // entrega el Nodo en el tope de pila
        if (isEmpty()) {
            return null;
        } else {
            return top;
        }
    }

    public Nodo pop(Nodo i) { // entrega el último nodo de la pila
        System.out.println("Inicia método POP ");
        System.out.println("Valor de i " + i.getElemento());

        if (i.getSiguiente() == null) {
            System.out.println("Valor sacado " + i.getElemento());
            top = null;
        } else {
            Nodo s = i.getSiguiente();
            while (s.getSiguiente() != null) {
                i = s;
                s = s.getSiguiente();
            }
            System.out.println("Valor sacado " + s.getElemento());
            i.setSiguiente(null);
            top = i;
        }
        this.tamanio--; // disminuye el tamaño de la pila
        return top;
    }

    public Nodo push(Nodo i, Nodo nv) { // Inserta nodos en la pila
        if (i == null) {
            top = nv;
        } else {
            Nodo s = i;
            while (s.getSiguiente() != null) {
                s = s.getSiguiente();
            }
            System.out.println("Valor insertado " + nv.getElemento());
            s.setSiguiente(nv);
            top = s.getSiguiente();
        }
        this.tamanio++; // aumenta el tamaño de la pila
        return top;
    }

    @Override
    public String toString() { // muestra los valores de la pila
        if (isEmpty()) {
            return "La pila está vacía";
        } else {
            String resultado = "";
            Nodo aux = top;
            while (aux != null) {
                resultado += aux.toString();
                aux = aux.getSiguiente();
            }
            return resultado;
        }
    }
}
