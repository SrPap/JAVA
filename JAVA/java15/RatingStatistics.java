import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RatingStatistics {
    public static void main(String[] args) {
        try (Scanner Data = new Scanner(System.in)) {
            try {
                System.out.println("Generando calificaciones");

                System.out.print("Ingrese el número de calificaciones: ");
                int numCalificaciones = Data.nextInt();

                String[] calificaciones = new String[numCalificaciones];
                Random random = new Random();
                for (int i = 0; i < numCalificaciones; i++) {
                    calificaciones[i] = String.format("%.2f", random.nextDouble() * 12); // Calificaciones entre 0 y 12
                }

                ArrayList<Double> desaprobado = new ArrayList<>();
                ArrayList<Double> aprobado = new ArrayList<>();
                ArrayList<Double> excelente = new ArrayList<>();

                for (String calificacion : calificaciones) {
                    double cal = Double.parseDouble(calificacion);
                    if (cal < 4) {
                        desaprobado.add(cal);
                    } else if (cal < 10) {
                        aprobado.add(cal);
                    } else {
                        excelente.add(cal);
                    }
                }

                double promedioOriginal = calcularPromedio(calificaciones);
                double promedioDesaprobado = calcularPromedio(desaprobado);
                double promedioAprobado = calcularPromedio(aprobado);
                double promedioExcelente = calcularPromedio(excelente);

                System.out.println("Calificaciones originales: " + String.join(", ", calificaciones));
                System.out.println("Promedio de calificaciones originales: " + promedioOriginal);
                System.out.println("Desaprobado: " + desaprobado);
                System.out.println("Promedio de desaprobados: " + promedioDesaprobado);
                System.out.println("Aprobado: " + aprobado);
                System.out.println("Promedio de aprobados: " + promedioAprobado);
                System.out.println("Excelente: " + excelente);
                System.out.println("Promedio de excelentes: " + promedioExcelente);

            } catch (NumberFormatException e) {
                System.out.println("Error: Se ha ingresado un número no válido.");
            } catch (Exception e) {
                System.out.println("Error: Se ha producido un error.");
            }
        }
    }

    private static double calcularPromedio(String[] array) {
        double sum = 0;
        for (String s : array) {
            sum += Double.parseDouble(s);
        }
        return sum / array.length;
    }

    private static double calcularPromedio(ArrayList<Double> list) {
        if (list.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Double d : list) {
            sum += d;
        }
        return sum / list.size();
    }
}