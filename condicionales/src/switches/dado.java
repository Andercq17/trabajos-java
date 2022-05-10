
package switches;

import java.util.Scanner;
public class dado {
    public static void main(String[] args) {
    
        short dado=0;
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("ingrese el valor del dado");
        dado=teclado.nextShort();
        switch(dado){
            case 1:
                System.out.println("6");
                break;
            case 2:
                System.out.println("5");
                break;
            case 3:
                System.out.println("4");
                break;
            case 4:
                System.out.println("3");
                break;
            case 5:
                System.out.println("2");
                break;
            case 6:
                System.out.println("1");
            break;
            default:
                System.out.println("error, numero incorrecto");
            break;
            
        }
        
        
        
    
    }
}
