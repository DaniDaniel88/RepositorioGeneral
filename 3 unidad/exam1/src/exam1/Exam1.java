
package exam1;
import java.util.LinkedList;//libreria para combinar con cola
import java.util.Stack;//libreria para pila
import java.util.Queue;//libreria para cola
import java.util.Scanner;
public class Exam1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dato, dato2;
        int d1=0,d2=1;
        
        Stack  pilaEntrada = new Stack<>();
        Stack  pilaSalida = new Stack<>();
        int i,j, finalt;//valores de entrada
        String si;
      
        System.out.println("Ingrese la cantidad de conjuntos 'pares' a ingresar");
        finalt = entrada.nextInt();
        for (int inicio = 1; inicio<=finalt; inicio++){
            System.out.println("ingrese el valor de i:");
            i=entrada.nextInt(); 
            pilaEntrada.add(i);
            System.out.println("ingrese el valor de j:");
            j=entrada.nextInt();
            pilaEntrada.add(j);
        }
        
        System.out.println("pila de entrada");
        System.out.println(pilaEntrada);
        

        while (!pilaEntrada.empty())
        {
            
            dato =  (int) pilaEntrada.pop();//saca un dato de la pila y lo guarda en dato
            dato2 = (int) pilaEntrada.pop();
            
            if ((dato-dato2)==1)//magia//
            {
                pilaSalida.push("("+dato2+","+dato+")");
                //pilaSalida.push(dato);
                
            }
            
           
            
        }
        System.out.println("pila de salida");
        System.out.println(pilaSalida);//imprime toda la cola de salida
        
        
    }
    
}
