import java.util.Arrays;
import java.util.Scanner;

public class CountingEvenElements {
    public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Contando Elementos Pares");
                System.out.println("Ingrese un número para complementar el array");
                
                int[] array1 = new int[10];
                int length = 10;
                for (int i = 0; i < length - 1; i++) {
                    array1[i] = (int) (Math.random() * 100);
                }

                int Number1 = Data.nextInt();


                array1[length - 1] = Number1;


                System.out.println("El array es = " + Arrays.toString(array1));

            for (int Num : array1) {
                if (Num%2 == 0) {
                    System.out.println(Num + " Es par");
                } else {
                    System.out.println(Num + " Es inpar");

                }
            }

    
            } catch (Exception e) {
                System.out.println("Error: Se a ingresado un dato no valido.");
            }
        }}}
