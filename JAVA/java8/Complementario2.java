import java.util.Scanner;

public class Complementario2 {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Generando un número aleatorio y su raiz");
                System.out.println("Introdusca un número entre 1 y 30");
                int numLimit = Data.nextInt();
    
                if (numLimit < 1 || numLimit > 30) {
                    System.out.println("El número debe estar entre 1 y 30.");
                } else {
                    int ramdomNum = (int) (Math.random() * numLimit) + 1;
        
                    double sqrtNum = Math.sqrt(ramdomNum);
        
                    boolean esPrimo = esNumeroPrimo(ramdomNum);
        
                    // Mostrar si el número es primo o no
                    if (esPrimo) {
                        System.out.println("El número aleatorio generado (" + ramdomNum + ") es primo.");
                    } else {
                        System.out.println("El número aleatorio generado (" + ramdomNum + ") no es primo.");
                    }
        
                    System.out.println("Número aleatorio generado: " + ramdomNum);
                    System.out.println("Raíz cuadrada del número generado: " + sqrtNum);
                }
    
            } catch (Exception e) {
                System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");
            }


        }}
    

        public static boolean esNumeroPrimo(int numero) {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
            
        }

    }
