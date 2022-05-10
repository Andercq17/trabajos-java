
package tallerr;

import java.util.Arrays;

public class Matriz {

    @Override
    public String toString() {
        return "Matriz de tamaño "+N+" con dimensiones m: "+m+" * "+n ;
    }

    @Override
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
    public int[][] getMat() {
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
    private int N=m*n;
    private int[][] mat= new int[m][n];
    private int[][] aux;

    public Matriz(int filas, int columnas) {
        m=filas;
        n=columnas;
        int [][] a= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] =(int)(Math.random()*(5-1+1)+1);

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
            aux= new int[m][n];
            int[][] otro= auxx.getMat();
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
            aux= new int[m][n];
            int[][] otro= auxx.getMat();
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
            aux= new int[m][c];
            int[][] otro= auxx.getMat();
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
    //segun el hashcode de mi id me toca hacer algoritmo 0
    public void EliminacionGaussiana(){
        
        if(m==n){
            System.out.println("Matriz cuadrada");
        }else{
            int l=0;
            for(int i=0;i<m-1;i++){
                for(int j=i+1;j<m;j++){
                    l=mat[j][i]/mat[i][i];
                    for(int k=i;k<m+1;k++){
                        mat[j][k]=mat[j][k]-l*mat[i][k];
                    }
                }
            }
            double suma;
            double[] x= new double[m];
            for(int i=m-1;i>=0;i--){
                suma=0;
                for(int j=i+1;j<m;j++){
                    suma=suma+mat[i][j]*x[j];
                }
                x[i]=(mat[i][m]-suma)/mat[i][i];
            }
        //mostrar matriz
        System.out.println("matriz gaussiana");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(aux[i][j]+"\t");
                }
                System.out.println();
            }
        }
        
        
        
    }
    public double[][] getSubmatriz(double[][] matriz, int filas, int columnas, int columna) {
		double [][] submatriz = new double[filas-1][columnas-1];
		int contador=0;
		for (int j=0;j<columnas;j++)
		{
			if (j==columna) continue;
			for (int i=1;i<filas;i++){
				submatriz[i-1][contador]=matriz[i][j];
                        }
                        contador++;
		}
		return submatriz;
	}
    public double Determinante(){
        double determinante = 0.0;
		int filas = mat.length;
		int columnas = mat[0].length;
		
		// Si la matriz es 1x1, el determinante es el elemento de la matriz
		if ((filas==1) && (columnas==1))
			return mat[0][0];
		int signo=1;
		for (int columna=0;columna<columnas;columna++)
		{
			// Obtiene el adjunto de fila=0, columna=columna, pero sin el signo.
			double[][] submatriz = getSubmatriz(mat, filas, columnas, columna);
			determinante = determinante + signo*mat[0][columna]*determinante(submatriz);
			signo*=-1;
		}
		
		return determinante;
    
    
    
    
    }
    
    
    
    public void EliminacionGaussiana_dos(){
            
            int n = m;
            int l = n;
            if(n!=l){
                System.out.println("A no es una matriz cuadrada.");
            }else{
            	double p = 0;
                double [][]matriz=new double[n][n];
            	for(int k=0;k<n-1;k++){                
                    for(int i=k+1;i<n;i++){
                        p = mat[i][k] / mat[k][k];
                        for(int j=k;j<n+1;j++){
                            matriz[i][j] = mat[i][j] - p*mat[k][j];
                        }
                    } 
            	}            
            	double suma;
            	double[] x = new double[n];
            	for(int i=n-1;i>=0;i--){
                	suma=0;
                	for(int j=i+1;j<n;j++){
                    		suma = suma + mat[i][j]*x[j];
                	}
                	x[i] = (mat[i][n] - suma)/mat[i][i];
            	}
                //mostrar matriz
                System.out.println("matriz gaussiana");
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        System.out.print(matriz[i][j]+"\t");
                    }
                    System.out.println();
                }
            }
    } 
    
    public void Gauus(){
        if(m==n){
            System.out.println("matriz cuadrada");
        }else{
        /*    if(mat[0][0]!=1){
                int h=0;
                while(h==0){
                    for(int i=0;i<m;i++){
                        if(mat[i][0]==1){
                            for(int j=0;j<m;j++){
                                int[] a= new int[m+1];
                                a[j]=mat[0][j];
                                mat[0][j]=mat[i][j];
                                mat[i][j]=a[j];
                            }
                            h=1;
                        }
                        
                    }
                
                
                }
                
                
                
            }*/  
        for(int i=1;i<=m;i++){
                    for(int j=0;j<n;j++){
                        for(int k=0;k<n;k++){
                            mat[i][k]= mat[i][k]-1*mat[i][j];
                        }
                    }
                }
            /*if(mat[0][0]==1){
                for(int i=1;i<=m;i++){
                    for(int j=0;j<m-1;j++){
                        for(int k=0;k<m-1;k++){
                            mat[i][k]=mat[i][k]-1*mat[i][j];
                        }
                    }
                }
            }
            */
            
            System.out.println("matriz gaussiana");
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        System.out.print(mat[i][j]+"\t");
                    }
                    System.out.println();
                }
            
            
            
            
            
            
            
            
            
            
        }
    
    
    
    }
        
        
        
        
    }    
       
    
       

