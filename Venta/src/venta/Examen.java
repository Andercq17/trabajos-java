
package venta;

import edu.princeton.cs.algs4.BST;
import edu.princeton.cs.algs4.Bag;
public class Examen {
    
    public BST<String,Bag<Venta>>cubototalesVenta = new BST<String,Bag<Venta>>(); 
    
    public double totalventas(int año, String vendedor, int tipo){
        if(cubototalesVenta.contains(vendedor)){
            for (Venta s : cubototalesVenta.get(vendedor)) {
                if(s.año == año && s.tipoproducto == tipo) return s.valor;
            else return 0;
            }
        }
        return 0;
    }

    public void cargarDatos(Bag<Venta> venta){
        for (Venta s : venta){
            if (!cubototalesVenta.contains(s.vendedor)){
                Bag<Venta> bag = new Bag<Venta>();
                bag.add(s);
                cubototalesVenta.put(s.vendedor, bag);
            }
            else{
                Bag<Venta> bag = cubototalesVenta.get(s.vendedor);
                bag.add(s);
                cubototalesVenta.put(s.vendedor, bag);
            }
        }
    }
}
