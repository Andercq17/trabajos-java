package Procesos;

//lee el contenido de un archivo dado y lo devuelve en bytes. 
//John Andersson Cardenas y María José Peña Ruiz.
//16/02/2021
//¿Cuarentena-Time?

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author data
 */
public class Archivos {
    
    private File archivo; //atributo, que recibe un archivo en forma de File.  
    private byte [] contenidoArchivo; //atributo privado en forma de vector de byte, que entrega el contenido del archivo dado en bytes.
  
    
    
    
    public Archivos(File archivo) { //metodo con parametro File archivo, el cual recibe el archivo y lo almacena. 
        
        this.archivo = archivo;
    }
    

    // Obtener los bytes del archivo 
    public void leerArchivo () throws IOException { //lee contenido de archivo en bytes.
    
        contenidoArchivo = Files.readAllBytes (archivo.toPath()); //lee todos los bytes del archivo (con cualquier dirección) y lo amacena en una variable.
     
    } 

    public byte[] getContenidoArchivo() { //
        return contenidoArchivo;
    }
    
    
    
    
    
    
    
}
