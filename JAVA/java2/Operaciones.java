
import java.util.Scanner;


public class Operaciones {

    public static void main(String[] args) {
    int valorA = 10;
    int valorB = 5;
    short Suma = (short) (valorA + valorB);
    System.out.println("Suma = " + Suma);

    short Resta =(short) (valorA - valorB);
    System.out.println("Resta = " + Resta);

    short Multiplicacion = (short) (valorA * valorB);
    System.out.println("Multiplicacion = " + Multiplicacion);

    short Division = (short) (valorA / valorB);
    System.out.println("Division = " + Division);

    short Modulo = (short) (valorA%valorB);
    System.out.println("Modulo = " + Modulo);
    // System.out.println("ModuloEjmplo = " + (7%5));


   Scanner Datos = new Scanner(System.in);
   int datoA = Datos.nextInt();
   int datoB = Datos.nextInt();
    short SumaDatos = (short) (datoA + datoB);
    System.out.println("Suma de los datos adquiridos = " + SumaDatos);
    }
}


