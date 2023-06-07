
package mochila;

import java.util.Arrays;

/**
 *
 * @author jorge
 */
public class Metodos {
    
    // metodo backtraking
     static int knapsack(int[] pesos, int[] valores, int capacidad, int index) {
       
         
        if (index < 0 || capacidad == 0) { //codicion de salida de la recursion
            return 0;
        }

        if (pesos[index] > capacidad) {
            return knapsack(pesos, valores, capacidad, index -1);
        } else {
            int incluirItem = valores[index] + knapsack(pesos, valores, capacidad - pesos[index], index - 1);
            int excluirItem = knapsack(pesos, valores, capacidad, index-1 );
            return Math.max(incluirItem, excluirItem);
        }
    }
    // metodo dinamico
    static int maxValordynamic(int capacidad, int[] pesos, int[] valores, int n) {
         
    int[][] tabla = new int[n + 1][capacidad + 1];
    //llenar tabla
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacidad; w++) 
                if (i == 0 ||w == 0) {
                    tabla[i][w] = 0;
                } else if (pesos[i - 1]<= w) {
                   tabla[i][w] = Math.max(valores[i - 1] + tabla[i - 1][w - pesos[i - 1]], tabla[i - 1][w]);
               
            }else {
                    tabla [i][w]= tabla [i-1][w];
                    
                    }
        }
    return tabla [n][capacidad];
}
     // metodo greedy
     static int mochila(int[] pesos, int[] valores, int capacidad, int cantidadObjetos) {
        
        int[] relacion = new int[cantidadObjetos];
   
        for (int i = 0; i < cantidadObjetos; i++) {
            relacion[i] = valores[i] / pesos[i];
        }
        int[][] items = new int[cantidadObjetos][2];
        for (int i = 0; i < cantidadObjetos; i++) {
            items[i][0] = pesos[i];
            items[i][1] = valores[i];
        }
        Arrays.sort(items, (a, b) -> b[0] / b[1] - a[0] / a[1]);
        
        int maxBeneficio = 0;
        for (int i = 0; i < cantidadObjetos; i++) {
            if (capacidad >= items[i][0]) {
                maxBeneficio += items[i][1];
                capacidad -= items[i][0];
            } else {
                maxBeneficio += relacion[i] * capacidad;
                break;
            }
        }
        
        return maxBeneficio;
    }

  
}

    
    

