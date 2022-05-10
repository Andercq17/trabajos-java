
package archivoz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class lector {
    
    private byte[] contenidobytes;
    private File archivo;
    
     public lector(File archivo) {
        
        this.archivo = archivo;
    }
    
    public void leer() throws IOException{
            contenidobytes= Files.readAllBytes(archivo.toPath());
}
    public byte[] Bytes_Archivo(){
    return contenidobytes;
}
    
}
