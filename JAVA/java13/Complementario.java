import java.util.Arrays;
import java.util.Scanner;

public class Complementario {
public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
            System.out.println("Rellenando un arreglo de manera personalizada");

            System.out.print("Ingrese el tamaño deseado del array = ");
            int Number1 = Data.nextInt();
            int[] array1 = new int[Number1];
            int[] array2 = new int[Number1];
            int indexStart = 0;
            int indexEnd;

                do { 
                System.out.print("Ingrese el número para rellenar el array = ");
                int Number2 = Data.nextInt();
                Arrays.fill(array2, Number2);
                

                System.out.print("Ingrese el indice final = ");
                indexEnd = Data.nextInt();

                if (indexStart >= indexEnd) {
                System.out.println("El indice inicial debe ser mayor al indice final");
                
                } else if (indexStart <= array1.length & indexEnd <= array1.length & indexStart > -1){
                    array1= Arrays.copyOfRange(array2, indexStart, array2.length);
                    System.out.println("El array ingresado es " + Arrays.toString(array1));
                    array1= Arrays.copyOfRange(array2, 0, Number1);


                    indexStart = indexEnd;
                } else {
                    System.out.println("Los indices tienen que estar dentro del rango del array");
                    System.out.print(indexStart + " " + indexEnd);
                    System.out.print(" " +array1.length + " " + array2.length);


                }
                System.out.print(indexStart + " " + indexEnd);

                } while (indexStart != array1.length);

                
            } catch (Exception e) {
                System.out.println("Error: Se a ingresado un dato no valido.");
            }
        }}}

        
        
        