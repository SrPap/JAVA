import java.util.Scanner;

public class OptionSelection {
         public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        System.out.println("Opciones");

        System.out.println("1: Guardar");
        System.out.println("2: Cargar");
        System.out.println("3: Salir");

        System.out.println("Introdusca un numero del 1 al 3");
        int opcion = Data.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Has seleccionado \"Guardar\"");
            case 2 -> System.out.println("Has seleccionado \"Cargar\"");
            case 3 -> System.out.println("Has seleccionado \"Salir\"");
           
            default -> System.out.println("Opción inválida");
            }

    }}
}
