package main;
import interfacs.imachine;
import interfacs.imandm;
import java.util.ArrayList;
import java.util.Random;
public class machine implements imachine{
    private ArrayList<imandm> arrayList = new ArrayList<imandm>();
    private int cantidad_inicial_mandms=arrayList.size();
    
    @Override
    public void añadir(imandm maquina) {
        System.out.println("Agregando chocolates m&m");
        this.arrayList.add(maquina);
    }

    @Override
    public void eliminar(int mandms) {
        System.out.println("dispensando chocolates m&m...");
        Random numero= new Random();
        if(arrayList.size()>mandms){
            for(int i=0;i<mandms;i++){
                this.arrayList.remove(numero.nextInt(arrayList.size()));
            }
            System.out.println("se dispensaron "+mandms+" m&m");
        }else{
            System.out.println("No hay esa cantidad de m&m, pero ten esta cantidad: "+arrayList.size());
            System.out.println("dispensando "+arrayList.size()+" m&m");
            for(int i=0;i<arrayList.size();i++){
                this.arrayList.remove(numero.nextInt(arrayList.size()));
            }
        }
        coloresmandm();
        notificar();
    }

    @Override
    public void notificar() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Comunicandole a los chocolates m&m lo que ha pasado en la maquina...");
        System.out.println("--------------------------------------------------------------------");
        for (imandm s:arrayList){
            s.actualizar(this);
        }
    }
    public void cantidadmandm(){
        int conteo=0;
        for(int i=0; i<arrayList.size();i++){
            conteo++;
        }
        System.out.println("Hay "+conteo+" chocolates m&m dentro de la maquina");
        
    }
    public void coloresmandm(){
        int amarillo=0;
        int azul=0;
        int verde=0;
        int marron=0;
        for(imandm s:arrayList){ 
           String color=s.exponer_color();
           switch(color){
               case "amarillo":
                   amarillo++;
                   break;
               case "azul":
                   azul++;
                   break;
               case "verde":
                   verde++;
                   break;
               case "marron":
                   marron++;
                   break; 
           }
        }
        System.out.println("los colores dentro de la maquina son: \n"+"Amarillo: "+amarillo+"\nAzul: "+azul+"\nVerde: "+verde+"\nMarron: "+marron);
    }

   
}
