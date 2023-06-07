
package tree;



/**
 *
 * @author jorge
 */
public class Arbol {
      private Nodo raiz;

   

    public Arbol() {
        raiz = null;
    }
    public void visualizarArbol() {
        visualizarArbol(raiz, 0);
    }

    private void visualizarArbol(Nodo nodo, int nivel) {
        if (nodo == null) {
            return;
        }

        visualizarArbol(nodo.getDerecho(), nivel + 1);

        for (int i = 0; i < nivel; i++) {
            System.out.print("   ");
        }

        System.out.println(nodo.getValor());

        visualizarArbol(nodo.getIzquierdo(), nivel + 1);
    }

    public void insertar(int valor) {
        raiz = insertarNodo(raiz, valor);
    }

    private Nodo insertarNodo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }

        if (valor < nodo.getValor()) {
            nodo.setIzquierdo(insertarNodo(nodo.getIzquierdo(), valor));
        } else if (valor > nodo.getValor()) {
            nodo.setDerecho(insertarNodo(nodo.getDerecho(), valor));
        }
       

        return nodo;
        
    }

    public void recorridoPreorden() {
        recorridoPreorden(raiz);
        System.out.println();
    }

    private void recorridoPreorden(Nodo nodo) {
        if (nodo != null) {
            nodo.visitar();
            recorridoPreorden(nodo.subarbolIzdo());
            recorridoPreorden(nodo.subarbolDcho());
        }
    }

    public void recorridoInorden() {
        recorridoInorden(raiz);
        System.out.println();
    }

    private void recorridoInorden(Nodo nodo) {
        if (nodo != null) {
            recorridoInorden(nodo.subarbolIzdo());
            nodo.visitar();
            recorridoInorden(nodo.subarbolDcho());
        }
    }

    public void recorridoPostorden() {
        recorridoPostorden(raiz);
        System.out.println();
    }

    private void recorridoPostorden(Nodo nodo) {
        if (nodo != null) {
            recorridoPostorden(nodo.subarbolIzdo());
            recorridoPostorden(nodo.subarbolDcho());
            nodo.visitar();
        }
    }

    public boolean buscarElemento(int elemento) {
        return buscar(raiz, new Nodo(elemento));
    }

    private boolean buscar(Nodo nodo, Nodo elementoBuscado) {
        if (nodo == null) {
            return false;
        } else if (elementoBuscado.getValor() == nodo.getValor()) {
            return true;
        } else if (elementoBuscado.getValor() < nodo.getValor()) {
            return buscar(nodo.subarbolIzdo(), elementoBuscado);
        } else {
            return buscar(nodo.subarbolDcho(), elementoBuscado);
        }
    }
 public boolean eliminarNodo(int elem, Nodo padre) {
    if (raiz == null)
        return false;
    else {
        if (raiz.getValor() == elem) {
            Nodo aux = new Nodo(0);
            aux.setIzquierdo(raiz);
            boolean resultado = raiz.Eliminar(elem, aux);
            raiz = aux.getIzquierdo();
            
            return resultado;
        } else {
            return raiz.Eliminar(elem, padre);
        }
    }
}

}



