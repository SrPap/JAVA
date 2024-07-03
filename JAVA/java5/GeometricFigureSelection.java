import java.util.Scanner;

public class GeometricFigureSelection {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        System.out.println("Opciones para calcular el area");

        System.out.println("1: Círculo");
        System.out.println("2: Cuadrado ");
        System.out.println("3: Triángulo");

        System.out.println("Introdusca un numero del 1 al 3");
        int opcion = Data.nextInt();

        switch (opcion) {
            case 1 -> {System.out.println("Has seleccionado \"Círculo\"");
                       System.out.println("Introdusca el valor del radio");
                       double Radio = Data.nextDouble();

                       double Area = Radio * Radio * 3.14;
                       System.out.println("El area del círculo es = " + Area);

                      }
            case 2 -> {System.out.println("Has seleccionado \"Cuadrado\"");
                       System.out.println("Introdusca el valor del lado");
                       double Lado = Data.nextDouble();

                       double Area = Lado * Lado;
                       System.out.println("El area del cuadrado es = " + Area);

                      }
            case 3 -> {System.out.println("Has seleccionado \"Triángulo\"");
                      System.out.println("Introdusca el valor de la base y la altura");
                      double Base = Data.nextDouble();
                       double Altura = Data.nextDouble();

                       double Area = Base * Altura / 2;
                       System.out.println("El area del triángulo es = " + Area);
                      }
           
            default -> System.out.println("Opción inválida");
            }

    }}
}
