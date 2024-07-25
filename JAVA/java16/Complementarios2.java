import java.util.Scanner;


public class Complementarios2{
    public static void main(String[] args) {
        try (Scanner objeto = new Scanner(System.in)) {
System.out.print("Introduce el tamaño del cuadrado (N): ");

int length = objeto.nextInt();

if (length <= 0) {
System.out.println("El tamaño del cuadrado debe ser un número positivo.");
return;
}
for (int x=0 ; x<length ; x++){
for (int y = 0; y < length; y++){

if(
x==0 ||
x == length-1 ||
y== 0 ||
y== length-1
){
System.out.print("* ");
} else {
System.out.print(" "); 
}

}
System.out.println();
}   }
    
    
    }}