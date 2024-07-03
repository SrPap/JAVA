import java.util.Scanner;

public class Complementario2 {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        System.out.println("Opciones");

        System.out.println("1: Círculo");
        System.out.println("2: Rectangulo ");

        System.out.println("Introdusca un numero del 1 al 2");
        int opcion = Data.nextInt();

        switch (opcion) {
            case 1 -> {System.out.println("Has seleccionado \"Círculo\"");
                       System.out.println("Introdusca el valor del radio");
                       double Radio = Data.nextDouble();

                       

                       System.out.println("Quiere calcular el área o el perímetro?");
                      System.out.println("1: Area");
                      System.out.println("2: Perímetro");

                      int opcion2 = Data.nextInt();
                      switch (opcion2) {
                        case 1 -> {
                            double Area = Radio * Radio * 3.14;
                            System.out.println("El area del círculo es = " + Area);
                                }
                        case 2 -> {
                            double Area = Radio * 3.14;
                            System.out.println("El perímetro del círculo es = " + Area);
                                }
                    default -> System.out.println("Opción inválida");
                            }
                      }
            case 2 -> {System.out.println("Has seleccionado \"Rectangulo\"");
                      System.out.println("Introdusca el valor de la base y la altura");
                      double Base = Data.nextDouble();
                      double Altura = Data.nextDouble();

                      System.out.println("Quiere calcular el área o el perímetro?");
                      System.out.println("1: Area");
                      System.out.println("2: Perímetro");

                      int opcion2 = Data.nextInt();
                      switch (opcion2) {
                        case 1 -> {
                            double Area = Base * Altura;
                            System.out.println("El area del rectangulo es = " + Area);
                                }
                        case 2 -> {
                            double Area = Base * 2 + Altura *2;
                            System.out.println("El perímetro del rectangulo es = " + Area);
                                }
                    default -> System.out.println("Opción inválida");
                    }
            }
           
           
            default -> System.out.println("Opción inválida");
            }

    }}
}

