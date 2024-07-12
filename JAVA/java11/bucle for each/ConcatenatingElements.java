import java.util.Arrays;
import java.util.Scanner;

public class ConcatenatingElements {
public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Concatenando elementos");
                System.out.println("Ingrese tres Textos para crear el array");
    
                String Text1 = Data.nextLine();
                String Text2 = Data.nextLine();
                String Text3 = Data.nextLine();


                String[] array1 = {Text1,Text2,Text3};
                System.out.println("El array es = " + Arrays.toString(array1));

            int i = 0;
            for (String Texti : array1) {
                if (i > 0) {
                    array1[i] = array1[i - 1].concat(" " + Texti);
                    array1[i - 1] = "";
                }
              i++;
            }

            System.out.println("El array es = " + Arrays.toString(array1));

            } catch (Exception e) {
                System.out.println("Error: Se a ingresado un dato no valido.");
            }
        }}}
