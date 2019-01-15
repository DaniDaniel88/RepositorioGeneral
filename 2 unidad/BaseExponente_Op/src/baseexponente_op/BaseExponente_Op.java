
package baseexponente_op;
import java.util.Scanner;

public class BaseExponente_Op {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int base, exponente, numeros;
        System.out.println("cuanto pares de datos va a ingresar");
        numeros=teclado.nextInt();
        int bases[] = new int[numeros];
        int exponentes[] = new int[numeros];
        for (int inicio=0; inicio<numeros; inicio++){
            System.out.println("ingrese la base");
            base = teclado.nextInt();
            bases[inicio]=base;
            int a=bases.length;
            System.out.println("ingrese el exponente");
            exponente = teclado.nextInt();
            exponentes[inicio]=exponente;
        }
        int tamanio=bases.length-1;
        
        
       // System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);
       MetodRecursiv(bases, exponentes, tamanio, 0);
       
    }
    
    public static void MetodRecursiv(int bases[] , int exponentes[], int m,int n){
            
            if (n<=m){
            int resultado = (int) Math.pow(bases[n], exponentes[n]);
            System.out.println("resultado : "+ resultado);
            
            n++;
            MetodRecursiv(bases,exponentes,m,n);
            }
            //if (m!=-1){}
            //MetodRecursiv(bases,exponentes,m--);
        
        
        
    }
    
}
