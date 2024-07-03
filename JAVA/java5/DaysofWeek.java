import java.util.Scanner;

public class DaysofWeek {
     public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        System.out.println("Introdusca un numero del 1 al 7");
        int opcion = Data.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Opción inválida");
            }

    }}
}
