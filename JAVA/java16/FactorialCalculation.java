import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
            try (Scanner Data = new Scanner(System.in)) {
                try {
                    System.out.println("Cálculo del factorial");
    
                    System.out.println("Ingrese un número que desee factorizar");
                    int Number = Data.nextInt();

                    int Factorial = 1;
                    int x = 1;
                    do { 
                        Factorial = Factorial * x;
                        x++;

                    } while (!(x > Number));


                    System.out.println("El resultado es = " + Factorial);

    
                } catch (NumberFormatException e) {
                    System.out.println("Error: Se a ingresado un número no valido.");
                } catch (Exception e) {
                    System.out.println("Error: Se a ingresado un número no valido.");
                }
            }}}
    

// El factorial de 3 se calcula como 1 * 2 * 3, lo que resulta en 6.

// El factorial de 5 se obtiene multiplicando 1 * 2 * 3 * 4 * 5, dando como resultado 120.

// Para calcular el factorial de 7, multiplicamos 1 * 2 * 3 * 4 * 5 * 6 * 7, que da 5040.