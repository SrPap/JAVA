import java.util.Scanner;

public class SearchingItem {
public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        try {
            System.out.println("Buscando un elemento");
            System.out.println("Ingrese tres números para componer el array");

            int Number1 = Data.nextInt();
            int Number2 = Data.nextInt();
            int Number3 = Data.nextInt();

            System.out.println("Ingrese un número para buscarlo en el array");

            int Numberfind = Data.nextInt();
            boolean findNum = false;
            int[] array1 = {Number1,Number2,Number3};

            // for (int i = 0; i < array1.length; i++) {
                
            //     int CurrentNum  = array1[i];

            //     if (CurrentNum == Numberfind) {
            //         findNum = true;
            //         }

            // }

            if (Numberfind == array1[1]) {
                findNum = true;
                if (Numberfind == array1[2]) {
                    findNum = true;
                    
                }
            } else {
                if (Numberfind == array1[2]) {
                    findNum = true;
                    
                }
            }




        if (findNum) {
            System.out.println("El valor " + Numberfind + " si se encuentra en el array");
        } else {
            System.out.println("El valor " + Numberfind + " no se encuentra en el array");
        }


        } catch (NumberFormatException e) {
            System.out.println("Error: Se a ingresado un dato por el teclado no valido.");
        } catch (Exception e) {
            System.out.println("Error");
        } 
    }}}
