
package tree;

/**
 *
 * @author jorge
 */
public class Nodo {

    private int valor;
    private Nodo izquierdo;
    private Nodo derecho;

    public Nodo(int valor) {
        this.valor = valor;
        izquierdo = null;
        derecho = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    public void visitar() {
        System.out.print(valor + " ");
    }

    public Nodo subarbolIzdo() {
        return izquierdo;
    }

    public Nodo subarbolDcho() {
        return derecho;
    }

    public boolean Eliminar(int elem, Nodo padre) {
    if (elem == valor) {
        // Caso 1: El nodo a eliminar es una hoja
        if (izquierdo == null && derecho == null) {
            if (padre != null) {
                if (padre.izquierdo == this) {
                    padre.izquierdo = null;
                } else {
                    padre.derecho = null;
                }
            }
        }
        // Caso 2: El nodo a eliminar tiene un solo hijo
        else if (izquierdo == null) {
            if (padre != null) {
                if (padre.izquierdo == this) {
                    padre.izquierdo = derecho;
                } else {
                    padre.derecho = derecho;
                }
            }
        } else if (derecho == null) {
            if (padre != null) {
                if (padre.izquierdo == this) {
                    padre.izquierdo = izquierdo;
                } else {
                    padre.derecho = izquierdo;
                }
            }
        }
        // Caso 3: El nodo a eliminar tiene dos hijos
        else {
                   
            Nodo maxIzquierdo = izquierdo;
            while (maxIzquierdo.derecho != null) {
                maxIzquierdo = maxIzquierdo.derecho;
            }
            valor = maxIzquierdo.valor;
            return izquierdo.Eliminar(valor, this);
        }
        return true; // Indicar que el nodo se eliminó correctamente
    }
    // Si el elemento a eliminar es menor que el valor actual, buscar en el subárbol izquierdo
    else if (elem < valor && izquierdo != null) {
        return izquierdo.Eliminar(elem, this);
    }
    // Si el elemento a eliminar es mayor que el valor actual, buscar en el subárbol derecho
    else if (elem > valor && derecho != null) {
        return derecho.Eliminar(elem, this);
    }
    return false; // Indicar que el nodo no se encontró
}



}
