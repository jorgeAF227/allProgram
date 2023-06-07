
package pilajava;

import java.util.Stack;

/**
 *
 * @author jorge
 */
public class PilaJava {

    public static void main(String[] args) {
        //instancia la pila
       Stack <Persona> personaStack = new Stack <>();
       // se instancias personas 
       Persona persona1 = new Persona ("Juan", 25);
       Persona persona2 = new Persona ("Maria", 26);
       Persona persona3 = new Persona ("Carlos", 26);
       // se agregan elemenntos a la pila
       personaStack.push(persona1);
       personaStack.push(persona2);
       personaStack.push(persona3);
       
       // remueve el ultimo elemnto
       Persona removedPersona = personaStack.pop();
        System.out.println("Persona eleiminada de la pila :"+ removedPersona.getNombre()+ " edad : "+ removedPersona.getEdad());
       //muestra el elemento de la pila
       Persona topPersona = personaStack.peek();
       if (topPersona != null){
          System.out.println("persona en la parte superior de la pila "+ topPersona.getNombre());
      }
       //vacia la pila
       //while (!personaStack.empty())
       //{
           //Persona persona = personaStack.pop ();
           //System.out.println("Persona eliminar de la la pila "+ persona.getNombre()+  "edad : "+ persona.getEdad());
           
       //}
       
        
       //imprime la pila
       System.out.println(" ");
        System.out.println("Elementos de la pila");
        for (Persona persona : personaStack) {
            System.out.println(" Nomnbre:  "+ persona.getNombre()+ ", Edad :  "+ persona.getEdad());
          
        }
        //busca en la pila
        String searchName = "Juan";
       boolean found  = false;
        for (Persona persona : personaStack) {
            if( persona.getNombre().equals(searchName)) {
                System.out.println("persona encontrada "+ persona.getNombre()+ " , Edada: "+ persona.getEdad());
                found = true;
                break;    
            }
            
            }
            if (!found){
                System.out.println("Perona no encontrada en la pila ");
            }
               
    }
    
}
