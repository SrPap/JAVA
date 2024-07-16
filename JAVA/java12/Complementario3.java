import java.util.Scanner;

public class Complementario3 {
    public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Calculadora de suma acumulada");
                String option;
                int addition = 0;


                    do { 
                        System.out.print("Ingrese un numero entero positivo: ");
                        int Number = Data.nextInt();
                        
                        if (Number < 0) {
                            System.out.println("Error: el numero ingresado es negativo.");
                            
                            System.out.println("Desea ingreasr otro número? (si/no)");
                            option = Data.next();

                        } else {
                            addition += Number;
                            System.out.println("Desea ingreasr otro número? (si/no)");
                            option = Data.next();
                        }
                        
                    } while (option.equalsIgnoreCase("si"));
                
                    
                    System.out.println("El resultado final es = " + addition);

            } catch (Exception e) {
                System.out.println("Error: Se a ingresado un dato no valido.");
            }
        }}}

