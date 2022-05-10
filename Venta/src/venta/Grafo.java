package venta;

import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

public class Grafo {
    
    public static boolean Existe(Digraph g, int s, int t){
        Queue<Integer> queu=new Queue<>();
        int last[]= new int[g.V()];
        boolean visit[]= new boolean[g.V()];
        for(boolean n:visit){
            n=false;
        }
        queu.enqueue(s);
        visit[s]=true;
        last[s]=-1;

        while(!queu.isEmpty()) {
            Integer now = queu.dequeue();
            StdOut.println("Visitado: "+now);

            for(Integer vecino: g.adj(now)) {
                if(!visit[vecino]) {
                    visit[vecino]=true;
                    if (vecino ==t){
                        return true;
                    }else{
                        visit[vecino]=true;
                        queu.enqueue(vecino);
                    }
                }
            }
        }
        Queue(s, t, last);
        return false;
    }

    public static Queue Queue(int s,int t,int[] last){
        Queue<Integer> queu= new Queue<>();
        int v=t;
        while(last[v]!=-1){
            queu.enqueue(v);
            v=last[v];
        }
        queu.enqueue(s);
        for (Integer k : queu) {
            StdOut.println("en la cola tenemos a: "+ k);
        }
        return queu;
    }

    public static void Digraph(){
        Digraph grafo = new Digraph(5);
        grafo.addEdge(0, 1);
        grafo.addEdge(0, 2);
        grafo.addEdge(2, 1);
        grafo.addEdge(1, 4);
        grafo.addEdge(3, 2);
        grafo.addEdge(4, 1);
        grafo.addEdge(4, 2);
        grafo.addEdge(4, 3);
    }   
}
