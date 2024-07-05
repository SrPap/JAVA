import java.util.InputMismatchException;
import java.util.Scanner;

public class Complementarios1 {
    public static void main(String[] args) {
            try (Scanner Data = new Scanner(System.in)) {
                System.out.println("Reemplazo de Caracteres");
                System.out.println("Introduzca una frase, y luego dos carácteres");
    
                try {
                    String Phrase = Data.nextLine();
                    char CharacterA = Data.next().charAt(0);
                    char CharacterB = Data.next().charAt(0);
                    String Remplace = Phrase.replace(CharacterA,CharacterB);

                 System.out.println("El resultado es: " + Remplace);
    
                } catch (InputMismatchException e) {
                 System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");
    
                 } catch (Exception e) {
                 System.out.println("Error: Ups!");
                }
                System.out.println("¡Gracias! ");
            }}
}
