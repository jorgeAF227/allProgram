package metodosdeordenamiento;

import java.util.Scanner;
import static metodosdeordenamiento.metodos.vec;

/**
 *
 * @author jorge
 */
public class MetodosDeOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables
       
        boolean salir = false;
        int opcion;

        do {//bucle para regresar al menu
            //menu
            System.out.println("--------Menu-------------------");
            System.out.println("Bienvenido elija el metodo");
            System.out.println("1. burbuja");
            System.out.println("2. seleccion");
            System.out.println("3. inserccion");
            System.out.println("4. shell");
            System.out.println("5. quicksort");
            System.out.println("6. salir");
            System.out.println("Elije una opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    metodos.RellenaVector(sc);
                    metodos.burbuja(vec);

                }
                case 2 -> {
                        metodos.RellenaVector(sc);
                        metodos.seleccion(vec);
                       
                       
                }
                    case 3 -> {
                        metodos.RellenaVector(sc);
                        metodos.inserccion(vec);
                       
                }
                     case 4 -> {
                        metodos.RellenaVector(sc);
                        metodos.shell(vec);
                        
                       
                }
                          case 5 -> {
                        metodos.RellenaVector(sc);
                        metodos.quicksort(vec);
                       
                        
                       
                }
               
                case 6 -> 
                     salir = true;
 
            }
        } while (!salir);
        System.out.println("FIN");
    }
}

    

          
