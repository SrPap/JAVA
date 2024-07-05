
import java.util.InputMismatchException;
import java.util.Scanner;

public class ChainLength{

    public static void main(String[] args) {
            try (Scanner Data = new Scanner(System.in)) {
                System.out.println("Longitud de Cadena");
                System.out.println("Introduzca un texto");
    
                try {
                    String Text = Data.nextLine();
                 System.out.println("El resultado es: " + Text.length());
    
                } catch (InputMismatchException e) {
                 System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");
    
                 } catch (Exception e) {
                 System.out.println("Error: Ups!");
                }
                System.out.println("¡Gracias! ");
            }}
}