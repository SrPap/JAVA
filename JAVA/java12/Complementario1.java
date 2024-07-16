import java.util.Scanner;

public class Complementario1 {
        public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Tabla de multiplicar");
                System.out.println("Ingrese un número entero");
                System.out.println("(ingrese el numero 0 para parar el programa)");

                int Number = Data.nextInt();

                int option = 1;
                int i = 0;

                    while (option != 0) {
                        System.out.println("El numero" + Number + " X " + i + " = " + Number * i);
                        i++;
                        option = Data.nextInt();

                    }
                    
               
    
            } catch (Exception e) {
                System.out.println("Error: Se a ingresado un dato no valido.");
            }
        }}}

        