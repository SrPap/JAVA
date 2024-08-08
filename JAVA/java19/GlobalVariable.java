import java.util.Scanner;

public class GlobalVariable {

    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
          
            String Nombre = nombre();
            int Edad = edad();

            System.out.println("Por favor ingrese una edad:");
            imprimeNombreYEdad(Nombre,Edad);
        
    }

    public static String nombre() {
        System.out.println("Por favor ingrese un nombre:");
        return sc.nextLine();
        }
    public static int edad() {
        System.out.println("Por favor ingrese una edad:");
        return sc.nextInt();
    }
    
    public static void imprimeNombreYEdad(String Nombre, int Edad) {
        System.out.println("Me llamo " + Nombre + " y tengo " + Edad +" años.");
        }

}
