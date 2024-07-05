import java.util.InputMismatchException;
import java.util.Scanner;

public class Complementarios3 {
    public static void main(String[] args) {
            try (Scanner Data = new Scanner(System.in)) {
                System.out.println("Comparación de Cadenas");
                System.out.println("Introduzca dos frases para comparar");
    
                try {
                    String PhraseA = Data.nextLine();
                    String PhraseB = Data.nextLine();

                    boolean Equal = PhraseA.equals(PhraseB);
                    if (Equal) {
                        System.out.println("Las palabras son iguales");

                    } else {
                        System.out.println("Las palabras son diferentes");

                    }

    
                } catch (InputMismatchException e) {
                 System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");
    
                 } catch (Exception e) {
                 System.out.println("Error: Ups!");
                }
                System.out.println("¡Gracias! ");
            }}
}
