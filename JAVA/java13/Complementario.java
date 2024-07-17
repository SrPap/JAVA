import java.util.Arrays;
import java.util.Scanner;

public class Complementario {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {
            System.out.println("Rellenando un arreglo de manera personalizada");

            System.out.print("Ingrese el tamaño deseado del array: ");
            int arraySize = data.nextInt();
            int[] array = new int[arraySize];
            
            int indexStart = 0;
            int indexEnd = 0;

            while (indexEnd < arraySize) {
                System.out.print("Ingrese el número para rellenar el array: ");
                int number = data.nextInt();

                System.out.print("Ingrese el índice final (debe ser mayor que " + indexStart + " y menor que " + arraySize + "): ");
                indexEnd = data.nextInt();

                if (indexEnd <= indexStart || indexEnd > arraySize) {
                    System.out.println("Índice no válido. Debe ser mayor que " + indexStart + " y menor que " + arraySize);
                } else {
                    Arrays.fill(array, indexStart, indexEnd, number);
                    indexStart = indexEnd;
                }
            }

            System.out.println("El array ingresado es: " + Arrays.toString(array));
        } catch (Exception e) {
            System.out.println("Error: Se ha ingresado un dato no válido.");
        }
    }
}