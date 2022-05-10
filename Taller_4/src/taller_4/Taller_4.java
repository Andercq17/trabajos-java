package taller_4;

import edu.princeton.cs.algs4.BST;
import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdOut;
import java.io.IOException;
import java.text.ParseException;
public class Taller_4 {

    public static void main(String[] args) throws IOException, ParseException {
       
  /*  
        //Punto 1 - listado de actores y cantidad de peliculas en las que ha estado
        
        ST<String, Integer> st = st=Pelicula.peliculasPorActor(Pelicula.leerCSV());
    
        for (String s : st.keys()){
            StdOut.println("Nro. peliculas: "+st.get(s) + "   actor: " +s  );
        }
    
   
*

//-----------------------------------------------------------------------------------------------    
        
       
    /*
        //Punto 2 - Devuelve lista ordenada en decreciente de los actores con el numero de peliculas en las que ha participado
    
        Pelicula.listarPorNumeroDePelículas(Pelicula.peliculasPorActor(Pelicula.leerCSV()));
    
    */    
        

//-----------------------------------------------------------------------------------------------



    /*
        //Punto 3 - Imprimirá el Genero de primeras, y luego los nombres de todas las peliculas que pertenecen a ese genero

        BST<String, Bag<Pelicula>> bst= Pelicula.indicePorGénero(Pelicula.leerCSV());   
        for(String s: bst.keys()){
                StdOut.println(s );
                Bag<Pelicula> bag= bst.get(s);
                for(Pelicula d : bag){
                    StdOut.println(d.getOriginal_title());
                }                
            }
    */        
        
//-----------------------------------------------------------------------------------------------

    
    
        //Punto 4 - Imprimirá las peliculas en las que participó ese actor en ese año (ejecutar cada linea por independiente)

        //Pelicula.peliculasPorActoryAño("Lee Patrick", 208, Pelicula.leerCSV());  //Deberá imprimir que no hay peliculas registradas en ese año para ese actor
        //Pelicula.peliculasPorActoryAño("Ander", 1945, Pelicula.leerCSV());       //Deberá imprimir que ese actor no existe
        //Pelicula.peliculasPorActoryAño("Lee Patrick", 1945, Pelicula.leerCSV()); //Deberá imprimir las peliculas en las que participó el actor en ese año
    
      
        
    }
    
}
