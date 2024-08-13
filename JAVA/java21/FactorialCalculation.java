import java.util.Scanner;

public class FactorialCalculation {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
                try {
                    System.out.println("Cálculo del factorial");
                    int Number = getNumber();
                    
                    int Result = Factorial(Number);
                    System.out.println("El resultado es = " + Result);

    
                } catch (NumberFormatException e) {
                    System.out.println("Error: Se a ingresado un número no valido.");
                } catch (Exception e) {
                    System.out.println("Error: Se a ingresado un número no valido.");
                }
            }

            public static int getNumber() {
                System.out.println("Ingrese un número que desee factorizar");
                return sc.nextInt();
            }


            public static int Factorial( int Number ) {
                if (Number == 0) {
                    return 1;
                }
                return Number * Factorial(Number - 1);
            }
        }
    

            