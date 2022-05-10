
package menu;

import java.util.Scanner;
public class Menu {

    public static void main(String[] args) {
    
        Scanner decision= new Scanner(System.in);

System.out.println();
System.out.println();
System.out.println(" ____ ___                .__                                   ");
System.out.println("|    |   \\_______   ____ |  |__     _____   ____   ____  __ __ ");
System.out.println("|    |   /\\_  __ \\_/ ___\\|  |  \\   /     \\_/ __ \\ /    \\|  |  \\");
System.out.println("|    |  /  |  | \\/\\  \\___|   Y  \\ |  Y Y  \\  ___/|   |  \\  |  /");
System.out.println("|______/   |__|    \\___  >___|  / |__|_|  /\\___  >___|  /____/ ");
System.out.println("                       \\/     \\/        \\/     \\/     \\/       ");
System.out.println();
System.out.println("| 1. Saludar                       |");
System.out.println("| 2. comida favorita               |");
System.out.println("| 3. ¿Como quieres que te llame?   |");
System.out.println("| 4. chur papichulo                |");
System.out.println("| 5. Ander papirico                |");
System.out.println();
System.out.println();
System.out.println("¿Que desea llevar hermoso papucho? \n Escriba aqui:");
int pedido= decision.nextInt();

String pedido2;    


       

if (pedido==1) {

System.out.println("Her there I am using sublime");
	
}
if (pedido==4) {

System.out.println("Chur papasitooooooooo");
	
}
if (pedido==5) {

System.out.println("Eres un papirico andeeeer");
	
}

if (pedido==2) {

System.out.println("¿Cual es tu comida favorita?");
pedido2=decision.nextLine();

System.out.println("tu comida favorita es: "+pedido2);

	
}
if (pedido==3) {

System.out.println("¿Como quieres que te llame?");
pedido2=decision.nextLine();

System.out.println("Esta bien, de ahora en adelante te llamare "+pedido2);
	
}    
    
    }
    
}
