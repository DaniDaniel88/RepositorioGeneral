
package sumanum_recursividad;
import java.util.Scanner;

public class SumaNum_Recursividad {

   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();
        
        System.out.printf("La suma de los dígitos del número  es ");
        
        
        
        if (((sumaDigitos(numero))*-1)>0){
            System.out.println((sumaDigitos(numero))*-1);
        }else if (((sumaDigitos(numero))*-1)<0){
            System.out.println(sumaDigitos(numero));
        }
        
    }
    
    
    private static int sumaDigitos(int num){
        if(num==0){
            return 0;
        } else {
            
            return sumaDigitos(num/10) + num%10;
        }
    }
    
    
    
    
}
