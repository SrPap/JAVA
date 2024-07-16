import java.util.Scanner;


public class While {
    public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Menú interactivo con while");
    
                short Option; 
                do { 

                System.out.println("1.Comprar producto.");
                System.out.println("2.Realizar devolución.");
                System.out.println("3.Ver mis pedidos.");
                System.out.println("4.Preguntas frecuentes.");
                System.out.println("5.Salir.");

                System.out.print("Elija una de las opciones = ");

                Option = Data.nextShort(); 
                switch (Option) {
                        case 1 -> {
                            System.out.println("Se eligio la opcion Comprar producto " + Option);
                        }
                        case 2 -> {
                            System.out.println("Se eligio la opcion Realizar devolución " + Option);
                        }
                        case 3 -> {
                            System.out.println("Se eligio la opcion Ver mis pedidos " + Option);
                        }
                        case 4 -> {
                            System.out.println("Se eligio la opcion Preguntas frecuentes " + Option);
                        }
                        case 5 -> {
                            System.out.println("Se eligio la opcion Salir " + Option);
                        }
                    default ->  System.out.println("Valor de entrada no valido = " + Option);
                    
                }
                System.out.println("Se eligio la opcion = " + Option);
                } while (Option != 5);

                
      
                System.out.println("Gracias");
    
            } catch (Exception e) {
                System.out.println("Error: Se a ingresado un dato no valido.");
            }
        }}}
 