import java.util.InputMismatchException;
import java.util.Scanner;

public class SubstringExtraction {
    public static void main(String[] args) {
            try (Scanner Data = new Scanner(System.in)) {
                System.out.println("Extracción de Subcadena");
                System.out.println("Introduzca una frase, y luego dos numeros para especificar el índice inicial y un índice final");
    
                try {
                    String Phrase = Data.nextLine();
                    int NumberA = Data.nextInt();
                    int NumberB = Data.nextInt();
                    String SubChain = Phrase.substring(NumberA, NumberB);

                 System.out.println("El resultado es: " + SubChain);
    
                } catch (InputMismatchException e) {
                 System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");
    
                 } catch (Exception e) {
                 System.out.println("Error: Ups!");
                }
                System.out.println("¡Gracias! ");
            }}
}
