
package arbol;

/**
 *
 * @author jorge
 */
public class ArbolB {
    Nodo raiz;

    public ArbolB() {
        raiz = null;
    }

    public void InsertaNodo(int elem) {
        if (raiz == null)
            raiz = new Nodo(elem);
        else
            raiz.InsertaBinario(elem);
    }

    public void Preorden(Nodo nodo) {
        if (nodo == null)
            return;
        else {
            System.out.print(nodo.getElemento() + " ");
            Preorden(nodo.getRamaIz());
            Preorden(nodo.getRamaDer());
        }
    }

    public void PostOrden(Nodo nodo) {
        if (nodo == null)
            return;
        else {
            PostOrden(nodo.getRamaIz());
            PostOrden(nodo.getRamaDer());
            System.out.print(nodo.getElemento() + " ");
        }
    }

    public void Inorden(Nodo nodo) {
        if (nodo == null)
            return;
        else {
            Inorden(nodo.getRamaIz());
            System.out.print(nodo.getElemento() + " ");
            Inorden(nodo.getRamaDer());
        }
    }

    public boolean BuscarElemento(int elem) {
        return Buscar(raiz, elem);
    }

    private boolean Buscar(Nodo nodo, int elem) {
        if (nodo == null)
            return false;
        else if (nodo.getElemento() == elem)
            return true;
        else if (elem < nodo.getElemento())
            return Buscar(nodo.getRamaIz(), elem);
        else
            return Buscar(nodo.getRamaDer(), elem);
    }

   



  boolean EliminarNodo(int elem, Nodo padre) {
    if (raiz == null)
        return false;
    else {
        if (raiz.getElemento() == elem) {
            Nodo aux = new Nodo(0);
            aux.setRamaIz(raiz);
            boolean resultado = raiz.Eliminar(elem, aux);
            raiz = aux.getRamaIz();
            return resultado;
        } else {
            return raiz.Eliminar(elem, padre);
        }
    }
}

}




