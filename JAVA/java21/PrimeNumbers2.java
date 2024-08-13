import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimeNumbers2 {
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
            int primeCount = getPrimeCount();
            ArrayList<Integer> primes = generatePrimes(primeCount);
            
            System.out.println("Los primeros " + primeCount + " números primos son: " + primes);
            System.out.println("Números primos en orden inverso: " + reverseList(primes));
        
    }

    // Solicitar la cantidad de números primos que el usuario desea obtener
    public static int getPrimeCount() {
        System.out.print("Ingrese la cantidad de números primos que desea obtener: ");
        return sc.nextInt();
    }

    // Generar la lista de números primos
    public static ArrayList<Integer> generatePrimes(int count) {
        ArrayList<Integer> primeList = new ArrayList<>();
        int currentNumber = 2;

        while (primeList.size() < count) {
            if (isPrime(currentNumber)) {
                primeList.add(currentNumber);
            }
            currentNumber++;
        }

        return primeList;
    }

    // Verificar si un número es primo
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Invertir la lista de números primos
    public static ArrayList<Integer> reverseList(ArrayList<Integer> list) {
        ArrayList<Integer> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }
}