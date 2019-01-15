
package exam2;
import java.util.ArrayList;
import java.util.LinkedList;//libreria para combinar con cola
import java.util.List;
import java.util.Stack;//libreria para pila
import java.util.Queue;//libreria para cola
import java.util.Scanner;
public class Exam2 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        int dato;//auxiliar de pila
        String name;//auxiliar de cola
        
        Stack<Integer> pila = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();
        Queue<String> cola = new LinkedList<>();
        Queue<String> cola2Help = new LinkedList<>();
        List<lista> ListaU = new ArrayList<lista>();
        
         
        int dat, finalt; String inicial;
        String si;
        
        System.out.println("ingrese la cantidad de regalos (N) de cada niño");
        finalt = entrada.nextInt();
        for (int inicio = 1; inicio<=finalt; inicio++){
            System.out.println("ingrese el numero del regalo (valor)");
            dat=entrada.nextInt();
            pila.push(dat);
        }
        
        
        System.out.println("pila de entrada o regalos");
        System.out.println(pila);//imprime toda la pila de entrada antes de desapilar
        
        
        
        System.out.println("ingrese la cantidad de niños");
        finalt = entrada.nextInt();
        for (int inicio = 1; inicio<=finalt; inicio++){
            System.out.println("ingrese la inicial de cada nombre de niño (letra)");
            inicial=entrada.next();
            cola.add(inicial);
        }
        
        System.out.println("cola de nombres");
        System.out.println(cola);//imprime toda la pila de entrada antes de desapilar
        
        
        while (!pila.empty() && !cola.isEmpty())
        {
            //pila de numeros , cola de niños
            
            //pila son regalos , cola son niños
            if (pila.size()<cola.size())//magia//
            {
                dato = pila.pop();//saca un dato de la pila y lo guarda en dato
                pila2.push(dato);
                name= cola.poll();
                cola2Help.add(name);
                
                ListaU.add(new lista(dato, name));
                
            }
            //e-12, t-11, u-9,                   e-7, t-2
            if (pila.size()>cola.size())//magia//
            {
                dato = pila.pop();//saca un dato de la pila y lo guarda en dato
                pila2.push(dato);
                name= cola.poll();
                
                cola2Help.add(name);
                
               // System.out.println("pila tamanio = "+pila.size()+ "cola tamanio = "+cola.size() );
               // System.out.println("pila2 tamanio = "+pila2.size()+ "cola2 tamanio = "+cola2Help.size() );
               // System.out.println("pila: " + dato);
                ListaU.add(new lista(dato, name));
                
                if (pila.size()<=cola2Help.size() || cola.size()==0){
                while (pila.size()!=0){
                    
                    dato = pila.pop();
                   
                    name = cola2Help.poll();
                    
                    ListaU.add(new lista(dato, name));
                    
                    
                }
                
                }    
                  
                
            }
            
            
            
        } 
        
        
        System.out.println("Lista de regalos con id");
        System.out.println("-----------------------------------");
        for (int i = 0; i <= ListaU.size() - 1; i++) {
            System.out.println(ListaU.get(i).Regalo + " - " + ListaU.get(i).ID);
        }
        
        
    }
    
}
