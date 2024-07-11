import java.util.Scanner;

public class AddingElements {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        try {
            System.out.println("Sumando elementos");
            System.out.println("Ingrese un numero para sumarlo al array ");
            System.out.println("El array: (1,3,x)");

            int Number = Data.nextInt();
            int[] array1 = {1,3,Number};

            int addition = 0;

            for (int i = 0; i < array1.length; i++) {
                addition += array1[i];
            }

            System.out.println("La suma del array es = " + addition);

        } catch (Exception e) {
            System.out.println("Error: Se a ingresado un dato no valido.");
        }
    }}}


    