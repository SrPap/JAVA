import java.util.Arrays;
import java.util.Scanner;

public class Complementario2 {
public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        try {
            System.out.println("Calcular suma acumulada");
            System.out.println("Ingrese un numero para sumar el array de izquierda a derecha");
            System.out.println("El array: (1,3,7,10,30,1,0,15)");

            int I = Data.nextInt();
            int[] array1 = {1,3,7,10,30,1,0,15};

            if (I < 1 || I > array1.length) {
                System.out.println("Error: El número debe estar entre 1 y " + array1.length);
                return;
            }


            int addition = 0;

            for (int i = 0; i < I; i++) {
                addition += array1[i];
                array1[i] = addition;
                if (i > 0) {
                    array1[i - 1] = 0;
                }
            }

            System.out.println("La suma del array es = " + addition);
            System.out.println("El array en cuestion = " + Arrays.toString(array1));

        } catch (Exception e) {
            System.out.println("Error: Se a ingresado un dato no valido.");
        }
    }}}
