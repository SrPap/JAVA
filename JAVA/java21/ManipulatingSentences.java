import java.util.Arrays;
import java.util.Scanner;

public class ManipulatingSentences {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Manipulando oraciones");
        boolean exit = true;
        System.out.print("Ingrese una oración: ");
        String sentence = scanner.nextLine();
        Menu(exit,sentence);

    }

    public static String resetSentence() {
        System.out.print("Ingrese una nueva oración: ");
        return scanner.nextLine();
    }

    public static void showCharacterCount(String sentence) {
        System.out.println("La oración tiene " + sentence.length() + " caracteres");
    }

    public static void showWordCount(String sentence) {
        int wordsCount = countWords(sentence);
        System.out.println("La cantidad de palabras es: " + wordsCount);
    }

    public static void showSortedWords(String sentence) {
        String[] words = sentence.split("\\s+");
        Arrays.sort(words);
        System.out.println("Palabras ordenadas alfabéticamente: " + Arrays.toString(words));
    }

    public static void showWordByPosition(String sentence) {
        String[] words = sentence.split("\\s+");
        System.out.print("Ingrese un número: ");
        int number = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea
        if (number > 0 && number <= words.length) {
            System.out.println("La palabra en la posición " + number + " es: " + words[number - 1]);
        } else {
            System.out.println("Número inválido. Intente nuevamente.");
        }
    }

    public static void searchWord(String sentence) {
        System.out.print("Ingrese una palabra para buscar: ");
        String wordSearch = scanner.nextLine();
        String[] words = sentence.split("\\s+");
        boolean find = false;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(wordSearch)) {
                System.out.println("La palabra \"" + wordSearch + "\" fue encontrada en la posición " + (i + 1) + ".");
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("La palabra \"" + wordSearch + "\" no fue encontrada en la oración.");
        }
    }

    public static String modifyWord(String sentence) {
        System.out.print("Ingrese la palabra que desea modificar: ");
        String oldWord = scanner.nextLine();
        System.out.print("Ingrese la nueva palabra: ");
        String newWord = scanner.nextLine();
        return sentence.replace(oldWord, newWord);
    }

    public static String addContent(String sentence) {
        System.out.print("Ingrese el contenido adicional para agregar a la oración: ");
        String additionalContent = scanner.nextLine();
        return sentence + " " + additionalContent;
    }

    public static void showWordsInReverseOrder(String sentence) {
        String[] words = sentence.split("\\s+");
        System.out.print("Palabras en orden inverso: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static void Menu(boolean exit, String sentence) {
            
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
            System.out.println("9. Mostrar palabras en orden inverso.");
            System.out.println("10. Salir.");
            int option = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (option) {
                case 1 -> sentence = resetSentence();
                case 2 -> showCharacterCount(sentence);
                case 3 -> showWordCount(sentence);
                case 4 -> showSortedWords(sentence);
                case 5 -> showWordByPosition(sentence);
                case 6 -> searchWord(sentence);
                case 7 -> sentence = modifyWord(sentence);
                case 8 -> sentence = addContent(sentence);
                case 9 -> showWordsInReverseOrder(sentence);
                case 10 -> exit = false;
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
        } else {
            sentence = scanner.nextLine();
        }
        
        if (exit) {
        Menu(exit,sentence);
        } 
            

    }
}