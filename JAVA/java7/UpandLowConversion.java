import java.util.InputMismatchException;
import java.util.Scanner;

public class UpandLowConversion {
    public static void main(String[] args) {
        try {
            try (Scanner Data = new Scanner(System.in)) {
                System.out.print("Por favor, ingrese una cadena de texto: ");
                String Phrase = Data.nextLine();
                
                String lettersUp = Phrase.toUpperCase();
                String lettersLow = Phrase.toLowerCase();
                
                System.out.println("Cadena en mayúsculas: " + lettersUp);
                System.out.println("Cadena en minúsculas: " + lettersLow);
            }
            
                } catch (InputMismatchException e) {
                 System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");
    
                 } catch (Exception e) {
                 System.out.println("Error: Ups!");
                }
                System.out.println("¡Gracias! ");
    }
}
