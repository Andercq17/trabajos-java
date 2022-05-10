
package taller_4;


public class Diccionario {

    @Override
    public String toString() {
        return "value= "+value + ", key= " + key ;
    }

    public int getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }
 
    private int value;
    private String key;
    public Diccionario(String key,int value) {
        this.value = value;
        this.key = key;
    }
    
    
}
