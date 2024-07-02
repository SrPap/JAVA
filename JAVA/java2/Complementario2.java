import java.util.Scanner;

public class Complementario2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa la base del rectángulo: ");
        double baseRectangulo = scanner.nextDouble();
        
        System.out.print("Por favor, ingresa la altura del rectángulo: ");
        double alturaRectangulo = scanner.nextDouble();
        
        double perimetro = 2 * baseRectangulo + 2 * alturaRectangulo;
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        
        double area = baseRectangulo * alturaRectangulo;
                System.out.println("El área del rectángulo es: " + area);
        
    }
}