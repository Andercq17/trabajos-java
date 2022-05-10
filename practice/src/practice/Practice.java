package practice;
import java.util.*;
import edu.princeton.cs.algs4.StdDraw;
public class Practice {
       
    public void BoladeBillar(double direccionX, double direccionY, int f) throws InterruptedException{       
        mover(0.5, 0.5, direccionX,direccionY,f);
    }
    public void MesaBillar(){
        StdDraw.rectangle(0.5, 0.5, 0.30, 0.40);
    }
    public void mover(double x, double y, double dx,double dy, int f) throws InterruptedException{
        double d = Math.pow(dx, 2)+ Math.pow(dy, 2);
        double xx = Math.sqrt(d)*10;
        int v,v1,v2,v3;
        v=90;
        v1=70;
        v2=50;
        v3=30;
        for(int j=0;j<=f;j++){
            MesaBillar();
            if(f<10){
                MesaBillar();             
                StdDraw.circle(x, y, 0.02);
                Thread.sleep(v);
                v++;
                
                if(x<dx&&y<dy){
                    x=x+0.02;
                    y=y+0.02;
                    
                }else if(x>dx&&y<dy){
                    x=x-0.02;
                    y=y+0.02;
                }else if(x<dx&&y>dy){
                    x=x+0.02;
                    y=y-0.02;
                }else if(x>dx&&y>dy){
                    x=x-0.02;
                    y=y-0.02;
                }
                
                    
                    
                
                

            }else if(f<30){
                StdDraw.clear();
                MesaBillar();
                StdDraw.circle(x, y, 0.02);
                
                Thread.sleep(v1);
                v1++;
            }else if(f<70){
                StdDraw.clear();
                MesaBillar();
                StdDraw.circle(x, y, 0.02);
                Thread.sleep(v2);
                v2++;
                
            }else if(f<0){
                MesaBillar();
                Thread.sleep(0);
                StdDraw.circle(x, y, 0.02);
                StdDraw.clear();
            }else{
               
                Thread.sleep(v3);
                StdDraw.circle(x, y, 0.02);
                v3++;
            }
        }
                
        
        
        /*for(int i=0; i<=f;i++){           
            StdDraw.circle(x, y, 0.03);
            Thread.sleep(v);
            v++;
            x=x+0.01;
            y=y+0.01;
            StdDraw.clear();
            MesaBillar();
        }*/
    
    }
    
    
}
