
package seriepar_impar;

import java.util.Scanner;


public class SeriePar_Impar {

    public static void main(String[] args) {
        Scanner tecla = new Scanner (System.in);
        int n;
        System.out.println("favor de ingresar la cantidad de terminos a generar: ");
        n=tecla.nextInt();
        SeriePares(1,n);
        
        
    }
    public static void SeriePares(int i, int n){
        
        if (n>0){
            System.out.print(i*2-1+",");
            SeriePares(i+1,n-1);
            
        }
    }
    
}
