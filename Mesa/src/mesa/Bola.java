package mesa;
import edu.princeton.cs.algs4.*;
import java.util.Random;
import mesa.Mesa;
public class Bola {
    private Random rand= new Random();
    public double vx=0.0 + ( 0.9 - 0.0 ) * rand.nextDouble();
    public double vy=0.0 + ( 0.9 - 0.0 ) * rand.nextDouble();
    public double x= StdRandom.uniform(300);; 
    public double y= StdRandom.uniform(300);;
    private Point2D posicion = new Point2D(x,y);
    private Point2D velocidad = new Point2D(vx,vy);
    double radio=0.02;
    Boolean colision=false;
    
    
    public void Draw(){
        StdDraw.filledCircle(posicion.x()/Mesa.width, posicion.y()/Mesa.heigh, radio);
        
    }
    public void Move(double dt){
        Point2D pos_temp= new Point2D(posicion.x()+velocidad.x()*dt, posicion.y()+velocidad.y()*dt);
        posicion= pos_temp;
               
    }
    
    public void Collision(RectHV mesa){
        
        
        if(posicion.x()> mesa.xmax()){
            colision=true;
            
            double dvx=-velocidad.x();
            Point2D pos_v= new Point2D(dvx,velocidad.y());
            velocidad=pos_v;
            
            
        }
        else if(posicion.y()>mesa.ymax()){
            colision=true;
            
            
            double dvy=-velocidad.y();
            Point2D pos_v= new Point2D(velocidad.x(),dvy);
            velocidad=pos_v;
            
        }
        //--------------------------------------------------
        
        
        else if(posicion.x()<=mesa.xmin()){
            colision=true;
            
            
            double dvx=-velocidad.x();
            Point2D pos_v= new Point2D(dvx,velocidad.y());
            velocidad=pos_v;
            
        }
        else if(posicion.y()<=mesa.ymin()){
            colision=true;
            
            
            double dvy=-velocidad.y();
            Point2D pos_v= new Point2D(velocidad.x(),dvy);
            velocidad=pos_v;
            
        }
        
        
        
        
    
    }
    
   /* public static void main(String[] args) {
 
        Bola bola= new Bola();
        Mesa mesa= new Mesa();
        
       
        
        while(bola.colision!=true){
            StdDraw.clear();
            bola.Draw();
            bola.Move(2);
            bola.Collision(mesa.rectangulo);
            StdDraw.enableDoubleBuffering();
            StdDraw.show(10);
            if(bola.colision=true){
                bola.colision=false;
            }
            
        }
            
        
          
                   
        
        
        
        
    }*/
    
}
