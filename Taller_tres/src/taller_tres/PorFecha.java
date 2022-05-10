
package taller_tres;

import java.util.Comparator;

public class PorFecha implements Comparator<Pelicula> {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDate_published().compareTo(o2.getDate_published());
        }
}
