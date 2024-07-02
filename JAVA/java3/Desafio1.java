
import java.util.Scanner;

public class Desafio1 {
    
    public static void main(String[] args) {
    try (Scanner Datos = new Scanner(System.in)) {
        int datoA = Datos.nextInt();
        System.out.println("El numero ingresado es = " + datoA);

        String mensaje = (datoA% 2 == 0)? "El numero es par":"El numero es impar";
        boolean operacionValida = (datoA == 0);
         if(operacionValida) {System.out.println(mensaje);}
         else {System.out.println("El numero es invalido");}
        
    }

    
    }
}
