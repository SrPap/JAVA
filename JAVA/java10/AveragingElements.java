import java.util.Scanner;

public class AveragingElements {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        try {
            System.out.println("Promediando elementos");
            System.out.println("Ingrese cuatro números para realizar el promedio");

            double Number1 = Data.nextDouble();
            double Number2 = Data.nextDouble();
            double Number3 = Data.nextDouble();
            double Number4 = Data.nextDouble();

            double[] array1 = {Number1,Number2,Number3,Number4};

            double addition = 0;

            for (int i = 0; i < array1.length; i++) {
                addition += array1[i];
            }

            double Average = (double) addition / array1.length;

            System.out.println("El promedio del array es = " + Average);

        } catch (Exception e) {
            System.out.println("Error: Se a ingresado un dato no valido.");
        }
    }}}
