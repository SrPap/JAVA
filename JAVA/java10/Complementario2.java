import java.util.Scanner;

public class Complementario2 {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        try {

            System.out.println("Sumando elementos en posiciones pares");
            System.out.println("Ingrese cinco números");

            double Number1 = Data.nextDouble();
            double Number2 = Data.nextDouble();
            double Number3 = Data.nextDouble();
            double Number4 = Data.nextDouble();
            double Number5 = Data.nextDouble();


            double[] array1 = {Number1,Number2,Number3,Number4,Number5};

            double suma = 0;

            for (int i = 0; i < array1.length; i++) {
                
                double CurrentNum  = array1[i];

                if (i % 2 == 0) {
                    suma += CurrentNum;
                    }

            }

            System.out.println(suma);
        } catch (NumberFormatException e) {
            System.out.println("Error: Se a ingresado un dato por el teclado no valido.");
        } catch (Exception e) {
            System.out.println("Error");
        } 
    }}}
