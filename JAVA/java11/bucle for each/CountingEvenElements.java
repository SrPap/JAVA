import java.util.Arrays;
import java.util.Scanner;

public class CountingEvenElements {
    public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Contando Elementos Pares");
                System.out.println("Ingrese un número para complementar el array");
    
                int Number1 = Data.nextInt();
                int randomNum1 = (int) Math.round((Math.random() * 100) - 1);
                int randomNum2 = (int) Math.round((Math.random() * 100) - 1);
                int randomNum3 = (int) Math.round((Math.random() * 100) - 1);
                int randomNum4 = (int) Math.round((Math.random() * 100) - 1);
                int randomNum5 = (int) Math.round((Math.random() * 100) - 1);
                int randomNum6 = (int) Math.round((Math.random() * 100) - 1);
                int randomNum7 = (int) Math.round((Math.random() * 100) - 1);
                int randomNum8 = (int) Math.round((Math.random() * 100) - 1);
                int randomNum9 = (int) Math.round((Math.random() * 100) - 1);

                int[] array1 = {randomNum1,randomNum2,randomNum3,randomNum4,randomNum5,randomNum6,randomNum7,randomNum8,randomNum9,Number1};
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
