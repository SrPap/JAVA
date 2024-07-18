import java.util.Scanner;

public class StringtoNumber {
public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Conversión de cadena a número");

                System.out.println("Ingrese el número entero");
                String Text = Data.nextLine();
                Integer toNumber = Integer.valueOf(Text);
                System.out.println("El número ingresado es " + toNumber);

            } catch (NumberFormatException e) {
                System.out.println("Error: Se a ingresado un número no valido.");
            }
        }}}

