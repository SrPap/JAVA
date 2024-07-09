import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        try {
            System.out.println("Redondeo de números");
            System.out.println("Introdusca un número decimal");
            double Number = Data.nextDouble();
            int roundNum = (int) Math.round(Number);

            System.out.println("Su valor redondeado es = " + roundNum);

        } catch (Exception e) {
            System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");

        }
    } 
}
}
