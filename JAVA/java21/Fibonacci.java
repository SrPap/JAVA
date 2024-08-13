import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
        System.out.println("Cálculo de Fibonacci");

        System.out.println("Ingrese el primer número de la serie");
        int dataA = Data.nextInt();
        System.out.println("Ingrese el segundo número de la serie");
        int dataB = Data.nextInt();
        System.out.println("Ingrese un número para colocar el limite de la serie");
        int length = Data.nextInt(); 

        System.out.println("Los primeros " + length + " términos de la serie de Fibonacci son:");
        
            System.out.println(dataA);
            System.out.println(dataB);
            Fibonacci1(length,dataA,dataB);
            System.out.println();
            System.out.println("Reversivo");
            Fibonacci2(length,dataA,dataB);
    }
}

public static void Fibonacci1(int length, int dataA, int dataB) {
    int i = 0;
    while (i < length) {
        if (i <= 1) {
            System.out.print(""); 
        } else {
            int next = dataA + dataB; 
            System.out.println(next);
            dataA = dataB; 
            dataB = next; 
        }
        i++;
    }
}

public static void Fibonacci2(int length, int dataA, int dataB) {
        ArrayList<Integer> fibonacciSeries = new ArrayList<>();

        fibonacciSeries.add(dataA);
        fibonacciSeries.add(dataB);

        for (int i = 2; i < length; i++) {
            int next = fibonacciSeries.get(i - 2) + fibonacciSeries.get(i - 1);
            fibonacciSeries.add(next);
        }

        for (int i = fibonacciSeries.size() - 1; i >= 0; i--) {
            System.out.println(fibonacciSeries.get(i));
        }
}
}
