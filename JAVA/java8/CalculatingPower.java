import java.util.Scanner;

public class CalculatingPower {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        try {
            System.out.println("Calculando la potencia");
            System.out.println("Introdusca dos números enteros para la base y el exponente");
            int base = Data.nextInt();
            int exponent = Data.nextInt();

            int powNum = (int) Math.pow(base,exponent);

            System.out.println("Su potencia es = " + powNum);

        } catch (Exception e) {
            System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");

        }
    } 
}
}