
package simulacion;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.RectHV;
public class Simulacion {
    
    //limite inferior = 0.114
    //limite superior = 0.884
    //limite lateral derecho = 0.685
    //limite lateral izquierdo =0.315
    /*
   public static void Bola_dos(){
        
        Draw circulo= new Draw();
            circulo.rectangle(0, 0, 0, 0);
            circulo.circle(0.5, 0.5, 0.015);
    }*/
    
    /*public static void rthv(){
        RectHV draw= new RectHV(0.315,0.114,0.685,0.884);
        System.out.print(draw.xmax());
    }*/
    public static void rthv(){
        RectHV draw= new RectHV(0.315,0.114,0.685,0.884);
        
    }
    
    public static void Bola(double x, double y, int f) throws InterruptedException{
        mover(x,y, f);
    }
    public static void Mesa(){
        
       
        StdDraw.rectangle(0.5, 0.5, 0.2, 0.4);
    }
    private static void mover(double x, double y, int f) throws InterruptedException{
        RectHV draw= new RectHV(0.315,0.114,0.8,0.884);
        
        double dx=0.5;
        double dy=0.5;
        int f2=0;
        int v=80;
        double ddx;
        double ddy;
        if(dx<x&&dy<y){    
               do{
                  for(int j=0; j<=f;j++){
                    StdDraw.clear();
                      StdDraw.pause(10);
                    v--;
                    Mesa();
                    StdDraw.circle(dx, dy, 0.015);
                    StdDraw.enableDoubleBuffering();
                    StdDraw.show();
                    if(dx<x){
                        dx=dx+0.005;
                    }
                    if(dy<y){
                        dy=dy+0.005;
                    }
                    f2=j;
                    if(dx!=draw.xmax() || dy!=draw.ymax()){
                     break;
                    }
                    
                    }
                   
                   
               }while(dx!=draw.xmax() || dy!=draw.ymax());
               
                if(dx==draw.xmax()){
                    for(int i=f2;i<=f;i++){
                        StdDraw.clear();
                        Mesa();
                        StdDraw.circle(dx, dy, 0.015);
                        dx=dx-0.05;
                        if(dy==draw.ymax()){
                            dy=dy-0.05;
                        }
                    }
                }
                if(dy==draw.ymax()){
                    for(int i=f2;i<=f;i++){
                        StdDraw.clear();
                        Mesa();
                        StdDraw.circle(dx, dy, 0.015);
                        dy=dy-0.05;
                        if(dx==draw.xmax()){
                            dx=dx-0.05;
                        }
                    }
                }
                if(dx==draw.xmax()&& dy==draw.ymax()){
                    for(int i=f2;i<=f;i++){
                        StdDraw.clear();
                        Mesa();
                        StdDraw.circle(dx, dy, 0.015);
                        dx=dx-0.05;
                        dy=dy-0.05;
                    }
                }
        }
        
        //---------------------------------------
        
        if(dx<x&&dy>y){    
         do{
                for(int j=0; j<=f;j++){
                    Thread.sleep(v);
                    v--;
                    StdDraw.clear();
                    Mesa();
                    StdDraw.circle(dx, dy, 0.015);
                    if(dx<x){
                        dx=dx+0.05;
                    }
                    if(dy>y){
                        dy=dy-0.05;
                    }
                    f2=j;
                }
               }while(dx!=draw.xmax() || dy!=draw.ymin());
                if(dx==draw.xmax()){
                    for(int i=f2;i<=f;i++){
                        StdDraw.clear();
                        Mesa();
                        StdDraw.circle(dx, dy, 0.015);
                        dx=dx-0.05;
                        if(dy==draw.ymin()){
                            dy=dy+0.05;
                        }
                    }
                }
                if(dy==draw.ymin()){
                    for(int i=f2;i<=f;i++){
                        StdDraw.clear();
                        Mesa();
                        StdDraw.circle(dx, dy, 0.015);
                        dy=dy+0.05;
                        if(dx==draw.xmax()){
                            dx=dx-0.05;
                        }
                    }
                }
                if(dx==draw.xmax()&& dy==draw.ymin()){
                    for(int i=f2;i<=f;i++){
                        StdDraw.clear();
                        Mesa();
                        StdDraw.circle(dx, dy, 0.015);
                        dx=dx-0.05;
                        dy=dy+0.05;
                    }
                }
        }
        
        //-------------------------------------------------
        
        if(dx>x&&dy<y){    
            do{
                for(int j=0; j<=f;j++){
                    Thread.sleep(v);
                    v--;
                    StdDraw.clear();
                    Mesa();
                    StdDraw.circle(dx, dy, 0.015);
                    if(dx>x){
                        dx=dx-0.05;
                    }
                    if(dy<y){
                        dy=dy+0.05;
                    }
                    f2=j;
                }
               }while(dx!=draw.xmin() || dy!=draw.ymax());
                if(dx==draw.xmin()){
                    for(int i=f2;i<=f;i++){
                        StdDraw.clear();
                        Mesa();
                        StdDraw.circle(dx, dy, 0.015);
                        dx=dx+0.05;
                        if(dy==draw.ymax()){
                            dy=dy-0.05;
                        }
                    }
                }
                if(dy==draw.ymax()){
                    for(int i=f2;i<=f;i++){
                        StdDraw.clear();
                        Mesa();
                        StdDraw.circle(dx, dy, 0.015);
                        dy=dy-0.05;
                        if(dx==draw.xmin()){
                            dx=dx+0.05;
                        }
                    }
                }
                if(dx==draw.xmin()&& dy==draw.ymax()){
                    for(int i=f2;i<=f;i++){
                        StdDraw.clear();
                        Mesa();
                        StdDraw.circle(dx, dy, 0.015);
                        dx=dx+0.05;
                        dy=dy-0.05;
                    }
                }
        }
        
        //-----------------------------------
        if(dx>x&&dy>y){    
            do{
                for(int j=0; j<=f;j++){
                    Thread.sleep(v);
                    v--;
                    StdDraw.clear();
                    Mesa();
                    StdDraw.circle(dx, dy, 0.015);
                    if(dx>x){
                        dx=dx-0.05;
                    }
                    if(dy>y){
                        dy=dy-0.05;
                    }
                    f2=j;
                }
               }while(dx!=draw.xmin() || dy!=draw.ymin());
                if(dx==draw.xmin()){
                    for(int i=f2;i<=f;i++){
                        StdDraw.clear();
                        Mesa();
                        StdDraw.circle(dx, dy, 0.015);
                        dx=dx+0.05;
                        if(dy==draw.ymin()){
                            dy=dy+0.05;
                        }
                    }
                }
                if(dy==draw.ymin()){
                    for(int i=f2;i<=f;i++){
                        StdDraw.clear();
                        Mesa();
                        StdDraw.circle(dx, dy, 0.015);
                        dy=dy+0.05;
                        if(dx==draw.xmin()){
                            dx=dx+0.05;
                        }
                    }
                }
                if(dx==draw.xmin()&& dy==draw.ymin()){
                    for(int i=f2;i<=f;i++){
                        StdDraw.clear();
                        Mesa();
                        StdDraw.circle(dx, dy, 0.015);
                        dx=dx+0.05;
                        dy=dy+0.05;
                    }
                }
        }
       
        
    
    
    
    }
    

    public static void main(String[] args) throws InterruptedException {
        StdDraw.setCanvasSize(1000, 800);
        Mesa();
        Bola(0.6, 0.7, 20);
       
    }
    
}
