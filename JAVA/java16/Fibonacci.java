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
        
        int i = 0;
            System.out.println(dataA);
            System.out.println(dataB);

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
}}
