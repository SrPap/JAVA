
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers2 {

public static void main(String[] args){
    try (Scanner objeto = new Scanner(System.in)) {
        System.out.print("Ingrese la cantidad de números primos que desea obtener: ");
        int cantidadPrimos = objeto.nextInt();
        
ArrayList<Integer> GrupoDeprimos = new ArrayList<>();

int numeroActual=2;
while (GrupoDeprimos.size()<cantidadPrimos) {
    
    if( esPrimo(numeroActual) ){ 
        GrupoDeprimos.add(numeroActual);
    }

    numeroActual++;
}

System.out.println("Los primeros " + cantidadPrimos + " números primos son: " + GrupoDeprimos);
    }
}

public static boolean esPrimo(int numero){
if(numero<=1){
return false;
}

for(int i=2; i<=Math.sqrt(numero);i++){
if(numero % i == 0){
return false;
}}
 return true;
}}