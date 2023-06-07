
package cola;

/**
 *
 * @author jorge
 */
public class Cola {
    private Nodo frente;
    private int tamanio;
 
    //inicializo la instancia
    public Cola() {
        frente = null;
        tamanio = 0;
    }
// si no hay primero en la cola entonces esta vacia
    public boolean isEmpty() {
        return frente == null;
    }

    public int size() {
        return tamanio;
    }

    public Nodo raiz() {
        return frente;
    }

    public void sacar() {
        System.out.println("Inicia el metodo sacar");
        if (frente != null) {
            System.out.println("Valor sacado: " + frente.getElemento());
            Nodo s = frente.getSiguiente();
            frente = s;
            tamanio--;
        }
    }

    public void encolar(Nodo nv) {
        if (frente == null) {
            frente = nv;
        } else {
            Nodo s = recorrerCola();
            if (s.getSiguiente() == null) {
                s.setSiguiente(nv);
                tamanio++;
            }
        }
        System.out.println("Valor insertado: " + nv.getElemento());
    }

    public Nodo recorrerCola() {
        System.out.println("Iniciar metodo recorrerCola");
        System.out.println("Valor visto: " + frente.getElemento());
        Nodo i = frente;
        Nodo s = null;
        while (i.getSiguiente() != null) {
            s = i.getSiguiente();
            System.out.println("Valor visitado: " + s.getElemento());
            i = s;
        }
        return i;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "La cola esta vacia";
        }

        StringBuilder resultado = new StringBuilder();
        Nodo aux = frente;
        
        while (aux != null) {
            resultado.append(aux.toString()).append(" ");
            aux = aux.getSiguiente();
        }
        
        return resultado.toString();
    }
}