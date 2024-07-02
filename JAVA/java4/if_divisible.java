import java.util.Scanner;

public class if_divisible {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        System.out.println("Por favor, ingrese un numero");
        int Number = Data.nextInt();
        System.out.println("El numero ingresado es = " + Number);

        if (Number%3 == 0 & Number%5 == 0) {
            System.out.println("El numero es divisible entre 5 y 3");

        } else if (Number%5 == 0) {
            System.out.println("El numero es divisible entre 5");

        } else if (Number%3 == 0) {
            System.out.println("El numero es divisible entre 3");

        } else {
            System.out.println("El numero no es divisible entre 5 o 3");

        }
    }}
}
