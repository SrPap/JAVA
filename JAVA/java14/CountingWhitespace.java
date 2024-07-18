import java.util.Scanner;

public class CountingWhitespace {
public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Contando los espacios en blanco en una cadena");

                System.out.println("Ingrese una frase que desee verificar");
                String Text = Data.nextLine();
                boolean verify;
                int NoText = 0;
                for (int i = 0; i < Text.length(); i++) {
                    char CharText = Text.charAt(i);
                        verify = Character.isWhitespace(CharText);
                        if (verify) {
                            NoText++;
                        }
                }

                if (NoText > 0) {
                    System.out.println("Se encontraron " + NoText + " espacios en blanco");

                } else {
                    System.out.println("No hay espacios en blanco");

                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Se a ingresado un número no valido.");
            }
        }}}


