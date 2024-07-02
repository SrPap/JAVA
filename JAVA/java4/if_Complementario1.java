import java.util.Scanner;

public class if_Complementario1 {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        System.out.println("Patata in english");

        System.out.println("Por favor, ingrese la contraseña");
        String Password = Data.nextLine();
        String PasswordPredefect = "Potato";
        if (Password.equals(PasswordPredefect)) {
            System.out.println("Acceso concedido");

        } else  {
            System.out.println("Acceso denegado");

        } 
    }}
}
