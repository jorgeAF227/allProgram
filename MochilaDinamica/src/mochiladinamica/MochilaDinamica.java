package mochiladinamica;

/**
 *
 * @author jorge
 */
public class MochilaDinamica {

 
    public static void main(String[] args) {
        int capacidad= 50;
        int [] pesos = { 2, 12, 14 ,15};
        int []valores = {3, 4 ,5 ,6};
        int n = pesos.length;
        int maxValor =maxValorMochila(capacidad, pesos, valores, n);
        System.out.println("el maximo valor que se puede obtener es "+maxValor );
        

    }
   

    private static int maxValorMochila(int capacidad, int[] pesos, int[] valores, int n) {
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
}

