package main;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random mandms= new Random();
        machine maquina=new machine();
        System.out.println("------------------------------------------");
        System.out.println("--------Se agregarán chocolates...--------");
        System.out.println("------------------------------------------");
        for(int i=0; i<mandms.nextInt(5)+10;i++){
            maquina.añadir(new mandm());
        }
        maquina.cantidadmandm();
        System.out.println("--------------------------------------------");
        System.out.println("--------Se dispansarán chocolates...--------");
        System.out.println("--------------------------------------------");
        maquina.eliminar(mandms.nextInt(10));
        System.out.println("--------------------------------------");
        System.out.println("--------Cantidad chocolates...--------");
        System.out.println("--------------------------------------");
        maquina.cantidadmandm();
        System.out.println("--------------------------------------------");
        System.out.println("--------Se dispansarán chocolates...--------");
        System.out.println("--------------------------------------------");
        maquina.eliminar(mandms.nextInt(10));
        
    }
    
}
