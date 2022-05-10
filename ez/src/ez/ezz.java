package ez;

import edu.princeton.cs.algs4.MaxPQ;

public class ezz {
    
    public class Punto2D implements Comparable<Punto2D> {
        private double x, y;
        private double a, b, c;
        public double Distance(double a, double b, double c) {
            return (Math.abs(a * x + b * y + c) / Math.sqrt(a * a + b * b));
        }

        public int compareTo(Punto2D punto) {
            if (Distance(a, b, c) < punto.Distance(a, b, c)) {
                return -1;
            }
            return 0;
        }

        public Punto2D[] PuntosCercanos(double a, double b, double c, Punto2D[] punto, int f) {
            MaxPQ<Punto2D> m = new MaxPQ<Punto2D>(f);
        
            for(int j=0; j< f;j++) 
            {
                m.insert(punto[j]);
            }
            for(int j= f; j< punto.length;j++){
                if(punto[j].compareTo((Punto2D)m.max())<0){
                    m.delMax();
                    m.insert(punto[j]);
                }
            }
            Punto2D[] pk = new Punto2D[f];
            for(int j=0; j<f;j++){
                pk[j] = m.delMax();
            }
            return pk;
        }
    }
        
        
        
}
