
public class RandomNumbers {
     public static void main(String[] args) {
        try {
            System.out.println("Generando números aleatorios");
            
            double randomNum = Math.random();
            int Number = (int) (355 * randomNum) + 1;

            double roundNum = Math.floor(Number);
            System.out.println("el numero aleatorio es = " + roundNum);

        } catch (Exception e) {
            System.out.println("Error: Se detectó un valor inválido ingresado por el teclado.");

        }
}
}