
package taller_tres;

import java.util.Comparator;
import taller_tres.Pelicula;

public class PorTitulo implements Comparator<Pelicula> {
    
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
           return o1.getOriginal_title().compareTo(o2.getOriginal_title()); 
        }
    
}
