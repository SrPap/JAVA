import java.util.Scanner;

public class FindingMinimumValue {
public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        try {
            System.out.println("Encontrando el valor mínimo");
            System.out.println("Ingrese cinco números");

            double Number1 = Data.nextDouble();
            double Number2 = Data.nextDouble();
            double Number3 = Data.nextDouble();
            double Number4 = Data.nextDouble();
            double Number5 = Data.nextDouble();


            double[] array1 = {Number1,Number2,Number3,Number4,Number5};

            double minimum = array1[0];

            for (int i = 0; i < array1.length; i++) {
                double CurrentNum  = array1[i];

                if (CurrentNum < minimum) {
                    minimum = CurrentNum;
                    }
            }


            System.out.println("El valor mínimo ingresado es = " + minimum);

        } catch (NumberFormatException e) {
            System.out.println("Error: Se a ingresado un dato por el teclado no valido.");
        } catch (Exception e) {
            System.out.println("Error");
        } 
    }}}
