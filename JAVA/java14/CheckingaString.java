import java.util.Scanner;

public class CheckingaString {
public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Verificando si una cadena representa un número válido");

                System.out.println("Ingrese el número que desee verificar");
                String Text = Data.nextLine();
                double toNumber = Double.valueOf(Text);
                System.out.println("El número es valido");

                System.out.println("El número ingresado es " + toNumber);


            } catch (NumberFormatException e) {
                System.out.println("Error: Se a ingresado un número no valido.");
            }
        }}}


        // double toNumber = Double.parseDouble(Text);
        // devuelve un nuevo doble inicializado al valor representado por la cadena especificada
