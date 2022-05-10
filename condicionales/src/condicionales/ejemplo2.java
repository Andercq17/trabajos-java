
package condicionales;

import javax.swing.JOptionPane;


public class ejemplo2 {
     public static void main(String[] args) {
        long a= Long.parseLong(JOptionPane.showInputDialog("Ingrese cantidad de habitantes"));
        Long b= Long.parseLong(JOptionPane.showInputDialog("Escriba caantidad kms2"));
        
        if(a>100000){
       if(b>20000){
        JOptionPane.showMessageDialog(null, "recibe parte de 500.000.000");
              
       }     
       else{
       JOptionPane.showMessageDialog(null, "parte de 450.000.000");
       }  
       
       
       }
        else if(a>80000){
            if(a<100000){
                if(b>20000){
                JOptionPane.showMessageDialog(null, "parte de 600.000.000");
                }
            }
        
        
        }
        else{
        JOptionPane.showMessageDialog(null, "parte de 300.000.000");
        
        
        }
        
        
        
        
        
        
         
         
         
         
     }
}
