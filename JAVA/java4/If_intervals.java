import java.util.Scanner;

public class If_intervals {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        System.out.println("Por favor, ingrese un numero");
        int Number = Data.nextInt();
        System.out.println("El numero ingresado es = " + Number);

        if (Number <= 100 & Number > 90) {
            System.out.println("A");

        } else if (Number < 89 & Number > 80) {
            System.out.println("B");

        } else if (Number < 79 & Number > 70) {
            System.out.println("C");

        } else if (Number < 69 & Number > 60) {
            System.out.println("D");

        } else if (Number < 60 & Number >= 0) {
            System.out.println("F");

        } else {
            System.out.println("El número ingresado está fuera del rango válido");

        }
    }}
}
