import java.util.Scanner;

public class NumberDigits {
        public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Número de dígitos");
                System.out.println("Ingrese un número entero");
                System.out.println("(Se obtendrá la canditad de dígitos que posee)");
                int Number = Data.nextInt();
                Number = Math.abs(Number);

                int digits = 0;
                if (Number == 0) {
                    digits++;

                } else {
                    while (Number > 0) {
                        Number = Number/10;
                        digits++;
                    }
                }
                    
               
                System.out.println("El numero" + Number + " tiene " + digits + " dígitos");
    
            } catch (Exception e) {
                System.out.println("Error: Se a ingresado un dato no valido.");
            }
        }}}

