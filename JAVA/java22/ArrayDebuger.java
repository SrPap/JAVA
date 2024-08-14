public class ArrayDebuger {

    public static void main(String[] args) {
        int[] numeros = {3, 7, 12, 5, 9, 2, 14};

        int Result = Suma(numeros);
        System.out.println("La suma de todos los números en el array es: " + Result);

        Result = 2;


        System.out.println("La suma de todos los números en el array es: " + Result);
    }


    public static int Suma(int[] Array) {
        int suma = 0;
        for (int i = 0; i < Array.length; i++) {
            suma += Array[i];
        }
        return suma;
    }
}

