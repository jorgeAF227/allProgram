
package arbol;

/**
 *
 * @author jorge
 */
public class Nodo {
 private int elemento;
    private Nodo ramaIz;
    private Nodo ramaDer;

    public Nodo(int elemento) {
        this.elemento = elemento;
        ramaIz = null;
        ramaDer = null;
    }

    public void InsertaBinario(int elem) {
        if (elem < this.elemento) {
            if (ramaIz == null)
                ramaIz = new Nodo(elem);
            else
                ramaIz.InsertaBinario(elem);
        } else {
            if (elem > this.elemento) {
                if (ramaDer == null)
                    ramaDer = new Nodo(elem);
                else
                    ramaDer.InsertaBinario(elem);
            }
        }
    }

    // Setters y Getters

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Nodo getRamaIz() {
        return ramaIz;
    }

    public void setRamaIz(Nodo ramaIz) {
        this.ramaIz = ramaIz;
    }

    public Nodo getRamaDer() {
        return ramaDer;
    }

    public void setRamaDer(Nodo ramaDer) {
        this.ramaDer = ramaDer;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "elemento=" + elemento +
                ", ramaIz=" + ramaIz +
                ", ramaDer=" + ramaDer +
                '}';
    }

    boolean Eliminar(int elem, Nodo padre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}