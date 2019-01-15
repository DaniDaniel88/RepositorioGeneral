package examen3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Examen3 {

    public static void main(String[] args) {

        Queue<Integer> cola1 = new LinkedList<>();
        Queue<Integer> cola2 = new LinkedList<>();
        Queue<Integer> cola3 = new LinkedList<>();
        Scanner Sc = new Scanner(System.in);

        System.out.println("INGRESE 5 ELEMENTOS A LA PRIMERA COLA : ");
        for (int i = 0; i < 5; i++) {
            int N;
            System.out.println("INGRESE EL VALOR: ");
            N = Sc.nextInt();
            cola1.add(N);
        }
        //cola2
        System.out.println("\nINGRESE 5 ELEMENTOS A LA SEGUNDA COLA");
        for (int i = 0; i < 5; i++) {
            int n;
            System.out.println("INGRESE EL VALOR: ");
            n = Sc.nextInt();
            cola2.add(n);
        }
        System.out.println("\nINGRESE 5 ELEMENTOS A LA TERCERA COLA");
        for (int i = 0; i < 5; i++) {
            int N;
            System.out.println("INGRESE EL VALOR");
            N = Sc.nextInt();
            cola3.add(N);
        }

        double ss = 0, sd = 0, sf = 0;//estas variables son para poder sacar el promedio
        //cola1
        int a, b, c;
        boolean igual = false;//PARA COMPARAR LA PRIORIDAD 3

        while (cola1.size() != 0) {
            a = cola1.remove();
            b = cola2.remove();
            c = cola3.remove();
            ss = a + ss;
            sd = b + sd;
            sf = c + sf;
            if (a == b || b == c || c == b) {//tercera priridad
                igual = true;//si es verdadero y se cumple los valores si los iniciales son iguales se debe decolar siempre por q1.
            }

        }

        double ll, lk, lj;//guarda los promedios de la p1, p2, p3
        ll = ss / 5;
        lk = sd / 5;
        lj = sf / 5;

        if (igual == true) {
            System.out.println("\nq1");//retorna la prioridad 3
            System.out.println(ll);
        } else {
            if (ll < lk && ll < lj) {
                System.out.println("\nq1");//imprime los que solo so eficientes
                System.out.println(ll);
            }
            if (lk < ll && lk < lj) {
                System.out.println("\nq2");
                System.out.println(lk);
            }
            if (lj < ll && lj < lk) {
                System.out.println("\nq3");
                System.out.println(lj);
            }

        }

    }
}
