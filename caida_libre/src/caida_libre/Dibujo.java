package caida_libre;
import edu.princeton.cs.algs4.*;
import caida_libre.Caida_libre;
import java.math.*;
public class Dibujo {
    private double x, y;
    private double vx, vy;
    private double radio=0.02;
    private Point2D posicion= new Point2D(x,y);
    private Point2D velocidad= new Point2D(vx, vy);
    private RectHV canvas;
    
    public void Draw(RectHV canvas){
        x= canvas.width()/2;
        y= canvas.ymax();
        this.canvas= canvas;
        StdDraw.filledCircle(posicion.x(), posicion.y(), radio);
        
    }
    public void Mover(){
        double v0, v, y0, y, g;
        int t=0;
        v=0;
        g=9.8;
        v0=v;
        v=v0+g*t;
        y0= this.y;
        Point2D pos_temp = new Point2D(posicion.x(), posicion.y()+v0*t+1/2*g*Math.pow(t, 2));
        posicion=pos_temp;
        t++;
    }
    public boolean Colision(){
        if(posicion.y() == canvas.ymin()){
            return true;
        }
        else{
            return false;
        }
    }
    

}
