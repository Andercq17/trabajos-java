/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import javax.swing.JOptionPane;
public class JavaApplication22 {
    public static void main(String[] args) {
        
        Double valor_compra= 150.5;
        
        Double descuento;
        
        int numero_descuento = (int)(Math.random()*100+1);
        
        if(numero_descuento<30){
            descuento = valor_compra*0.1;
            valor_compra=valor_compra-descuento;
            JOptionPane.showMessageDialog(null, "Se le ha descontado a su compra: "+descuento+ "\nEl valor total a pagar con descuento es: "+valor_compra);
        }else if(numero_descuento>30 && numero_descuento<50){
            descuento = valor_compra*0.2;
            valor_compra=valor_compra-descuento;
            JOptionPane.showMessageDialog(null, "Se le ha descontado a su compra: "+descuento+ "\nEl valor total a pagar con descuento es: "+valor_compra);
        }else if(numero_descuento>50&&numero_descuento<80){
            descuento = valor_compra*0.3;
            valor_compra=valor_compra-descuento;
            JOptionPane.showMessageDialog(null, "Se le ha descontado a su compra: "+descuento+ "\nEl valor total a pagar con descuento es: "+valor_compra);
        }else if(numero_descuento>80&& numero_descuento<=100){
            descuento = valor_compra*0.4;
            valor_compra=valor_compra-descuento;
            JOptionPane.showMessageDialog(null, "Se le ha descontado a su compra: "+descuento+ "\nEl valor total a pagar con descuento es: "+valor_compra);
        }else{
            JOptionPane.showMessageDialog(null, "No se ha podido hacer el descuento");
        
        }
        
       
        
        
        
        
    }
    
}
