import java.util.Scanner;

public class GeneratingPasswords {
    public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Generando contraseñas");

                System.out.println("Ingrese un número para establecer la longitud de la contraseña");
                int lengthPassword = Data.nextInt();

                char[] Text = new char[lengthPassword];

                for (int i = 0; i < lengthPassword; i++) {
                    int variation = (int) (Math.random() * 3);
                    char character;
                    switch (variation) {
                        case 0 -> {
                            // Numero
                            character = (char) (Math.random() * 10 + '0');
                        }
                        case 1 -> {
                            // Mayuscula
                            character = (char) (Math.random() * 26 + 'A');
                        }
                        case 2 -> {
                            // Minuscula
                            character = (char) (Math.random() * 26 + 'a');
                        }
                        default -> throw new AssertionError();
                    }
                    Text[i] = character;
                }

                boolean hasDigit = false;
                boolean hasUpperCase = false;
                boolean hasLowerCase = false;

                for (char c : Text) {
                    if (Character.isDigit(c)) {
                        hasDigit = true;
                    } else if (Character.isUpperCase(c)) {
                        hasUpperCase = true;
                    } else if (Character.isLowerCase(c)) {
                        hasLowerCase = true;
                    }
                }

                if (hasDigit && hasUpperCase && hasLowerCase) {
                    System.out.println("La contraseña es = " + new String(Text));
                } else {
                    System.out.println("La contraseña no cumple con todos los requisitos.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Se ha ingresado un número no válido.");
            } catch (Exception e) {
                System.out.println("Error: Se ha producido un error.");
            }
        }
    }
}