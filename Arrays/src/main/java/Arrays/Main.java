
package Arrays;

public class Main {

    public static void main(String[] args) {
       double[] temperaturas = new double [65];
       int a = 0;
       
       for(int i = 0; i<=temperaturas.length;i++){
       temperaturas[i]= i++; }
       
        for(int i=0;i<=temperaturas.length;i++){
       System.out.println("O valor da temperatura de hj, dia " + (i+1) + " é " + temperaturas[i]);
       }
    }
    
}
