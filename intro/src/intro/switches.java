/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.util.Scanner;
public class switches {
     public static void main(String[] args) {
     Scanner teclado=new Scanner(System.in);
     System.out.println("Ingrese categoria");
     String categoria=teclado.nextLine();
           
     try{
    
    switch(categoria){
        case "A":
            System.out.println("**********************************************************************************************");
            System.out.println("categoria A");
            System.out.println("La edad de esta categoria es hasta los 25 años");   
            System.out.println("La couta que se debe de pagar mensual es de: 256000");
            System.out.println("El copago servicios tipo 1 es de: 18000.Los servicios son: Exámenes de laboratorio, terapias");
            System.out.println("El copago servicios tipo 2 es de: 22000.Los servicios son: Urgencias, Medicina General");
            System.out.println("El copago servicios tipo 3 es de: 28500.Los servicios son: Especialistas, Hospitalización diaria");
            System.out.println("**********************************************************************************************");
            
            break;
    
        case "B":
            System.out.println("**********************************************************************************************");
            System.out.println("categoria B");
            System.out.println("La edad de esta categoria es para mayores a 25 años hasta 45 años");   
            System.out.println("La couta que se debe de pagar mensual es de: 323500");
            System.out.println("El copago servicios tipo 1 es de: 19200.Los servicios son: Exámenes de laboratorio, terapias");
            System.out.println("El copago servicios tipo 2 es de: 24100.Los servicios son: Urgencias, Medicina General");
            System.out.println("El copago servicios tipo 3 es de: 29700.Los servicios son: Especialistas, Hospitalización diaria");
            System.out.println("**********************************************************************************************");
            
            break;
        
        case "C":
            System.out.println("**********************************************************************************************");
            System.out.println("categoria C");
            System.out.println("La edad de esta categoria es para mayores de 45 años");   
            System.out.println("La couta que se debe de pagar mensual es de: 414200");
            System.out.println("El copago servicios tipo 1 es de: 22500.Los servicios son: Exámenes de laboratorio, terapias");
            System.out.println("El copago servicios tipo 2 es de: 27800.Los servicios son: Urgencias, Medicina General");
            System.out.println("El copago servicios tipo 3 es de: 36700.Los servicios son: Especialistas, Hospitalización diaria");
            System.out.println("**********************************************************************************************");
            
            break;
    
    
        default: 
            System.out.println("error categoria no establecida");
            break;
    }
       
         
         
    }
    catch(Exception error){
        System.out.println("hubo un error"+error);
        
        
    }
     finally{
         System.out.println("ha culminado con exito");
    
    }
     
     
     
     }
     
}
