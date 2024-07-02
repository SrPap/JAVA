import java.util.Scanner;

public class Desafio2 {
    
    public static void main(String[] args) {
    Scanner Datos = new Scanner(System.in);
    System.out.println("Calculadora");

    System.out.println("Ingresa un numero =");
    double datoA = Datos.nextDouble();

    System.out.println("Ingresa otro numero =");
    double datoB = Datos.nextDouble();


    System.out.println("Elige una operación:");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicación");
    System.out.println("4. División");
    System.out.print("Ingrese su opción: ");
    int option = Datos.nextInt();


    double resultado = 0;
    boolean operacionValida = true;
    
    // Realizar la operación según la opción seleccionada
    switch(option) {
        case 1 -> resultado = datoA + datoB;
        case 2 -> resultado = datoA - datoB;
        case 3 -> resultado = datoA * datoB;
        case 4 -> {
            if (datoB != 0) {
                resultado = datoA / datoB;
            } else {
                System.out.println("Error: División por cero no es permitida.");
                operacionValida = false;
            }
            }
        default -> {
            System.out.println("Opción no válida.");
            operacionValida = false;
            }
    }
    
    // Mostrar el resultado si la operación fue válida
    if (operacionValida) {
        System.out.println("El resultado es: " + resultado);
    }
    }
}




