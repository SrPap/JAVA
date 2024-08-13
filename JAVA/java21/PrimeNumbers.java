import java.util.Scanner;

public class PrimeNumbers {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int Number;

        do {
            System.out.print("Ingrese un número (0 para salir): ");
            Number = sc.nextInt();
            
            if (Number != 0) {
                if (esPrimo(Number)) {
                    System.out.println(Number + " es un número primo.");
                } else {
                    System.out.println(Number + " no es un número primo. Intente nuevamente.");
                }
            }
        } while (Number != 0);

        System.out.println("Programa terminado.");
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; 
        }
        return esPrimoRecursivo(numero, 2);
    }

    private static boolean esPrimoRecursivo(int numero, int divisor) {
        if (divisor > Math.sqrt(numero)) {
            return true;
        }
        if (numero % divisor == 0) {
            return false;
        }
        return esPrimoRecursivo(numero, divisor + 1);
    }
}