import java.util.Arrays;
import java.util.Scanner;

public class FillingAnArray {  
public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Rellenando un arreglo");


                System.out.print("Ingrese el tamaño deseado del array = ");
                int Number1 = Data.nextInt();
                int[] array = new int[Number1];

                System.out.print("Ingrese el número para rellenar el array = ");
                int Number2 = Data.nextInt();

                Arrays.fill(array, Number2);

                System.out.println("El array ingresado es " + Arrays.toString(array));
                



            } catch (Exception e) {
                System.out.println("Error: Se a ingresado un dato no valido.");
            }
        }}}