import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {
       
            try {
                System.out.println("Ordenar en forma descendente");
                int[] array1 = new int[10];

                int x = 0;
                for (Object Num : array1) {
                    array1 [x] = (int) (Math.random() * 100);
                    Num = array1 [x];
                    System.out.println((x+1) + "." + Num);
                    x++;
                }
                System.out.println("El array es = " + Arrays.toString(array1));

                Arrays.sort(array1);
                int length = array1.length;
                for (int i = 0; i < length / 2; i++) {
                  int CurrentNum = array1[i];
                  array1[i] = array1[length - 1 - i];
                  array1[length - 1 - i] = CurrentNum;}

                 System.out.println("El array ordenado es = " + Arrays.toString(array1));

            } catch (Exception e) {
                System.out.println("Error: Se a ingresado un dato no valido.");
            }
        }}
