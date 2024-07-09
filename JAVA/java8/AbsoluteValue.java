import java.util.Scanner;

public class AbsoluteValue {
     public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        try {
            System.out.println("Calculando el valor absoluto");
            System.out.println("Introdusca un número entero");
            int Number = Data.nextInt();
            int absNum = Math.abs(Number);

            System.out.println("Su valor absoluto es = " + absNum);

        } catch (Exception e) {
            System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");

        }
    } 
}
}
