
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in);) {
            System.out.println("Resta");
            System.out.println("Introdusca los dos numeros a Restar");
            

            try {
                int Number1 = Data.nextInt();
                int Number2 = Data.nextInt();

             double resultado = Number1 - Number2;
             System.out.println("El resultado es: " + resultado);

            } catch (InputMismatchException e) {
             System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");

             } catch (Exception e) {
             System.out.println("Error: Ups!.");
            }
            System.out.println("¡Gracias! ");
        }

}
}