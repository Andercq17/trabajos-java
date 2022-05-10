
package mesa;
import mesa.Bola;
import edu.princeton.cs.algs4.*;
import java.util.Random;
public class Mesa {
    
    public static int width=500;
    public static int heigh= 500;
    public RectHV rectangulo= new RectHV(0,0,500,500);
    private int n;
    private Bola[] bag;
    private int p=0;
   
    
    public void push(Bola s){
        if(p==0){
            bag[p]=s;
        }else{
        bag[p++]=s;
        }
    }
    public Bola pop(){
        bag[n]=null;
        Bola s= bag[--n];
        
        
        return s;
    }
    public Boolean isempty(){
        return bag[0]==null;
    }
    
    public void Run() {
        Mesa bolas = new Mesa(n);
        for(int i=0; i<=n;i++){
            Bola s= new Bola();
            bolas.push(s);
        }
        Bola bola= new Bola();
        while(bola.colision!=true){
            StdDraw.clear();
                bola.Draw();
                bola.Move(StdRandom.uniform(20));
                bola.Collision(rectangulo);
                StdDraw.enableDoubleBuffering();
                StdDraw.show(10);
                
                if(bola.colision=true){
                    bola.colision=false;
                }
        
        
        }
        
        
        
        
        /*int k=0;
        int l=0;
        for(int i=0; i<=n;i++){
            while(bolas.bag[k].colision!=true){
                StdDraw.clear();
                bolas.bag[k].Draw();
                bolas.bag[k].Move(StdRandom.uniform(20));
                bolas.bag[k].Collision(rectangulo);
                StdDraw.enableDoubleBuffering();
                StdDraw.show(10);
                l++;
                if(bolas.bag[k].colision=true){
                    bolas.bag[k].colision=false;
                    if(l==200){
                        bolas.bag[k].colision=true;
                        
                    }
                }
            }
            k++;
        }*/
        
        
    }
    
    public Mesa(int n){
        bag= new Bola[n];
        this.n=n;
    }
    
    
    public static void main(String[] args) throws Exception {
       
            Mesa mesa= new Mesa(5);
            mesa.Run();
        
   
    }
    
}
