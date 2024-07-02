import java.util.Scanner;

public class if_Complementario2 {
    public static void main(String[] args) {
    try (Scanner Data = new Scanner(System.in)) {
        System.out.println("Por favor, ingrese el precio del producto");
        int Price = Data.nextInt();
        if (Price >= 100) {
            System.out.println("Productos de 100$ o más tienen un descuento del 10%");
          int PriceDiscount = Price - Price/10;
          System.out.println("El precio actualizado es = " + PriceDiscount + "$");

        } else  {
            System.out.println("Productos de menos de 100$ no tienen descuento, debe pagar = " + Price + "$");

        } 
    }}
}
