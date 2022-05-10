
package taller_4;


import java.util.Comparator;
public class Comparat implements Comparator<Diccionario>{
    public Comparat(){
    }

    @Override
    public int compare(Diccionario t, Diccionario t1) {
            return t1.getValue() - t.getValue(); 
         
    }
}
