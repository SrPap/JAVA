import java.util.Scanner;

public class Complementario2 {
    
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Tabla de multiplicar");
        int Number [] = pedirNumeros();
        imprimirTablaMultiplicar(Number);
    }

    public static int[] pedirNumeros() {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
        System.out.print("Ingrese un número = ");
        array[i] = scanner.nextInt();
        System.out.println();
        }
        return array;
    }

    public static void imprimirTablaMultiplicar(int[] Numbers) {
        for (int i = 0; i < Numbers.length; i++) {
        System.out.println("Tabla del " + Numbers[i]);

        System.out.println();
        for (int x = 0; x < 11; x++) {
        System.out.println( Numbers[i] + " x " + x + " = " + Numbers[i]*x);
        }
        System.out.println();
        }
    }

}
