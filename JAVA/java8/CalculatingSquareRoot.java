import java.util.Scanner;

public class CalculatingSquareRoot {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        try {
            System.out.println("Calculando la raíz cuadrada");
            System.out.println("Introdusca un número positivo");
            double Number = Data.nextDouble();
             if (Number > 0) {
                double sqrtNum = (double) Math.sqrt(Number);
                System.out.println("Su raiz es = " + sqrtNum);

             } else {
                System.out.println("Error: Se a colocado un número negativo");

             }
        } catch (Exception e) {
            System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");
        }
    } 
}
}