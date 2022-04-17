/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos2;

//import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JENG-PC
 */
public class Arreglos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        //Declaracion del arreglo
        String persona[] = new String[4];
        String mensaje[] = { "Nombre","Apellido","Direccion","telefono"};
               
        Scanner leer = new Scanner(System.in);        
        String datosPersona = "";
       
       for(int cont=0;cont<=persona.length-1;cont++){           
            System.out.println("Digite el " + mensaje[cont]);
             datosPersona = datosPersona + leer.nextLine()+",";             
            }           
            persona = datosPersona.split(",");               
               
               
               
        Persona nuevaPersona = new Persona();     
        nuevaPersona.Setpersona(persona);
        System.out.print(Arrays.toString(nuevaPersona.Getpersona()));
           
 
        
                
        
        
        
    }
    
}
