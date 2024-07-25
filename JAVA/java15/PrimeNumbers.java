import java.util.Scanner;

public class PrimeNumbers {
public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Números primos");
                System.out.println("Ingrese un número que desee verificar");
                
                int Number = Data.nextInt();
                boolean valid = true;
                int i = Number - 1;

                do { 
                    if (Number%i == 0) {
                        valid = false;
                        break;
                    }
                    i--;
                } while (i != 1);

               if (valid) {
                System.out.println("El numero es primo");
               } else {
                System.out.println("El numero no es primo");
               }
            } catch (Exception e) {
                System.out.println("Error: Se a ingresado un dato no valido.");
            }
        }}}
