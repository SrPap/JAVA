import java.util.Scanner;

public class DoWhile {    
    public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Adivinando un número");
    
                short Num; 
                short randomNum = (short) ( Math.random() * 20); 
                System.out.println("Adivina el numero que escogio la maquina");
                System.out.println("El rango del nuero es del 1 al 20");

                do { 

                System.out.print("Elija un Numero = ");
                Num = Data.nextShort(); 
                
                System.out.println("Se eligio la opcion = " + Num);
                if (randomNum > Num) {
                    System.out.println("El numero escogido es menor al " + randomNum);

                } else if (randomNum < Num) {
                    System.out.println("El numero escogido es mayor al " + randomNum);

                } else if (randomNum == Num) {
                    System.out.println("El numero escogido es igual al " + randomNum);
                    System.out.println("Felicidades");

                }

                } while (randomNum != Num);

                
      
                System.out.println("Gracias por jugar");
    
            } catch (Exception e) {
                System.out.println("Error: Se a ingresado un dato no valido.");
            }
        }}}

