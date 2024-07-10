import java.util.Scanner;

public class Integrador2ejm {
    public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {

            System.out.println("Validación de contraseña");
            System.out.println("Ingrese una contraseña");
            String Password = Data.nextLine();

            boolean PasswordV1 = Password.length() >= 8;
            boolean PasswordV2 = Password.matches(".*[A-Z].*");
            boolean PasswordV3 = Password.matches(".*[a-z].*");
            boolean PasswordV4 = Password.matches(".*[0-9].*");
            boolean PasswordV5 = Password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");

            if (PasswordV1 && PasswordV2 && PasswordV3 && PasswordV4 && PasswordV5) {
                System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
            } else {
                System.out.println("Contraseña no segura. Debe tener al menos 8 caracteres, una letra mayúscula, una letra minúscula, un número y un carácter especial.");
            }


            } catch (Exception e) {
                System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");
            }
        }}}
