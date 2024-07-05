import java.util.InputMismatchException;
import java.util.Scanner;

public class Complementarios4 {
    public static void main(String[] args) {
            try (Scanner Data = new Scanner(System.in)) {
                System.out.println("Calculando la Longitud de Cadenas sin Espacios");
                System.out.println("Introduzca una frase");
    
                try {
                    String PhraseA = Data.nextLine();

                    String Remplace = PhraseA.replaceAll(" ","");

                    System.out.println("La frase " + Remplace + " ocupa " + Remplace.length() + " espacios (sin tomar en cuenta los espacios en blanco)");


                } catch (InputMismatchException e) {
                 System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");
    
                 } catch (Exception e) {
                 System.out.println("Error: Ups!");
                }
                System.out.println("¡Gracias! ");
            }}
}
