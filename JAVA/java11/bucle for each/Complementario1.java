import java.util.Scanner;

public class Complementario1 {
    public static void main(String[] args) {

        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Contar ocurrencias");

            System.out.println("El programa realizara una busqueda de caracteres del siguiente texto");
            System.out.println("aprendiendo java y practicando con ejercicios");
    
            String frase = "aprendiendo java y practicando con ejercicios";
            
            char[] array = new char[50];
            int i = 0;
            for (int Char : array) {
                if (i < frase.length()) {
                    array[i] = frase.charAt(i);
                } else {
                    array[i] = ' '; 
                }
                i++;
            }

            System.out.print("Ingrese un carácter objetivo: ");
            char objetivo = scanner.next().charAt(0);
            
            int contador = 0;
            for (char c : array) {
                if (c == objetivo) {
                    contador++;
                }
            }
            
            if (contador > 0) {
                System.out.println("El carácter \"" + objetivo + "\" aparece " + contador + " veces.");
            } else {
                System.out.println("El carácter \"" + objetivo + "\" no aparece en la frase.");
            }
        }
    }
}
