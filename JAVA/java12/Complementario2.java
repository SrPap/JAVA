import java.util.Scanner;

public class Complementario2 {
     public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Contador de números pares e impares");
                String option = "si";
                int Even = 0;
                int Odd = 0;

                    while (option.equalsIgnoreCase("si")) {
                        System.out.print("Ingrese un número entero = ");
                        int Number = Data.nextInt();

                        if (Number%2 == 0) {
                            Even++;
                        } else {
                            Odd++;
                        }

                        System.out.println("Desea ingreasr otro número? (si/no)");
                        option = Data.next();
                    }
                
                    System.out.println("Se han registrado " + Even + " numeros pares");
                    
                    System.out.println("Se han registrado " + Odd + " numeros impares");

            } catch (Exception e) {
                System.out.println("Error: Se a ingresado un dato no valido.");
            }
        }}}

