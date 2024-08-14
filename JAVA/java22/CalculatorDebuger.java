import java.util.Scanner;

public class CalculatorDebuger {
    
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Calculadora");
        int Result = menu();
        System.out.println();
        System.out.println();

        if (Result == 0) {
        System.out.print("Se ha salido con exito");
        }
    }


    public static int menu() {

        double[] Numbers = new double[2];
        for (int i = 0; i < Numbers.length; i++) {
        System.out.print("Ingrese un número = ");
        Numbers[i] = scanner.nextInt();
        System.out.println();
        }
    
        boolean Salir = false;
        double Result = 0;
        int Result2 = 0;

    do { 
            System.out.println("Escoja la operacion matematica que desee realizar.");
        System.out.println("1.Suma.");
        System.out.println("2.Resta.");
        System.out.println("3.Multiplicacion.");
        System.out.println("4.Division.");
        System.out.println("5.Salir.");
        System.out.println();
        int Option = scanner.nextInt();
        System.out.println();
        
        switch (Option) {
            case 1 -> {Result = Numbers[0] + Numbers[1];}
            case 2 -> {Result = Numbers[0] - Numbers[1];}
            case 3 -> {Result = Numbers[0] * Numbers[1];}
            case 4 -> {
                
                      try {

                        Result = 20 / 0;
                        } catch (Exception e) {
                        System.out.println("El error fue = " + e);
            
                       }
                    }

            case 5 -> {
                       Salir = true;}

            default -> throw new AssertionError();
        }
        
        System.out.println("El resoltado es = " + Result);
        
        

    } while (Salir == false);

    return Result2;
    }
}