
package separador;


public class Separador {
    public static void recursion(int number) {
        if(number > 0) {
            recursion(number/10);
            System.out.printf("%d   ", (number%10));
        }
    }
    
    
    
    public static void main(String[] args) {
        int number=531; // = some int

        while (number > 0) {
            System.out.println(number % 10);
            number = number / 10;
        }
        
    }
    
}
