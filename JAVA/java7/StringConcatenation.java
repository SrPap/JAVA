import java.util.InputMismatchException;
import java.util.Scanner;

public class StringConcatenation {
     public static void main(String[] args) {
            try (Scanner Data = new Scanner(System.in)) {
                System.out.println("Concatenación de Cadenas");
                System.out.println("Introduzca su nombre y luego su apellido");
    
                try {
                    String Name = Data.nextLine();
                    String LastName = Data.nextLine();

                 System.out.println("El resultado es: " + Name.concat(" " +LastName));
    
                } catch (InputMismatchException e) {
                 System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");
    
                 } catch (Exception e) {
                 System.out.println("Error: Ups!");
                }
                System.out.println("¡Gracias! ");
            }}
}
