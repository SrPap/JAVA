import java.util.Arrays;
import java.util.Scanner;

public class ComparingArrangements {
public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Búsqueda binaria");
                int[] array1 = new int[2];

                for (int i = 0; i < array1.length; i++) {
                    array1 [i] = (int) (Math.random() * 100);
                }
                System.out.println("El array default es = " + Arrays.toString(array1));

                int[] array2 = new int[2];
                array2[0] = Data.nextInt();
                array2[1] = Data.nextInt();

                Arrays.sort(array1);
                Arrays.sort(array2);

                if (Arrays.equals(array1, array2)) {
                System.out.println("El array " + Arrays.toString(array1));
                System.out.println("Es igual al array ingresado" + Arrays.toString(array2));

                } else {
                    System.out.println("El array " + Arrays.toString(array1));
                    System.out.println("Es diferente al array ingresado " + Arrays.toString(array2));
                }



            } catch (Exception e) {
                System.out.println("Error: Se a ingresado un dato no valido.");
            }
        }}}
