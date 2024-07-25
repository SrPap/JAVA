import java.util.Scanner;

public class Complementarios3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[4];
            
            for (int i = 0; i < 4; i++) {
                int numero;
                do {
                    System.out.print("Ingrese un número entre 1 y 20 para la posición " + (i + 1) + ": ");
                    numero = scanner.nextInt();
                    if (numero < 1 || numero > 20) {
                        System.out.println("Número fuera de rango. Por favor, ingrese un número entre 1 y 20.");
                    }
                } while (numero < 1 || numero > 20);
                numeros[i] = numero;
            }
            
            System.out.println("\nGráfico de barras:");
            for (int numero : numeros) {
                for (int j = 0; j < numero; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
}}}