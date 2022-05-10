
package taller_tres;

import java.util.Comparator;

public class PorCalificaciones implements Comparator<Pelicula>{
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getVotes() - o2.getVotes(); 
        }
}
