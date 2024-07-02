import java.util.Scanner;

public class if_Complementario3 {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        System.out.println("Por favor, ingrese un numero");
        int Age = Data.nextInt();

        if (Age < 18) {
            System.out.println("Eres menor de edad");

        } else  if (Age <= 64 & Age >= 18) {
            System.out.println("Eres adulto");

        } else  if (Age >= 65 & Age <= 100) {
            System.out.println("Eres un adulto mayor");

        } if (Age <= 0 | Age >= 101) {
            System.out.println("Edad no valida");

        }
    }}
}