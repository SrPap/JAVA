import java.util.Arrays;
import java.util.Scanner;

public class ManipulatingSentences {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Manipulando oraciones");
            boolean salir = true;
            System.out.print("Ingrese una oración: ");
            String sentence = scanner.nextLine();
            
            while (salir) {
                if (sentence.length() > 0) {
                    System.out.println("MENU");
                    System.out.println("1. Borrar oración");
                    System.out.println("2. Cantidad de caracteres de la oración.");
                    System.out.println("3. Cantidad de palabras de la oración.");
                    System.out.println("4. Mostrar palabras ordenadas alfabéticamente.");
                    System.out.println("5. Ingresar un número y devolver la palabra correspondiente.");
                    System.out.println("6. Buscar palabra dentro de la oración.");
                    System.out.println("7. Modificar palabra dentro de la oración.");
                    System.out.println("8. Agregar contenido a la oración.");
                    System.out.println("9. Salir.");
                    int option = scanner.nextInt();
                   
                    
                    switch (option) {
                        case 1 -> {
                            System.out.print("Ingrese una nueva oración: ");
                            sentence = scanner.nextLine();
                        }
                        case 2 -> {
                            System.out.println("La oración tiene " + sentence.length() + " caracteres");
                        }
                        case 3 -> {
                            int wordsCount = countWords(sentence);
                            System.out.println("La cantidad de palabras es: " + wordsCount);
                        }
                        case 4 -> {
                            String[] words = sentence.split("\\s+");
                            Arrays.sort(words);
                            System.out.println("Palabras ordenadas alfabéticamente: " + Arrays.toString(words));
                        }
                        case 5 -> {
                            String[] words = sentence.split("\\s+");
                            System.out.print("Ingrese un número: ");
                            int number = scanner.nextInt();
                            scanner.nextLine();
                            if (number > 0 && number <= words.length) {
                                System.out.println("La palabra en la posición " + number + " es: " + words[number - 1]);
                            } else {
                                System.out.println("Número inválido. Intente nuevamente.");
                            }
                        }
                        case 6 -> {
                            System.out.print("Ingrese una palabra para buscar: ");
                            String wordSearch = scanner.nextLine();
                            String[] words = sentence.split("\\s+");
                            boolean find = false;
                            for (int i = 0; i < words.length; i++) {
                                if (words[i].equals(wordSearch)) {
                                    System.out.println("La palabra \"" + wordSearch + "\" fue encontrada en la posición " + (i + 1) + ".");
                                    find = true;
                                    break;
                                }
                            }
                            if (!find) {
                                System.out.println("La palabra \"" + wordSearch + "\" no fue encontrada en la oración.");
                            }
                        }
                        case 7 -> {
                            System.out.print("Ingrese la palabra que desea modificar: ");
                            String oldWord = scanner.nextLine();
                            System.out.print("Ingrese la nueva palabra: ");
                            String newWord = scanner.nextLine();
                            sentence = sentence.replace(oldWord, newWord);
                            System.out.println("La oración modificada es: " + sentence);
                        }
                        case 8 -> {
                            System.out.print("Ingrese el contenido adicional para agregar a la oración: ");
                            String additionalContent = scanner.nextLine();
                            sentence += " " + additionalContent;
                            System.out.println("La nueva oración es: " + sentence);
                        }
                        case 9 -> {
                            salir = false;
                        }
                        default -> System.out.println("Opción inválida. Intente nuevamente.");
                    }
                } else {
                    sentence = scanner.nextLine();
                }
            }
        }
    }


    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
}
