import java.util.Random;
import java.util.Scanner;

public class GuessTheWordGame {
    // Lista de palabras predefinidas
    private static final String[] PALABRAS = {"casa", "programacion", "java", "teclado", "pantalla"};
    // Escáner para la entrada del usuario
    private static final Scanner scanner = new Scanner(System.in);
    // Número de intentos permitidos
    private static final int INTENTOS_MAXIMOS = 6;

    public static void main(String[] args) {
        // Seleccionar una palabra aleatoria de la lista
        String palabraSeleccionada = seleccionarPalabraAleatoria(PALABRAS);
        // Generar la pista inicial con guiones bajos
        char[] pista = generarPista(palabraSeleccionada.length());

        System.out.println("¡Bienvenido al juego de adivinar la palabra!");
        System.out.println("Tienes " + INTENTOS_MAXIMOS + " intentos para adivinar la palabra.");
        System.out.println("Pista: " + String.valueOf(pista));

        // Iniciar el bucle de juego
        jugar(palabraSeleccionada, pista, INTENTOS_MAXIMOS);
    }

    // Método para seleccionar una palabra aleatoria de la lista
    public static String seleccionarPalabraAleatoria(String[] palabras) {
        Random random = new Random();
        return palabras[random.nextInt(palabras.length)];
    }

    // Método para generar una pista con guiones bajos según la longitud de la palabra
    public static char[] generarPista(int longitud) {
        char[] pista = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            pista[i] = '_';
        }
        return pista;
    }

    // Método para realizar el bucle de juego, recursivo
    public static void jugar(String palabraSeleccionada, char[] pista, int intentosRestantes) {
        // Verificar si el jugador ha agotado los intentos o adivinado la palabra
        if (intentosRestantes > 0 && String.valueOf(pista).contains("_")) {
            System.out.print("\nIngresa una letra: ");
            char letra = scanner.nextLine().toLowerCase().charAt(0);

            // Comprobar si la letra está en la palabra y actualizar la pista
            if (comprobarLetra(palabraSeleccionada, letra, pista)) {
                System.out.println("¡Correcto! " + String.valueOf(pista));
            } else {
                intentosRestantes--;
                System.out.println("Letra incorrecta. Te quedan " + intentosRestantes + " intentos.");
            }

            // Llamada recursiva para continuar el juego
            jugar(palabraSeleccionada, pista, intentosRestantes);
        } else {
            // Mostrar el resultado final del juego
            mostrarResultadoFinal(palabraSeleccionada, pista, intentosRestantes);
        }
    }

    // Método para comprobar si la letra está en la palabra y en qué posiciones
    public static boolean comprobarLetra(String palabra, char letra, char[] pista) {
        boolean acierto = false;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                pista[i] = letra;
                acierto = true;
            }
        }
        return acierto;
    }

    // Método para mostrar el resultado final del juego
    public static void mostrarResultadoFinal(String palabraSeleccionada, char[] pista, int intentosRestantes) {
        if (String.valueOf(pista).equals(palabraSeleccionada)) {
            System.out.println("¡Felicidades! Adivinaste la palabra: " + palabraSeleccionada);
        } else {
            System.out.println("Se te acabaron los intentos. La palabra era: " + palabraSeleccionada);
        }
    }
}