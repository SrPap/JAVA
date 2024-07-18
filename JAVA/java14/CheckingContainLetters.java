import java.util.Scanner;

public class CheckingContainLetters {
    public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Verificando si una cadena contiene solo letras");

                System.out.println("Ingrese una palabra que desee verificar");
                String Text = Data.nextLine();
                boolean verify;
                int NoText = 0;

                for (int i = 0; i < Text.length(); i++) {
                    char CharText = Text.charAt(i);
                        verify = Character.isLetter(CharText);
                        if (!verify) {
                            NoText++;
                        }
                }

                if (NoText > 0) {
                    System.out.println("La palabra ingresada no contiene solo letras");

                } else {
                    System.out.println("La palabra ingresada contiene solo letras");

                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Se a ingresado un número no valido.");
            }
        }}}
