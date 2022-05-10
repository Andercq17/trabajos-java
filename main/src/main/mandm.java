package main;

import interfacs.imachine;
import interfacs.imandm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class mandm implements imandm{
    private String amarillo="amarillo", azul="azul", verde="verde", marron="marron"; 
    private ArrayList<String> colores = new ArrayList<String>();
    public ArrayList<String> getColores() {
        return colores;
    }
    private String color;
    private Random numero= new Random();
    private int numero_aleatorio;
    private int cantidad;
    public mandm() {
        colores.add(azul);
        colores.add(amarillo);
        colores.add(verde);
        colores.add(marron);
        numero_aleatorio=numero.nextInt(4);
        color=colores.get(numero_aleatorio);
    }
    @Override
    public void actualizar(imachine maquina) {
        System.out.println("-------------------------------------------------------");
        System.out.println("--------Comentario de un chocolate bonito c:...--------");
        System.out.println("-------------------------------------------------------");
        List<String> estables = Arrays.asList("Que se sentira el mas alla?","Quiero salir ya!","Tengo miedo chicos","Que impresion!","cuando nos sacaran?","estoy aburrido","que flojera","me gustas m&m marron");
        System.out.println(estables.get(numero.nextInt(8)));
        
        
    }

    @Override
    public String exponer_color() {
        return color;
    }
      
}
