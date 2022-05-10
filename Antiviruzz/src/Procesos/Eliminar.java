/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import java.io.File;

/**
 *
 * @author ASUS
 */
public class Eliminar {
    
    private File ficheros;
    private File [] fiches;
    
     public Eliminar(File ficheros) { 
        
        this.ficheros = ficheros;
    }
     
    public File[] AgarrarLista(){
        fiches= ficheros.listFiles();
        return fiches;
    
    }

    public File getficheros(){
    
    
    return this.ficheros;
    
    }
    
    public void Borrar(){
        ficheros.delete();
    
    }
     
     
}
