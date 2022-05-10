/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import edu.princeton.cs.algs4.RectHV;
import edu.princeton.cs.algs4.StdDraw;

/**
 *
 * @author ASUS
 */
public class Bola {
    public void Bola(double x, double y, int f){
        mover(0.5,0.5, f);
    }
    private void mover(double x, double y, int f){
        RectHV draw= new RectHV(0.315,0.114,0.685,0.884);
        
        
        for(int j=0; j<=f;j++){
            StdDraw.circle(0.5, 0.5, 3);
            
        
        
        }
    
    
    
    }
}
