/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class pai {
    
    
      public static void main(String[] args) {
        
         double vip=12.8, recargo=8 ;
         
         
         
         Scanner teclado= new Scanner(System.in);
         
         String nombre1,nombre2,nombre3,nombre4, tipo_cliente, nombre_articulo;
        
         double valor_articulo1=teclado.nextDouble()-teclado.nextDouble()*12.8/100;
         double ValorARt2=teclado.nextDouble()+teclado.nextDouble()*8/100;
         double ValorARt3=teclado.nextDouble()+teclado.nextDouble()*8/100;
         double ValorARt4=teclado.nextDouble()-teclado.nextDouble()*12.8/100;
         double TlComprasSR=0;
         double TlCR=0;
           
         
         
             
         
         
         
     try{
         
         //CLIENTE #1
         
         System.out.println("cliente #1");
         
         System.out.print("Ingrese su nombre: ");
         nombre1= teclado.nextLine();
         
         System.out.println("¿Qué tipo de cliente eres?");
         tipo_cliente=teclado.nextLine();
         
         System.out.print("Nombre del articulo comprado: ");
         nombre_articulo=teclado.nextLine();
         
         System.out.print("Ingrese el valor del articulo: ");
         valor_articulo1=teclado.nextDouble();
         
         System.out.println("*********************************");
         System.out.println("Nombre y tipo de cliente: "+nombre1+" "+tipo_cliente);
         System.out.println("nombre del articulo: "+nombre_articulo);
       
         System.out.println("Total neto: "+valor_articulo1);
         System.out.println("*********************************");
         
         
         //CLIENT #2
         
         System.out.println("cliente #2");
         System.out.println("");
         
         System.out.print("Ingrese su nombre: ");
         nombre2= teclado.nextLine();
         
         System.out.println("¿Qué tipo de cliente eres?");
         tipo_cliente=teclado.nextLine();
         
         System.out.print("Nombre del articulo comprado: ");
         nombre_articulo=teclado.nextLine();
         
         System.out.print("Ingrese el valor del articulo: ");
         ValorARt2=teclado.nextDouble();
         
         System.out.println("*********************************");
         System.out.println("Nombre y tipo de cliente: "+nombre2+" "+tipo_cliente);
         System.out.println("nombre del articulo: "+nombre_articulo);
        
         System.out.println("Total neto: "+ValorARt2);
         System.out.println("*********************************");
         
         
         //CLIENTE #3
         
         System.out.println("cliente #3");
         System.out.println("");
         
         System.out.print("Ingrese su nombre: ");
         nombre3= teclado.nextLine();
         
         System.out.println("¿Qué tipo de cliente eres?");
         tipo_cliente=teclado.nextLine();
         
         System.out.print("Nombre del articulo comprado: ");
         nombre_articulo=teclado.nextLine();
         
         System.out.print("Ingrese el valor del articulo: ");
         ValorARt3=teclado.nextDouble();
         
         System.out.println("*********************************");
         System.out.println("Nombre y tipo de cliente: "+nombre3+" "+tipo_cliente);
         System.out.println("nombre del articulo: "+nombre_articulo);
         
         System.out.println("Total neto: "+(ValorARt3));
         System.out.println("*********************************");
         
         
         
         
         //CLIENTE #4
         
         System.out.println("cliente #4"); 
         System.out.println("");
         
         
         System.out.print("Ingrese su nombre: ");
         nombre4= teclado.nextLine();
         
         System.out.println("¿Qué tipo de cliente eres?");
         tipo_cliente=teclado.nextLine();
         
         System.out.print("Nombre del articulo comprado: ");
         nombre_articulo=teclado.nextLine();
         
         System.out.print("Ingrese el valor del articulo: ");
         ValorARt4=teclado.nextDouble();
         
         System.out.println("*********************************");
         System.out.println("Nombre y tipo de cliente: "+nombre4+" "+tipo_cliente);
         System.out.println("nombre del articulo: "+nombre_articulo);
        
         System.out.println("Total neto: "+ValorARt4);
         System.out.println("*********************************");
         
         
         
         
         
         System.out.println("********************************+");
         System.out.println("total de las compras sin recargo es: "+ValorARt2+ValorARt3);
         System.out.println("total de las compras con recargo: "+valor_articulo1+ValorARt4);
         
         
     }
catch(Exception VarError){
JOptionPane.showMessageDialog(null,"Se presento un error de ejecución: "+VarError);
}
     
finally{

         System.out.println("fin de la ejecucion");
         
}
     
     
     }
    
}
