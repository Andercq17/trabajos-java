package caida_libre;
import edu.princeton.cs.algs4.*;
import caida_libre.Dibujo;
public class Caida_libre {
    public RectHV canvas= new RectHV(0,0,200,200);
    
    public void Run(){
        boolean b=true;
        while(b=true){
            Dibujo caida= new Dibujo();
            caida.Draw(canvas);
            caida.Mover();;
            if(caida.Colision()==true){
                b=false;
            }
            
        }
        
    }
    
    public static void main(String[] args) {
        Caida_libre simulacion= new Caida_libre();
        simulacion.Run();
        
        
    }
    
}
