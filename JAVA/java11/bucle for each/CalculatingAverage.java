import java.util.Arrays;

public class CalculatingAverage {
    public static void main(String[] args) {
       
            try {
                System.out.println("Calculando el promedio");
    
                float[] array1 = new float [20];
                int i = 0;

                for (float NUM : array1) {
                    NUM = (float) Math.round((Math.random() * 100) - 1);
                    array1[i] = NUM;
                    i++;
                }

                System.out.println("El array es = " + Arrays.toString(array1));

                int Adition = 0;

            for (float Num : array1) {
                Adition += Num;
            }

            System.out.println("La suma del array es = " + Adition);
            System.out.println("Su Promedio es = " + Adition/array1.length);

            } catch (Exception e) {
                System.out.println("Error: Se a ingresado un dato no valido.");
            }
        }}


