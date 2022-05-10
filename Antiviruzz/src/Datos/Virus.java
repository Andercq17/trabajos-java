
package Datos;

//Crea atributos para los nombres y secuencias de cada uno de los virus, y crea una instancia para cada uno de ellos. 
//John Andersson Cardenas y María José Peña Ruiz.
//16/02/2021
//¿Cuarentena-Time?

public class Virus {
    private String nomVirus; //atributo privado de tipo String (nombre de Virus)
    private byte [] secuVirus; //atributo privado en forma de vector de bytes (secuencia de Virus)
    
    public Virus(String nomVirus, byte[] secuVirus){ //En el metodo Virus, se encuentran los parametros String nomVirus, el cuál menciona el nombre del Virus, y byte [] secuVirus, el cual menciona la secuencia del respectivo Virus. 
        //instancia para cada uno de los virus.
        this.nomVirus = nomVirus; //almacena nombre de virus (en su atributo).
        this.secuVirus = secuVirus; //almacena secuencia de virus (en su atributo). 
    }

    public byte[] getSecuVirus() { //permitir acceder a atributos privados. 
        return secuVirus; //devuelve secuencia de virus. 
    }
    
    
}
