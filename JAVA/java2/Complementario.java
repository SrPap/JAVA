 import java.util.Scanner;

    public class Complementario {
    
         public static void main(String[] args) {

           Scanner Datos = new Scanner(System.in);
           System.out.println( "Ingrese su año de nacimiento = ");   

           int añoNacimiento = Datos.nextInt();
           System.out.println( "Fecha de nacimiento = " + añoNacimiento);   

           int ANIOACTUAL = 2024;

           short calculoEdad =(short) (ANIOACTUAL - añoNacimiento);

           boolean MayordeEdad = (boolean) (calculoEdad > 18);

           System.out.println("El usiario es mayor de edad? = " + MayordeEdad);

}
}
