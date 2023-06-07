package mochila;



/**
 *
 * @author jorge
 */
public class Mochila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] pesos = {2, 3, 4, 5};
        int[] valores = {3, 4, 5, 6};
        int capacidad = 8;
        int n = pesos.length; 
        
          // metodo enfoque greedy
        int valorMaximo = Metodos.mochila(pesos, valores, capacidad,n); 
        
           // metodo enfoque bactraking (recursivo)
        //int valorMaximo = Metodos.knapsack(pesos, valores, capacidad, n-1);
       
           // metodo dinamico
        //int valorMaximo = Metodos.maxValordynamic(capacidad, pesos, valores,n);
        
        
        System.out.println("valor maximo " + valorMaximo);
        

    }

    


    }
