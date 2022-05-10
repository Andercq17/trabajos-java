
package condicionales;


import javax.swing.JOptionPane;
public class ejemplo1 {
     public static void main(String[] args) {
        
         double a= Double.parseDouble(JOptionPane.showInputDialog("Escriba numero de habitantes de la region"));
         
         if(a<=100000){
         JOptionPane.showMessageDialog(null, "Su parte es de 400.000.000");
         }
         else{
         JOptionPane.showMessageDialog(null, "Su parte es de 500.000.000");
         }
    
     }
}
