
package condicionales;

import javax.swing.JOptionPane;
public class Division_exacta {
    public static void main(String[] args) {
    
        double num1, num2, num3;
        
        
    try{
        num1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese dividendo"));
        num2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese divisor"));
        
        num3=num1/num2;
        
        JOptionPane.showMessageDialog(null, num3);
        
        
        
        
        
        
        
        
    }

    catch(Exception error){
        JOptionPane.showMessageDialog(null, "Hubo un error: "+error);
    }

    finally{
    
    JOptionPane.showMessageDialog(null, "Proceso culmino satisfactoriamente");
    
    }
    
    
    
    
    
    
    
    
    }
}
