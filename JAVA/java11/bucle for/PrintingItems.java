import java.util.Arrays;
import java.util.Scanner;

public class PrintingItems {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        try {
            System.out.println("Imprimiendo elementos");
            System.out.println("Ingrese cuatro números para realizar el array");

            double Number1 = Data.nextDouble();
            double Number2 = Data.nextDouble();
            double Number3 = Data.nextDouble();
            double Number4 = Data.nextDouble();

            double[] array1 = {Number1,Number2,Number3,Number4};

            System.out.println("El array es = ");

            for (int i = 0; i < array1.length; i++) {
                System.out.println(array1[i]);
            }

            System.out.println("El array es = " + Arrays.toString(array1));

        } catch (Exception e) {
            System.out.println("Error: Se a ingresado un dato no valido.");
        }
    }}
}

