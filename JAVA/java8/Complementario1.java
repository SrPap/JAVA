import java.util.Scanner;

public class Complementario1 {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        try {
            System.out.println("Generando un número aleatorio entre dos límites");
            System.out.println("Introdusca dos números enteros para establecer el limite inferior y superior");
            int DownLimit = Data.nextInt();
            int UpLimit = Data.nextInt();

                if (DownLimit >= UpLimit) {
                    System.out.println("El límite inferior debe ser menor que el límite superior.");
                } else {
                    int ramdomNum = (int) (Math.random() * (UpLimit - DownLimit + 1)) + DownLimit;
                    System.out.println("Número aleatorio generado entre " + DownLimit + " y " + UpLimit + ": " + ramdomNum);
                }

        } catch (Exception e) {
            System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");
        }
    }}}