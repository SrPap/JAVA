import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Validación de contraseña");
    
                String Passwordefault = "secreto"; 
                System.out.println("Ingrese la contraseña secreta");
                System.out.println("(La contrase es un secreto)");
                String Password = Data.nextLine();

                while (!Password.equals(Passwordefault)) {
                    System.out.print("Contraseña invalida, ingrese de nuevo la contraseña = ");
                    Password = Data.nextLine();

                }

                System.out.println("Contraseña valida");
    
            } catch (Exception e) {
                System.out.println("Error: Se a ingresado un dato no valido.");
            }
        }}}
