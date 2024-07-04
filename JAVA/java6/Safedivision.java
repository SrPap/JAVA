import java.util.Scanner;

public class Safedivision {
    public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            System.out.println("Division");
            System.out.println("Introdusca los dos numeros a dividir");
            int Number1 = Data.nextInt();
            int Number2 = Data.nextInt();

            try {
                double resultado = Number1/Number2;
                System.out.println("El resultado es: " + resultado);
            } catch (Exception e) {
                System.out.println("Error: No es posible dividir por 0.");
            }
            System.out.println("¡Gracias! ");
        }
    }}