import java.util.InputMismatchException;
import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {
            try (Scanner Data = new Scanner(System.in)) {
                try {
                    System.out.println("Búsqueda de Caracteres");
                    System.out.println("Introduzca una palabra y el carácter a buscar");
                    String Word = Data.nextLine();
                    char Character = Data.next().charAt(0);
                    int SubChain = Word.indexOf(Character);
                    if (SubChain != -1) {
                        System.out.println("El carácter '" + Character + "' se encuentra en la palabra '" + Word + "' en la posición " + SubChain + ".");
                    } else {
                        System.out.println("El carácter '" + Character + "' no se encuentra en la palabra '" + Word + "'.");
                    }
            

    
                } catch (InputMismatchException e) {
                 System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");
    
                 } catch (Exception e) {
                 System.out.println("Error: Ups!");
                }
                System.out.println("¡Gracias! ");
            }}
}
