
import java.util.Scanner;

public class Scaner {

    public static void main(String[] args) {
    Scanner NombreUsuario = new Scanner(System.in);
    String nombre = NombreUsuario.nextLine();
    int edad = NombreUsuario.nextInt();

    System.out.println("Nombre = " + nombre);
    System.out.println("Edad = " + edad);
    System.out.println("Datos del Usuario = " + nombre + " " + edad);


    }
}

