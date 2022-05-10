
package condicionales;


import javax.swing.JOptionPane;
public class Condicionales {

  
    public static void main(String[] args) {
  double nota1=Double.parseDouble(JOptionPane.showInputDialog("introduzca nota 1"));
  double nota2=Double.parseDouble(JOptionPane.showInputDialog("introduzca nota 2"));
  double nota3=Double.parseDouble(JOptionPane.showInputDialog("introduzca nota 3"));
  
  double nota4;
        
        nota1=nota1*0.40;
        nota2=nota2*0.30;
        nota3=nota3*0.20;
        nota4=nota1+nota2+nota3;
        
    try{
    JOptionPane.showMessageDialog(null, "la nota final es: "+nota4);
    }
    
    catch(Exception error){
        JOptionPane.showMessageDialog(null, "hubo un error, el cual es: "+error);
        
        
    }
     finally{
    
    
    }
     
        
    }
    
}
