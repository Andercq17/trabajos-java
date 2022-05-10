/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import javax.swing.JOptionPane;
public class rodamiento {
     public static void main(String[] args) {
     
     double decada=Double.parseDouble(JOptionPane.showInputDialog("introduzca la decada del vehiculo"));  
     double avaluo=Double.parseDouble(JOptionPane.showInputDialog("introduzca el avaluo del vehiculo"));   
     double TR;
     double TS;   
     double Total_Pagar;
     try{
    if(decada==70){
        TR=avaluo*0.0376;
        TS=avaluo*0.00876;
        Total_Pagar=(avaluo-TR)-TS;
        System.out.println("***************************************");
        System.out.println("el valor de su avaluo es: "+avaluo);
        System.out.println("el valor de la tasa de rodamiento es: "+TR);
        System.out.println("el valor de la tasa de seguro es: "+TS);
        System.out.println("su valor total a pagar es: "+ Total_Pagar);    
    }
    
         
     else if(decada==80){
        TR=avaluo*0.0398;
        TS=avaluo*0.00854;
        Total_Pagar=(avaluo-TR)-TS;
        System.out.println("***************************************");
        System.out.println("el valor de su avaluo es: "+avaluo);
        System.out.println("el valor de la tasa de rodamiento es: "+TR);
        System.out.println("el valor de la tasa de seguro es: "+TS);
        System.out.println("su valor total a pagar es: "+ Total_Pagar);
        
    }

     else if(decada==90){
        TR=avaluo*0.0409;
        TS=avaluo*0.00816;
        Total_Pagar=(avaluo-TR)-TS;
        System.out.println("***************************************");
        System.out.println("el valor de su avaluo es: "+avaluo);
        System.out.println("el valor de la tasa de rodamiento es: "+TR);
        System.out.println("el valor de la tasa de seguro es: "+TS);
        System.out.println("su valor total a pagar es: "+ Total_Pagar);
        
    }

      else if(decada==00){
        TR=avaluo*0.0434;
        TS=avaluo*0.00798;
        Total_Pagar=(avaluo-TR)-TS;
        System.out.println("***************************************");
        System.out.println("el valor de su avaluo es: "+avaluo);
        System.out.println("el valor de la tasa de rodamiento es: "+TR);
        System.out.println("el valor de la tasa de seguro es: "+TS);
        System.out.println("su valor total a pagar es: "+ Total_Pagar);
        
    }

 else if(decada==10){
        TR=avaluo*0.0493;
        TS=avaluo*0.00712;
        Total_Pagar=(avaluo-TR)-TS;
        System.out.println("***************************************");
        System.out.println("el valor de su avaluo es: "+avaluo);
        System.out.println("el valor de la tasa de rodamiento es: "+TR);
        System.out.println("el valor de la tasa de seguro es: "+TS);
        System.out.println("su valor total a pagar es: "+ Total_Pagar);
        
    }
 else if(decada==20){
        TR=avaluo*0.0568;
        TS=avaluo*0.00699;
        Total_Pagar=(avaluo-TR)-TS;
        System.out.println("***************************************");
        System.out.println("el valor de su avaluo es: "+avaluo);
        System.out.println("el valor de la tasa de rodamiento es: "+TR);
        System.out.println("el valor de la tasa de seguro es: "+TS);
        System.out.println("su valor total a pagar es: "+ Total_Pagar);
        
    }
 else{
      TR=avaluo*0.06;
        TS=avaluo*0.09;
        Total_Pagar=(avaluo-TR)-TS;
        System.out.println("***************************************");
        System.out.println("el valor de su avaluo es: "+avaluo);
        System.out.println("el valor de la tasa de rodamiento es: "+TR);
        System.out.println("el valor de la tasa de seguro es: "+TS);
        System.out.println("su valor total a pagar es: "+ Total_Pagar);
        
     
 }
     
    }
    catch(Exception error){
        System.out.println("hubo un error y es: "+error);
        
        
    }
     finally{
    
    
    }
     
     }
    
    
}
