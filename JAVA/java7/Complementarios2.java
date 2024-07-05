import java.util.InputMismatchException;
import java.util.Scanner;

public class Complementarios2 {
    public static void main(String[] args) {
            try (Scanner Data = new Scanner(System.in)) {
                System.out.println("Reemplazo de Caracteres");
                System.out.println("Introduzca una frase con espacios en blanco");
    
                try {
                    String Phrase = Data.nextLine();
                    String Remplace = Phrase.trim();

                 System.out.println("El resultado es: " + Remplace);
    
                } catch (InputMismatchException e) {
                 System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");
    
                 } catch (Exception e) {
                 System.out.println("Error: Ups!");
                }
                System.out.println("¡Gracias! ");
            }}
}
