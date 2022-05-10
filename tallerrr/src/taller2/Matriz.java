
package taller2;

public class Matriz {
    
    @Override
    public String toString() {
        return "Matriz de tamaño "+N+" con dimensiones m: "+m+" * "+n ;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Matriz other = (Matriz) obj;
        if (this.m != other.m) {
            return false;
        }
        if (this.n != other.n) {
            return false;
        }
        if (this.N != other.N) {
            return false;
        }
        return true;
    }
    public int hasIDs(String id_1){
        return id_1.hashCode()%5;
    }
    public double[][] getMat() {
        return mat;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }
    private int m;
    private int n;
    private double N=m*n;
    private double[][] mat= new double[m][n];
    private double[][] aux;

    public Matriz(int filas, int columnas) {
        m=filas;
        n=columnas;
        double [][] a= new double[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] =(int)(Math.random()*(10-1+1)+1);
            }
        }
        mat=a;
    }
    public void Mostrar_datos(){
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public void Sumar(Matriz auxx){
        
        if(this.equals(auxx)==true){
            aux= new double[m][n];
            double[][] otro= auxx.getMat();
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    aux[i][j] = mat[i][j]+otro[i][j];
                }
            }
            System.out.println("Matriz resultante de la suma");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(aux[i][j]+"\t");
                }
                System.out.println();
            }
        }else{
            System.out.println("No se pueden sumar porque no son de igual tamaño");
        }
    }

    
    public void producto(Matriz auxx){
        int a= auxx.getM();
        int c= auxx.getN();
        if(this.equals(auxx)==true){
            aux= new double[m][n];
            double[][] otro= auxx.getMat();
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    aux[i][j] = mat[i][j]*otro[i][j];
                }
            }
            System.out.println("Matriz producto");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(aux[i][j]+"\t");
                }
                System.out.println();
            }
        }else if(n==a){
            aux= new double[m][c];
            double[][] otro= auxx.getMat();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < c; j++) {
                    for (int h = 0; h < n; h++) {
                        aux[i][j] += mat[i][h] * otro[h][j];
                    }
                }
            }
            System.out.println("Matriz producto");
            for(int i=0;i<m;i++){
                for(int j=0;j<c;j++){
                    System.out.print(aux[i][j]+"\t");
                }
                System.out.println();
            }
        }else{
            System.out.println("No se pueden multiplicar porque no son de igual tamaño");
        }
    }
    
    //intento de determinante (no terminado)
     /*
     private void cofactor(double[][] matriz, double tmp[][], int p, int q,int n) {
        int i=0, j=0;   
    	for (int fila=0;fila<n;fila++){
            for (int columna = 0; columna < n;columna++){
                if(fila!=p&&columna!=1){
                    tmp[i][j++]=matriz[fila][columna];
                    if(j==n - 1){
                        j=0;
                        i++;
                    }
                }
            }
        }
     } 
    public double Determinante(double[][] matr, int n){
                double determinante = 0.0;
		int filas = matr.length;
		int columnas = matr[0].length;
		if ((filas==1) && (columnas==1)){
			return matr[0][0];
                }
		double tmp[][]=new double[n][n];
                int multiplicador=1;
		for (int f=0;f<m;f++)
		{
                    cofactor(matr,tmp, 0, f,n);
                    determinante+=multiplicador * matr[0][f] * Determinante(tmp, n-1);
                    multiplicador+=multiplicador;
                }
		return determinante;
    }*/
   public void Potencia(int a){
        long inicio, fin, tiempo; //Variables para determinar el tiempo de ejecución
        inicio = System.nanoTime(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
  
        //codigo
        if(m!=n){
            System.out.println("La matriz no es cuadrada");
        }else if(a>0){    
            double[][]auxx= new double[m][m];
            double[][] vacio= new double[m][m];
            aux= new double[m][n];
            
                auxx=mat;
                for(int h=0;h<a-1;h++){
                    for(int i=0;i<m;i++){
                        for(int j=0;j<n;j++){
                            for(int k=0;k<m;k++){
                                aux[i][j] += auxx[i][k]*mat[k][j];
                            }
                        }
                    }
                    auxx=aux;
                    aux=vacio;
                }
                fin = System.nanoTime(); //Hora en que finalizó el algoritmo y la almacenamos en la variable fin
                tiempo = fin - inicio; //Calculamos los milisegundos de diferencia
 
                //impresión matriz
                System.out.println("Matriz potencia");
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        System.out.print(auxx[i][j]+"\t");
                    }
                    System.out.println();
                }
                
                System.out.println("Tiempo de ejecución en milisegundos: " + tiempo); //Mostramos en pantalla el tiempo de ejecución en milisegundos
        }else if(a<0){
            System.out.println("numero no natural");
        }
   }
   
   /*public static void main(String[] args) {
       Matriz matriz = new Matriz(6,6);
       matriz.Mostrar_datos();
       matriz.Potencia(2);
        
   }*/
}

