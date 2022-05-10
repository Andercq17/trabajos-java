
package taller_4;

import java.util.Comparator;


public class Comparador implements Comparator<Pelicula>{

    private String comparador;
    public Comparador(String nombre){
        comparador = nombre;
    }

    @Override
    public int compare(Pelicula t, Pelicula t1) {
        if(comparador.toUpperCase().equals("TITULO")){
            return t.getOriginal_title().compareTo(t1.getOriginal_title()); 
        }
        else if(comparador.toUpperCase().equals("FECHA")){
            return t.getDate_published().compareTo(t1.getDate_published());
        }
        else if(comparador.toUpperCase().equals("CALIFICACION")){
            return t.getVotes() - t1.getVotes(); 
            
        }else if(comparador.toUpperCase().equals("VALUE")){
            return t.getVotes() - t1.getVotes(); 
            
        }else{
            return 0;
        }
    }
    
    
}
