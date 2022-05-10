
package taller_;
import edu.princeton.cs.algs4.*;

public class Matriz {

    private int m;
    private int n;
    private int[][] matriz= new int[m][n];
    
 
    public Matriz(int filas, int columnas) {
        m=filas;
        n=columnas;
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                matriz[i][j] = (int)(Math.random()*(1000+1));
            }
        }
        
    }
   
    
    public void Suma(){
    
    
    }
    public void Producto(){
    
    }
}
