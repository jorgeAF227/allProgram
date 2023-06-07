package metodosdeordenamiento;

import java.util.Random;
import java.util.Scanner;

class metodos {

    static Random rand = new Random();
    static int TAM;
    static Scanner sc = new Scanner(System.in);
    static int[] vec;

    // Llenar el arreglo con números aleatorios    
    public static void RellenaVector(Scanner sc) {
        // pide el tamaño del vector
        System.out.println("Escribe el tamaño del vector: ");
        TAM = sc.nextInt();
        vec = new int[TAM];
        // Llenar el arreglo con números aleatorios
        for (int i = 0; i < TAM; i++) {
            vec[i] = rand.nextInt(100); // Generar un número aleatorio entre 0 y 99              
        }
    }

    // Imprimir el arreglo 
    public static void imprimirArreglo(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            System.out.printf("%3d ", vec[i]); //formato e impr. del vector
            if ((i + 1) % 10 == 0) { // si hay 10 elementos en una fila
                System.out.println(); // insertar un salto de línea en la salida
            }

        }
        System.out.println();
    }

    //metodo de la burbuja
    public static void burbuja(int[] vec) {

        //imprimir el arreglo origen
        System.out.println("Arreglo original:");
        imprimirArreglo(vec);

        for (int i = 0; i < vec.length - 1; i++) { //recorre el vector (itera desde la pocion 0  hasta el penultimo)
            for (int j = 0; j < vec.length - i - 1; j++) { // comparar y ordenar los elementos del arreglo
                if (vec[j] > vec[j + 1]) {
                    int aux = vec[j];
                    vec[j] = vec[j + 1];
                    vec[j + 1] = aux;
                }
            }
            System.out.printf("PASADA %d: ", i + 1);
            for (int j = 0; j < TAM; j++) {
                System.out.printf("%d ", vec[j]);
            }
            System.out.println();
        }

        // Imprimir el arreglo ordenado
        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(vec);
    }

    public static void seleccion(int[] vec) {

        //imprimir el arreglo origen
        System.out.println("ARREGLO ORIGINAL");
        imprimirArreglo(vec);
        System.out.println();

        for (int i = 0; i < vec.length; i++) {
            int men = i;
            for (int j = i + 1; j < vec.length; j++) {
                if (vec[j] < vec[men]) {
                    men = j;
                }
            }
            int aux = vec[i];
            vec[i] = vec[men];
            vec[men] = aux;
            System.out.printf("Se intercambio %d <-> %d\n", vec[i], vec[men]);
 imprimirArreglo(vec);
        }
        // Imprimir el arreglo ordenado
        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(vec);
    }

    public static void inserccion(int[] vec) {
        //imprimir el arreglo origen
        System.out.println("ARREGLO ORIGINAL");
        imprimirArreglo(vec);
        
        System.out.println();
        for (int i = 1; i < vec.length; i++) {
            int aux = vec[i];
            int j = i - 1;
            while (j >= 0 && aux < vec[j]) {
                vec[j + 1] = vec[j];
                j--;
            }
            vec[j + 1] = aux;

            for (j = 0; j < vec.length; j++) {
                System.out.printf("%d ", vec[j]);
            }
            System.out.println();
        }
        // Imprimir el arreglo ordenado
        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(vec);
    }

    public static void shell(int[] vec) {
        System.out.println("ARREGLO ORIGINAL");
        imprimirArreglo(vec);
        int salto, aux, i, j, cambio, max = vec.length;

        salto = max / 2;
        while (salto > 0) {
            cambio = 1;
            while (cambio != 0) {
                cambio = 0; // resetear el flag de cambio
                for (i = salto; i < max; i++) {
                    j = i - salto;
                    if (vec[j] > vec[i]) {
                        aux = vec[i];
                        vec[i] = vec[j];
                        vec[j] = aux;
                        cambio = 1; // marcar que hubo un cambio
                        System.out.printf("Intercambio : %d, %d\n", vec[i], vec[j]);
                    }
                }
                for (i = 0; i < max; i++) {
                    System.out.printf("%4d ", vec[i]); // agregar un espacio entre los elementos
                }
                System.out.println();
            }
            salto = salto / 2;
        }
        System.out.println("Arreglo ordenado");
        imprimirArreglo(vec);
    }

    public static void quicksort(int[] vec) {
        System.out.println("ARREGLO ORIGINAL:");
        imprimirArreglo(vec);
        quicksortAux(vec, 0, vec.length - 1);
        System.out.println("\nARREGLO ORDENADO:");
        imprimirArreglo(vec);
   
}

private static void quicksortAux(int[] vec, int primero, int ultimo) {
    int central = (primero + ultimo) / 2;
    int pivote = vec[central];
    int i = primero;
    int j = ultimo;

    while (i <= j) {
        while (vec[i] < pivote) {
            i++;
        }
        while (vec[j] > pivote) {
            j--;
        }
        if (i <= j) {
            intercambiar(vec, i, j);
            i++;
            j--;
        }
    }

    if (primero < j) {
        quicksortAux(vec, primero, j+1);
    }
    if (i < ultimo) {
        quicksortAux(vec, i, ultimo-1);
    }
}
// intercambia para el metodo quicksort
private static void intercambiar(int[] vec, int i, int j) {
    int temp = vec[i];
    vec[i] = vec[j];
    vec[j] = temp;
 System.out.printf("Se intercambiaron los valores %d y %d\n", vec[i], vec[j]);
 imprimirArreglo(vec);
}


}
