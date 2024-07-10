import java.util.Scanner;

public class Integrador1 {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        try {
            System.out.println("Conversión de unidades de temperatura");
            System.out.println("Ingrese la temperatura:");
            int Number = Data.nextInt();
            System.out.println("Ingrese la unidad de medida (C/F):");
            char TemperatureUnit = Data.next().toLowerCase().charAt(0);


            switch (TemperatureUnit) {

                case 'c' -> {
                    int convertionCtoF = (Number * 9 / 5) + 32;
                    System.out.println(Number + " grados Celsius equivale a " + convertionCtoF + " grados Fahrenheit.");
                }
                case 'f' -> {
                    int convertionFtoC = (Number - 32) * 5 / 9;
                    System.out.println(Number + " grados Fahrenheit equivale a " + convertionFtoC + " grados Celsius.");
                }
                default -> {
                    System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");

                }
            }

        } catch (Exception e) {
            System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
        }
    }}}
