import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Suma de números");

                System.out.print("Ingrese una número entero = ");
                String TextNumber = Data.next();

                System.out.print("Ingrese un decimal = ");
                String TextDouble = Data.next();

                Integer Number = Integer.valueOf(TextNumber);
                double DoubleNum = Double.valueOf(TextDouble);


                    System.out.println("La suma de los números es = " + (Number + DoubleNum));


            } catch (NumberFormatException e) {
                System.out.println("Error: Se a ingresado un número no valido.");
            }
        }}}
