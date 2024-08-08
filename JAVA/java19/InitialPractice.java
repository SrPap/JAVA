
import java.util.Scanner;


public class InitialPractice {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Por favor ingrese un nombre:");
            String Nombre = scanner.nextLine();
            imprimeNombre(Nombre);


            System.out.println("Por favor ingrese una edad:");
            int Edad = scanner.nextInt();
            imprimeNombreYEdad(Nombre,Edad);
        }
    }

    public static void imprimeNombre(String Name) {
        System.out.println("Mi nombre es " + Name);
        }
    public static void imprimeNombreYEdad(String Name, int Age) {
        System.out.println("Me llamo " + Name + " y tengo " + Age +" años.");
        }

}


