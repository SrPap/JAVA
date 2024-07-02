import java.util.Scanner;

public class OpComparacion {

        public static void main(String[] args) {

       Scanner Datos = new Scanner(System.in);

       int datoA = Datos.nextInt();
       System.out.println("Ingresa un numero entero = " + datoA);
       int datoB = Datos.nextInt();
       System.out.println("Ingresa otro un numero entero = " + datoB);
       boolean mayorQue = (boolean) (datoA > datoB);

       String mensaje = (datoA != datoB) ? "El numero " + datoA + " es mayor al numero " + datoB + " = " + mayorQue : "Los dos numeros son iguales";
       System.out.println(mensaje);

       String Divisible = (datoA % 2 == 0)? "El numero " + datoA + " se puede dividir entre 2" : "El numero " + datoA + " no se puede dividir entre 2";
       System.out.println(Divisible);
       
       //2
       int datoC = Datos.nextInt();
       System.out.println("Ingresa un numero entero = " + datoC);
       int datoD = Datos.nextInt();
       System.out.println("Ingresa un numero entero = " + datoD);

       boolean mayorQue2 = (boolean) (datoC > datoD);
       System.out.println("Los primeros numeros son mayores a los segundos? = " + (mayorQue && mayorQue2));
       System.out.println("Alguno de los primeros numeros son mayores a los segundos? = " + (mayorQue || mayorQue2));
       
        }
    }
