
package ackermann;

/**
 *
 * @author jorge
 */
public class Ackermann {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m=2;
        int n= 4;
        int resultado= metodos.ackermann (m, n);
        
        System.out.println("El resultado de A("+ m + ", "+ n+ " )es :"+ resultado);
    }
    
}
