package torresdehanoi;

/**
 *
 * @author jorge
 */
class metodos {

    public static void moverDiscos(int n, char origen, char auxiliar, char destino) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
        } else {
            moverDiscos(n - 1, origen, destino, auxiliar);
            System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
            moverDiscos(n - 1, auxiliar, origen, destino);

        }
    }

    static void hanoi(char varinicial, char varcentral, char varfinal, int n) {
        if (n == 1) {
            System.out.println("Mover disco " + n + " desde varilla "
                    + varinicial + " a varilla " + varfinal);
        } else {
            hanoi(varinicial, varfinal, varcentral, n - 1);
            System.out.println("Mover disco " + n + " desde varilla "
                    + varinicial + " a varilla " + varfinal);
            hanoi(varcentral, varinicial, varfinal, n - 1);
        }
    }

}
