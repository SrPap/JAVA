import java.util.Scanner;

public class GradeConversion {
     public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        System.out.println("Introdusca su calificación");
        String opcion = Data.nextLine();

        switch (opcion) {
            case "F" -> System.out.println("Muy deficiente");
            case "D" -> System.out.println("Deficiente");
            case "C" -> System.out.println("Suficiente");
            case "B" -> System.out.println("Notable");
            case "A" -> System.out.println("Sobresaliente");
            default -> System.out.println("Opción inválida");
            }

    }}
}
