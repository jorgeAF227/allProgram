
package cola;

/**
 *
 * @author jorge
 */

public class Nodo {
    private int elemento;
private Nodo siguiente; //apunta al siguiente nodo
//constructor 



    public Nodo(int elemento, Nodo siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
    // metodos

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return elemento  + " ";
    }

}
