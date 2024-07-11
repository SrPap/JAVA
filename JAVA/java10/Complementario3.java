import java.util.Arrays;
import java.util.Scanner;

public class Complementario3 {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        try {

            System.out.println("Ordenando Nombres Alfabéticamente");
            System.out.println("Ingrese cinco números");

            String Data1 = Data.nextLine();
            String Data2 = Data.nextLine();
            String Data3 = Data.nextLine();
            String Data4 = Data.nextLine();

            String[] array1 = {Data1,Data2,Data3,Data4};

            Arrays.sort(array1);

            System.out.println("Nombres ordenados alfabéticamente:");
        for (String nombre : array1) {
            System.out.println(nombre);
        }



        } catch (NumberFormatException e) {
            System.out.println("Error: Se a ingresado un dato por el teclado no valido.");
        } catch (Exception e) {
            System.out.println("Error");
        } 
    }}}
