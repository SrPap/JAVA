import java.util.Scanner;

public class Complementario1 {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        try {

            System.out.println("Numeros de pares");
            System.out.println("Ingrese seis números");

            double Number1 = Data.nextDouble();
            double Number2 = Data.nextDouble();
            double Number3 = Data.nextDouble();
            double Number4 = Data.nextDouble();
            double Number5 = Data.nextDouble();
            double Number6 = Data.nextDouble();


            double[] array1 = {Number1,Number2,Number3,Number4,Number5,Number6};

            double Pares = 0;

            for (int i = 0; i < array1.length; i++) {
                
                double CurrentNum  = array1[i];

                if (CurrentNum % 2 == 0) {
                    Pares++;
                    }

            }

            System.out.println("El array compuesto hay " + Pares + " Pares");
        } catch (NumberFormatException e) {
            System.out.println("Error: Se a ingresado un dato por el teclado no valido.");
        } catch (Exception e) {
            System.out.println("Error");
        } 
    }}}
