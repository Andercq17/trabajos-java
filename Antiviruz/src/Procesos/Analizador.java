package Procesos;

//Analiza los bytes de un archivo y los compara con la secuencias de los virus, diciendo si dentro del archivo se encuentra el virus o no. 
//John Andersson Cardenas y María José Peña Ruiz.
//16/02/2021
//¿Cuarentena-Time?

import Datos.Virus;


public class Analizador {
    
    private Virus [] listaVirus; //atributo privado de tipo Virus (de Datos.Virus) en forma de lista
    private byte [] contenidoBytes; // atributo privado en forma de vector de bytes, el cual almacena la secuencia de cada uno de los virus.  
    private String estado = "";
    private String a = "";
    
    public Analizador(byte[] contenidoArchivo) { //En el metodo Analizador se encuentra el parametro byte [] contenidoArchivo, el cual recibe el contenido del archivo en bytes. 
        
        
        this.contenidoBytes = contenidoArchivo; //almacena contenido del archivo (en su atributo).
        
        cargarVirus();
    }
    private void cargarVirus (){ //metodo para crear los virus.
   
        
        //crear lista con los distintos virus.
        listaVirus=new Virus [5]; 
        
        Virus usama = new Virus("Usama", new byte[] {32,101,115,99});
        Virus amtrax = new Virus("Amtrax", new byte[] {72,72,15,29});
        Virus ebola = new Virus("éBola", new byte[] {29,32,53,29});
        Virus ah1n1 = new Virus("ah1N1", new byte[] {72,32,32,20});
        Virus covid = new Virus("Covid19", new byte[] {30,25,20,19});
        
        
        listaVirus [0] = usama;
        listaVirus [1] = amtrax;
        listaVirus [2] = ebola;
        listaVirus [3] = ah1n1;
        listaVirus [4] = covid;
    }
    

    
    //analizar
    public void analizar (){ //analiza contenido de archivo (bytes) y busca cada virus en él. 
        for(int i=0; i<contenidoBytes.length; i++) 
        {
            estado = "q0";
            if(contenidoBytes [i] == listaVirus [0].getSecuVirus()[0])
            {
                estado = "q1";
                if(contenidoBytes [i+1] == listaVirus [0].getSecuVirus()[1])
                {
                    estado = "q5";
                    if(contenidoBytes [i+2] == listaVirus [0].getSecuVirus()[2])
                    {
                        estado = "q9";
                        if(contenidoBytes [i+3] == listaVirus [0].getSecuVirus()[3])
                        {
                            a= "¡Se encontró el Virus Usama!";
                            estado = "q14";
                        }
                    }
                }
            }
            if(contenidoBytes [i] == listaVirus [1].getSecuVirus()[0])
            {
                estado = "q2";
                if(contenidoBytes [i+1] == listaVirus [1].getSecuVirus()[1])
                {
                    estado = "q6";
                    if(contenidoBytes [i+2] == listaVirus [1].getSecuVirus()[2])
                    {
                        estado = "q10";
                        if(contenidoBytes [i+3] == listaVirus [1].getSecuVirus()[3])
                        {
                            System.out.println("¡Se encontró el Virus Amtrax!");
                            estado = "q17";
                        }
                    }
                }
            }
            if(contenidoBytes [i] == listaVirus [2].getSecuVirus()[0])
            {
                estado = "q3";
                if(contenidoBytes [i+1] == listaVirus [2].getSecuVirus()[1])
                {
                    estado = "q12";
                    if(contenidoBytes [i+2] == listaVirus [2].getSecuVirus()[2])
                    {
                        estado = "q15";
                        if(contenidoBytes [i+3] == listaVirus [2].getSecuVirus()[3])
                        {
                            System.out.println("¡Se encontró el Virus éBola!");
                            estado = "q19";
                        }
                    }
                }
            }
            if(contenidoBytes [i] == listaVirus [3].getSecuVirus()[0])
            {
                estado = "q2";
                if(contenidoBytes [i+1] == listaVirus [3].getSecuVirus()[1])
                {
                    estado = "q7";
                    if(contenidoBytes [i+2] == listaVirus [3].getSecuVirus()[2])
                    {
                        estado = "q11";
                        if(contenidoBytes [i+3] == listaVirus [3].getSecuVirus()[3])
                        {
                            System.out.println("¡Se encontró el Virus ah1N1!");
                            estado = "q18";
                        }
                    }
                }
            }        
            if(contenidoBytes [i] == listaVirus [4].getSecuVirus()[0])
            {
                estado = "q4";
                if(contenidoBytes [i+1] == listaVirus [4].getSecuVirus()[1])
                {
                    estado = "q8";
                    if(contenidoBytes [i+2] == listaVirus [4].getSecuVirus()[2])
                    {
                        estado = "q16";
                        if(contenidoBytes [i+3] == listaVirus [4].getSecuVirus()[3])
                        {
                            System.out.println("¡Se encontró el Virus Covid 19!");
                            estado = "q13";
                        }
                    }
                }
            }    
        }
    }
    
    public String getEstado () {
        return estado;
    }
}
