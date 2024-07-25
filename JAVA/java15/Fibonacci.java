public class Fibonacci {
    public static void main(String[] args) {
        int length = 8; 
        int dataA = 0, dataB = 1;
        int i = 0;

        System.out.println("Los primeros " + length + " términos de la serie de Fibonacci son:");
        
        while (i < length) {
            if (i <= 1) {
                System.out.println(i); 
            } else {
                int next = dataA + dataB; 
                System.out.println(next);
                dataA = dataB; 
                dataB = next; 
            }
            i++;
        }
    }
}
