package taller_tres;
import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Comparator;
import taller_tres.Pelicula;
public class Taller_tres {

    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException {
        
        //Pelicula pelicula= new Pelicula();
        //pelicula.Asignar(Pelicula.leerCSV());
        //pelicula.imprimir(); impresión sin ordenar
        
        
    
        
        
        
    /*
        Punto 3
        
        Pelicula pelicula= new Pelicula();
        pelicula.Asignar(Pelicula.leerCSV());
        pelicula.imprimir();
    */
        
        
        
        
    /*
        Punto 4
        Pelicula pelicula= new Pelicula();
        pelicula.Asignar(Pelicula.leerCSV());
        
        pelicula.listarPorRating(); // ordenamiento decreciente por avg
        pelicula.imprimir();
    */
        



    /*
        Punto 6
        
        pelicula.Asignar(Pelicula.leerCSV());
        Pelicula pelicula= new Pelicula();
        //pelicula.ListarPorComparador(pelicula.getPeliculas(), new PorTitulo());
        //pelicula.ListarPorComparador(pelicula.getPeliculas(), new PorCalificaciones());
        //pelicula.ListarPorComparador(pelicula.getPeliculas(), new PorFecha());
    */    
        
        
        
        
    /* Punto 7 (deshacer comentario y ejecutar el codigo)    
        //medicion de tiempo algoritmo ordenamiento Shell
        pelicula.medirTiempoSHELL(Pelicula.leerCSV());
        
        //medicion de tiempo algoritmo ordenamiento Heap
        pelicula.medirTiempoHEAP(Pelicula.leerCSV());
    
        //medicion de tiempo algoritmo ordenamiento Quick
        pelicula.medirTiempoQUICK(Pelicula.leerCSV());
    */
        
    
    
    
    /*Punto 8
      
    INSERTION
    
    Pelicula pelicula= new Pelicula();
    Pelicula [] peliculas= Pelicula.leerCSV();
    int k=0;
    System.out.println("Insertion - Titulo");
    while(k<20){
        StdRandom.shuffle(peliculas);
        System.out.println(pelicula.medirTiemporALG(peliculas, "Insertion", "Titulo"));
        k++;
    }  
    

    SELECTION
    
    Pelicula pelicula= new Pelicula();
    Pelicula [] peliculas= Pelicula.leerCSV();
    int k=0;
    System.out.println("selection - titulo");
    while(k<4){
        StdRandom.shuffle(peliculas);
        System.out.println(pelicula.medirTiemporALG(peliculas, "Selection", "titulo"));
        k++;
    }
    
    
    MERGEX
    
    Pelicula pelicula= new Pelicula();
    Pelicula [] peliculas= Pelicula.leerCSV();
    int k=0;
    System.out.println("MergeX - titulo");
    while(k<4){
        StdRandom.shuffle(peliculas);
        System.out.println(pelicula.medirTiemporALG(peliculas, "Merge", "titulo"));
        k++;
    }
    
    
    */
    
    
      
    /*
    
    Punto 9
    
    Pelicula pelicula= new Pelicula();
    Pelicula [] peliculas= Pelicula.leerCSV();
    pelicula.Asignar(peliculas);
    pelicula.peliculasMasVotadas(4);
    
    */
      
    
    
    
    /*
    Punto 10
    
    
    for(int i=5;i<=20;i++){
        Pelicula pelicula= new Pelicula();
        Pelicula [] peliculas= Pelicula.leerCSV();
        pelicula.Asignar(peliculas);
        pelicula.peliculasMasVotadas(i);
        System.out.println(pelicula.getTiempo());
    }
    */
    
    
        
    }
   
    
    
    

}
