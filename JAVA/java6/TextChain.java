import java.util.InputMismatchException;
import java.util.Scanner;

public class TextChain {
        public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            System.out.println("Conversión de Cadena a Entero");
            System.out.println("Introduzca un número");

            try {
                String Textnumber = Data.nextLine();
             double resultado = Integer.parseInt(Textnumber);
             System.out.println("El resultado es: " + resultado);

            } catch (InputMismatchException e) {
             System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");

             } catch (NumberFormatException e) {
             System.out.println("Error: Ups! No se pudo convertir la cadena de texto en un número entero.");
            }
            System.out.println("¡Gracias! ");
        }}}

