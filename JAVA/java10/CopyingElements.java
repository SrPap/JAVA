import java.util.Scanner;

public class CopyingElements {
public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        try {
            int[] arraydefault = {5,7,10};

            System.out.println("Copiando elementos");
            System.out.println("Array anterior: 5, 7 ,10");

            System.out.println("Ingrese dos números para anadir el array");

            int Number1 = Data.nextInt();
            int Number2 = Data.nextInt();


            int[] arraycopy = new int[5];
            arraycopy[0] = arraydefault [0];
            arraycopy[1] = arraydefault [1];
            arraycopy[2] = arraydefault [2];
            arraycopy[3] = Number1;
            arraycopy[4] = Number2;

            // System.out.println("El array compuesto es = " + Arrays.toString(arraycopy));
            System.out.println("El array compuesto es = " + arraycopy[0] + " " + arraycopy[1] + " " + arraycopy[2] + " " + arraycopy[3] + " " + arraycopy[4]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Se a ingresado un dato por el teclado no valido.");
        } catch (Exception e) {
            System.out.println("Error");
        } 
    }}}

