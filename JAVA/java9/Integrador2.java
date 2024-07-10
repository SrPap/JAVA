import java.util.Scanner;

public class Integrador2 {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        try {
            System.out.println("Validación de contraseña");
            System.out.println("Ingrese una contraseña");
            String Password = Data.nextLine();
           
            if (Password.length() >= 8) {
                if (Password.matches(".*[A-Z].*")) {
                    if (Password.matches(".*[a-z].*")) {
                        if (Password.matches(".*[0-9].*")) {
                            if (Password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
                                
                                System.out.println("¡Contraseña segura! Cumple con todos los criterios.");

                            } else {
                                System.out.println("Contraseña no segura. Debe tener al menos 8 caracteres, una letra mayúscula, una letra minúscula, un número y un carácter especial.");

                            }
                        } else {
                            System.out.println("Contraseña no segura. Debe tener al menos 8 caracteres, una letra mayúscula, una letra minúscula, un número y un carácter especial.");

                        }
                    } else {
                        System.out.println("Contraseña no segura. Debe tener al menos 8 caracteres, una letra mayúscula, una letra minúscula, un número y un carácter especial.");
 
                    }
                } else {
                    System.out.println("Contraseña no segura. Debe tener al menos 8 caracteres, una letra mayúscula, una letra minúscula, un número y un carácter especial.");

                }

            } else {
                System.out.println("Contraseña no segura. Debe tener al menos 8 caracteres, una letra mayúscula, una letra minúscula, un número y un carácter especial.");
            }

                
        } catch (Exception e) {
            System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");
        }
    }}}
