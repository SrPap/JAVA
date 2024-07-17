import java.util.Arrays;
import java.util.Scanner;

public class CopyingArrangement {
public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Copiando parte de un arreglo");
                int[] array1 = new int[10];

                for (int i = 0; i < array1.length; i++) {
                    array1 [i] = (int) (Math.random() * 100);
                }
                System.out.println("El array default es = " + Arrays.toString(array1));

                System.out.print("Ingrese el indice inicial = ");
                int indexStart = Data.nextInt();

                System.out.print("Ingrese el indice final = ");
                int indexEnd = Data.nextInt();

                if (indexStart >= indexEnd) {
                System.out.println("El indice inicial debe ser mayor al indice final");

                } else if (indexStart < array1.length & indexEnd < array1.length & indexStart > -1){
                    int[] array2= Arrays.copyOfRange(array1, indexStart, indexEnd);
                    System.out.println("El array ingresado es " + Arrays.toString(array2));
                } else {
                    System.out.println("Los indices tienen que estar dentro del rango del array");

                }



            } catch (Exception e) {
                System.out.println("Error: Se a ingresado un dato no valido.");
            }
        }}}
