
package taller_tres;

import edu.princeton.cs.algs4.Heap;
import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.MergeX;
import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.Quick;
import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.Shell;
import edu.princeton.cs.algs4.StdOut;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Pelicula implements Comparable<Pelicula>{

    

    
    //Sobreescritura toString
    @Override
    public String toString() {
        return "Pelicula{" + "imdb_title_id=" + imdb_title_id + ", title=" + title + ", original_title=" + original_title + ", year=" + year + ", date_publishd=" +date_published+ ", genre=" + genre + ", duration=" + duration + ", country=" + country + ", language=" + language + ", director=" + director + ", writer=" + writer + ", production_company=" + production_company + ", description=" + description + ", avg_vote=" + avg_vote + ", votes=" + votes + ", budget=" + budget + ", usa_gross_income=" + usa_gross_income + ", worlwide_gross_income=" + worlwide_gross_income + ", metascore=" + metascore + ", reviews_from_users=" + reviews_from_users + ", reviews_from_critics=" + reviews_from_critics;
    }
    //accesores
    
    
    //Atributos Pelicula
    private String imdb_title_id,title,original_title,year,genre;
    private String duration;
    private String country,language,director,writer,production_company,actors,description;
    private int avg_vote,votes;
    private String budget;
    private long tiempo=0;

    public long getTiempo() {
        return tiempo;
    }
    public String getOriginal_title() {
        return original_title;
    }

    public int getVotes() {
        return votes;
    }

    public Date getDate_published() {
        return date_published;
    }
    private String usa_gross_income,worlwide_gross_income;
    private String metascore,reviews_from_users,reviews_from_critics;

    public Pelicula[] getPeliculas() {
        return peliculas;
    }
    private Pelicula[] peliculas;
    private Date date_published;
    
    //Constructor
    private Pelicula(String imdb_title_id, String title, String original_title, String year, String date_published, String genre, String duration, String country, String language, String director, String writer, String production_company, String actors, String description, String avg_vote, String votes, String budget, String usa_gross_income, String worlwide_gross_income, String metascore, String reviews_from_users, String reviews_from_critics) throws ParseException{
        
        String fecha= date_published;
        if(fecha.length()<6){
            SimpleDateFormat formato = new SimpleDateFormat("yyyy");
            Date date = formato.parse(fecha);
            this.date_published=date;//linea 4
        }else{
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formato.parse(fecha);
            this.date_published=date;//linea 4
        }
        this.imdb_title_id=imdb_title_id;//linea 0
        this.title=title;//linea 1
        this.original_title=original_title;//linea 2
        this.year=year;//linea 3
        
        this.genre=genre;//linea 5
        this.duration=duration;//linea 6
        this.country=country;//linea 7
        if(language==""){language="null";}else{this.language=language;}//linea 8
        this.director=director;//linea 9
        this.writer=writer;//linea 10
        this.production_company=production_company;//linea 11
        this.actors=actors;
        this.description=description;//linea 12
        this.avg_vote=Integer.parseInt(avg_vote);//linea 13
        this.votes=Integer.parseInt(votes);//linea 14
        if(budget==""){budget="null";}else{this.budget=budget;}//linea 15
        if(usa_gross_income==""){ usa_gross_income="null";}else{this.usa_gross_income=usa_gross_income;}//linea 16
        if(worlwide_gross_income==""){ worlwide_gross_income="null";}else{this.worlwide_gross_income=worlwide_gross_income;}//linea 17
        if(metascore==""){ metascore="null";}else{this.metascore=metascore;}//linea 18
        if(reviews_from_users==""){ reviews_from_users="null";}else{this.reviews_from_users=reviews_from_users;}//linea 19
        if(reviews_from_critics==""){ reviews_from_critics="null";}else{this.reviews_from_critics=reviews_from_critics;}//linea 20
    }

    public Pelicula() {
    }
    
    
    
    //Punto 2 - Sobreescritura de metodo compareTo de interfaz comparable
    @Override
    public int compareTo(Pelicula o) {
        int resultado;
        if(this.avg_vote<o.avg_vote){ resultado = 1; }
        else if(this.avg_vote>o.avg_vote){ resultado = -1; }
        else{ resultado=0; }
        return resultado;
    }
    public static Pelicula[] leerCSV() throws FileNotFoundException, IOException, ParseException {
        FileReader archivo = new FileReader("C:\\Users\\ASUS\\Desktop\\IMDb movies.csv");
        BufferedReader lector = new BufferedReader(archivo);
        String linea;
        int b=0;
        Pelicula[] peliculas= new Pelicula[85855];
        while((linea = lector.readLine()) != null){
            String[] line = linea.split(";");
            peliculas[b] = new Pelicula(line[0],line[1],line[2],line[3],line[4],line[5],line[6],line[7],line[8],line[9],line[10],line[11],line[12],line[13],
                    line[14],line[15],line[16],line[17],line[18],line[19],line[20],line[21]);
            b++;
        }      
        return peliculas;       
    }
    public void Asignar(Pelicula[] peliculas){
        this.peliculas=peliculas;
    }
    public void listarPorRating(){
        Arrays.sort(peliculas);
        System.out.print("ordenado");
    }
    public void imprimir() {
        for (int i = 0; i < peliculas.length; i++) {
            System.out.println(i+peliculas[i].toString());
        }
    }
    
    public void ListarPorComparador(Pelicula[] peliculas, Comparator a){
        List<Pelicula> pelicula= Arrays.asList(peliculas);
        Collections.sort(pelicula, a);
        Iterator it = pelicula.iterator();
        System.out.println("Elements in List : ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
    public void medirTiempoSHELL(Pelicula[] a){
        long inicio, fin, tiempo;
        inicio = System.nanoTime();
        Shell.sort(a);
        fin = System.nanoTime(); 
        tiempo = fin - inicio;
        System.out.println("Tiempo de ejecución de Shell en milisegundos: " + tiempo);
    }
    public void medirTiempoHEAP(Pelicula[] a){
        long inicio, fin, tiempo; 
        inicio = System.nanoTime();
        Heap.sort(a);
        fin = System.nanoTime();
        tiempo = fin - inicio;
        System.out.println("Tiempo de ejecución de Heap en milisegundos: " + tiempo);
    }
    public void medirTiempoQUICK(Pelicula[] a){
        long inicio, fin, tiempo; 
        inicio = System.nanoTime();
        Quick.sort(a);
        fin = System.nanoTime();
        tiempo = fin - inicio; 
        System.out.println("Tiempo de ejecución de Quick en milisegundos: " + tiempo);
    }
    public static double medirTiemporALG(Pelicula[] a, String algoritmo, String comparator){
        
        Comparador comparador= new Comparador(comparator);
        long inicio, fin, tiempo; 
        inicio = System.nanoTime();
        
        if(algoritmo.toUpperCase().equals("INSERTION")){
            Insertion.sort(a,comparador);
        }
        else if(algoritmo.toUpperCase().equals("MERGE")){        
            MergeX.sort(a, comparador);
        }
        else if(algoritmo.toUpperCase().equals("SELECTION")){
        
            Selection.sort(a, comparador);        
        }
        fin = System.nanoTime();
        tiempo = fin - inicio; 
        
        return tiempo;
    }
    
    
    
    public void peliculasMasVotadas(int m) throws IOException, FileNotFoundException, ParseException{
        long inicio, fin, tiempo; 
        inicio = System.nanoTime();
        int i=0;
        Comparador comparadorr=  new Comparador("Calificacion");    
        MinPQ<Pelicula> pq = new MinPQ<Pelicula>(peliculas.length,comparadorr); 
        while (i<peliculas.length) {
            pq.insert(peliculas[i]);
            i++;
        }
        int k=pq.size();
        int f=k-m;
        for(int j=0;j<f;j++){
            pq.delMin();  
        }
        for(int j=0; j<m;j++){
            StdOut.println(pq.delMin());
        }
        fin = System.nanoTime();
        tiempo = fin - inicio; 
        this.tiempo=tiempo;
    }
    


}
