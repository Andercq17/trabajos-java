package ez;

import edu.princeton.cs.algs4.Merge;
import edu.princeton.cs.algs4.Quick;
import java.util.ArrayList;

public class Ez {

    public  long getTiempo() {
        return tiempo;
    }
        
private long tiempo=0;    
public Comparable[] ONR(Comparable[] entradas){
    long inicio, fin; 
    inicio = System.nanoTime();
            
    Quick.sort(entradas); 
        
    ArrayList<Comparable> array = new ArrayList<>();
    for(int j=0; j<entradas.length; j++){
        if(j==0){
            if(!entradas[j].equals(entradas[j+1])){ 
                array.add(entradas[j]);
            }
        }else if(j==entradas.length-1){
            if(!entradas[j].equals(entradas[j-1]))
            {
                array.add(entradas[j]);
            }
        }else if(!entradas[j].equals(entradas[j+1]) && (!entradas[j].equals(entradas[j-1]))){
            array.add(entradas[j]);
        }
    }
        fin = System.nanoTime();
        tiempo = fin - inicio; 
        return array.toArray(new Comparable[array.size()]);
        
        
}
    
    
    
    
    public static void main(String[] args) {
      Ez ez= new Ez();
        Comparable[] entrada= {0,4,2,1,3,4,5,5,6,6,7,7,8,8};
        
        Comparable[] a= ez.ONR(entrada);
        
        for(int i=0;i< a.length;i++){
            System.out.println(a[i]);
        }
        
    }
    
}
