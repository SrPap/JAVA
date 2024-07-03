import java.util.Scanner;

public class Complementario1 {
         public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        System.out.println("Opciones");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miercoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.println("6. Sabado");
        System.out.println("7. Domingo");
        System.out.println("Introdusca un numero del 1 al 7");
        int opcion = Data.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Lunes: es un dia habil");
            case 2 -> System.out.println("Martes: es un dia habil");
            case 3 -> System.out.println("Miercoles: es un dia habil");
            case 4 -> System.out.println("Jueves: es un dia habil");
            case 5 -> System.out.println("Viernes: es un dia habil");
            case 6 -> System.out.println("Sabado: no es un dia habil");
            case 7 -> System.out.println("Domingo: no es un dia habil");
            default -> System.out.println("Opción inválida");
            }

    }}
}
