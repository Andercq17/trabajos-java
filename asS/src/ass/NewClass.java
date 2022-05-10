
package ass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class NewClass {

    private String linea0, linea1,linea2;
    private String linea3;
    private String linea4,linea5;
    private int linea6;
    private String linea7,linea8,linea9,linea10,linea11,linea12,linea13;
    private int linea14,linea15;
    private String linea16,linea17,linea18,linea19,linea20,linea21;
    
    public NewClass(String linea0,String linea1,String linea2,String linea3,String linea4,String linea5,
            String linea6,String linea7,String linea8,String linea9,String linea10,String linea11,String linea12,
            String linea13,String linea14,String linea15,String linea16,String linea17,String linea18,String linea19,String linea20,String linea21) {
    this.linea0=linea0;
    this.linea1=linea1;
    this.linea2=linea2;
    this.linea3=linea3;
    this.linea4=linea4;
    this.linea5=linea5;
    this.linea6=Integer.parseInt(linea6);
    this.linea7=linea7;
    this.linea8=linea8;
    this.linea9=linea9;
    this.linea10=linea10;
    this.linea11=linea11;
    this.linea12=linea12;
    this.linea13=linea13;
    this.linea14=Integer.parseInt(linea14);
    this.linea15=Integer.parseInt(linea15);
    this.linea16=linea16;
    this.linea17=linea17;
    this.linea18=linea18;
    this.linea19=linea19;
    this.linea20=linea20;
    this.linea21=linea21;
    
    
    }
    
    
    
    
    
    
    public static void leer() throws FileNotFoundException, IOException{
        FileReader archivo = new FileReader("C:\\Users\\ASUS\\Desktop\\IMDb movies.csv");
        BufferedReader lector = new BufferedReader(archivo);
        String linea;
        int b=0;
        NewClass[] peliculas= new NewClass[85855];
        while((linea = lector.readLine()) != null){
            String[] line = linea.split(";");
            peliculas[b] = new NewClass(line[0],line[1],line[2],line[3],line[4],line[5],line[6],line[7],line[8],line[9],line[10],line[11],line[12],line[13],
                    line[14],line[15],line[16],line[17],line[18],line[19],line[20],line[21]);
            b++;
        }
        
    }
    
    
}
