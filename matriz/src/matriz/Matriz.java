
package matriz;
import java.util.Scanner;
public class Matriz {

    public static void main(String[] args) {
    
        int matriz[][],filas,columnas;
        Scanner teclado= new Scanner(System.in);
        
        filas= teclado.nextInt();
        System.out.println("inserte el numero de filas: "+"("+filas+")");
        
         columnas= teclado.nextInt();
        System.out.println("inserte el numero de filas: "+"("+columnas+")");
        
        matriz = new int [filas][columnas];
        
        }
    }
    

