package torresdehanoi;

/**
 *
 * @author jorge
 */
public class TorresDeHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numDiscos = 5; //Número de discos a mover
        char varinicial = 'A'; //Torre inicial
        char varcentral = 'B'; //Torre auxiliar
        char varfinal = 'C'; //Torre final
        metodos.moverDiscos(numDiscos, varinicial, varcentral, varfinal);
        //metodos.hanoi(varinicial, varcentral, varfinal, numDiscos);
    }

}
