import java.util.Scanner;

public class CountingDigits {
public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Contando los dígitos en un número");

                System.out.println("Ingrese un número que desee verificar");
                Integer Number = Data.nextInt();

                String Text = Integer.toString(Number);
                boolean verify;
                int Digit = 0;
                for (int i = 0; i < Text.length(); i++) {
                    char CharText = Text.charAt(i);
                        verify = Character.isDigit(CharText);
                        if (verify) {
                            Digit++;
                        }
                }

                if (Digit > 0) {
                    System.out.println("Se encontraron " + Digit + " digitos");

                } else {
                    System.out.println("No hay números");

                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Se a ingresado un número no valido.");
            } catch (Exception e) {
                System.out.println("Error: Se a ingresado un número no valido.");
            }
        }}}

