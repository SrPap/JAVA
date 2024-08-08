import java.util.Scanner;

public class Complementario1 {
    
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Tabla de multiplicar");
        
        int Number = pedirNumero();
        
        imprimirTablaMultiplicar(Number);
    }

    public static int pedirNumero() {
        System.out.println("Por favor ingrese un numero:");
        return scanner.nextInt();
    }

    public static void imprimirTablaMultiplicar(int Number) {
        System.out.println("Tabla del " + Number);
        for (int i = 0; i < 11; i++) {
            System.out.println( Number + " x " + i + " = " + Number*i);
        }
    }

}