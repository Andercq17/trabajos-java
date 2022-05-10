/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import javax.swing.JOptionPane;
public class condicionalesprt2 {
    
    
    
      public static void main(String[] args) {
  
          
            double nota1,nota2, nota3;
       
            double definitiva;
        
        
    try{
        //NOTA1
        nota1=Double.parseDouble(JOptionPane.showInputDialog("introduzca nota 1"));
      
        if(nota1>5){
            JOptionPane.showMessageDialog(null, "No se pueden ingresar notas por encima de 5");
        }
        else if(nota1<0){
            JOptionPane.showMessageDialog(null, "No se pueden ingresar notas por debajo de 0");
        }
       
       nota1=nota1*0.40;
       
        
        //NOTA2
        nota2=Double.parseDouble(JOptionPane.showInputDialog("introduzca nota 2"));
        
        if (nota2<0){
            JOptionPane.showMessageDialog(null, "No se pueden ingresar notas por debajo de 0 ");
        }
        else if (nota2>5){
            JOptionPane.showMessageDialog(null, "No se pueden ingresar notas por encima de 5");
        }
        
       nota2=nota2*0.30;
       
                
        //NOTA3
        nota3=Double.parseDouble(JOptionPane.showInputDialog("introduzca nota 3"));
              
        if (nota3<0){
            JOptionPane.showMessageDialog(null, "No se pueden ingresar notas por debajo de 0");              
        }   
        else if (nota3>5){
            JOptionPane.showMessageDialog(null, "No se pueden ingresar notas por encima de 5");   
        }
        
            
       //DEFINITIVA
                
        definitiva=nota1+nota2+nota3;
        
        if(definitiva<0){
            JOptionPane.showMessageDialog(null, "Hubo un problema al ingresar los datos");   
        }
        else if(definitiva>5){
            JOptionPane.showMessageDialog(null, "Hubo un problema al ingresar los datos");
        }
        
       
        if(definitiva<=5){
            if(definitiva>=3.5){
                JOptionPane.showMessageDialog(null, "Gano la materia y su nota final definitiva es: "+definitiva);
            }
        }
        if(definitiva<3.5){
            if(definitiva>=0){
                JOptionPane.showMessageDialog(null, "su nota final definitiva es: "+definitiva);
            }
        }
        
       
}

    
    
    
    
    catch(Exception error){
        JOptionPane.showMessageDialog(null, "hubo un error, el cual es: "+error);
        
        
    }
    
     finally{
    JOptionPane.showMessageDialog(null, "Proceso realizado satisfactoriameente");
    
    }
      
      
      
      }
}
