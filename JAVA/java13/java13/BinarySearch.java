import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {    
public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Búsqueda binaria");
                int[] array1 = new int[10];

                for (int i = 0; i < array1.length; i++) {
                    array1 [i] = (int) (Math.random() * 100);
                }

                Arrays.sort(array1);
                System.out.println("El array ordenado es = " + Arrays.toString(array1));
                System.out.println("Ingrese el numero que desee buscar");
                int Number = Data.nextInt();
                int index = Arrays.binarySearch(array1, Number);

                if (index != -11) {
                System.out.println("El numero " + Number + " se encuentra en la posicion " + (index +1));

                } else {
                System.out.println("El numero " + Number + " no se encuentra en el array");

                }



            } catch (Exception e) {
                System.out.println("Error: Se a ingresado un dato no valido.");
            }
        }}}

