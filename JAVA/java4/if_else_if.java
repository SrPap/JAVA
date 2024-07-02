

import java.util.Scanner;

public class if_else_if {
    
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        System.out.println("Por favor, ingrese un numero");
        int Number = Data.nextInt();
        System.out.println("El numero ingresado es = " + Number);

        if (Number > 0) {
            System.out.println("El numero ingresado es positivo");

        } else if (Number < 0) {
            System.out.println("El numero ingresado es negativo");

        } else {
            System.out.println("El numero ingresado es cero");

        }
    }}
}
