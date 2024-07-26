import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


class Students {
    String Name;
    double Grade;

    Students(String Name, double Grade) {
        this.Name = Name;
        this.Grade = Grade;
    }

    @Override
    public String toString() {
        return "Nombre: " + Name + ", Nota: " + Grade;
    }
}


public class StudentRegistration {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Registro de alumnos");
            boolean Exit = true;
            ArrayList<Students> students = new ArrayList<>();


            while (Exit) {
                    System.out.println("MENU");
                    System.out.println("1. Registrar alumno.");
                    System.out.println("2. Mostrar todos los alumnos.");
                    System.out.println("3. Mostrar promedio de notas.");
                    System.out.println("4. Buscar alumno por nombre.");
                    System.out.println("5. Modificar nota por nombre.");
                    System.out.println("6. Eliminar alumno por nombre.");
                    System.out.println("7. Salir.");
                    try {
                int opcion = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcion) {
                    case 1 -> {
                        String Name = "";
                        double Grade = -1.0;

                        while (Name.isEmpty()) {
                            System.out.print("Ingrese el nombre del alumno: ");
                            Name = scanner.nextLine().trim();
                            if (Name.isEmpty()) {
                                System.out.println("Error: El nombre no puede estar vacío. Intente nuevamente.");
                            }
                        }

                        boolean notaValida = false;
                        while (!notaValida) {
                            System.out.print("Ingrese la nota del alumno (0.00 - 10.00): ");
                            try {
                                Grade = scanner.nextDouble();
                                scanner.nextLine();
                                if (Grade >= 0.0 && Grade <= 10.0) {
                                    notaValida = true;
                                } else {
                                    System.out.println("Error: La nota debe estar entre 0.00 y 10.00. Intente nuevamente.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Error: Entrada no válida. Intente nuevamente.");
                                scanner.nextLine(); 
                            }
                        }

                        students.add(new Students(Name, Grade));
                        System.out.println("Alumno registrado con éxito.");
                    }
                    case 2 -> {
                        if (students.isEmpty()) {
                            System.out.println("No hay alumnos registrados.");
                        } else {
                            System.out.println("Lista de alumnos:");
                            for (Students student : students) {
                                System.out.println(student);
                            }
                        }
                    }
                    case 3 -> {
                        if (students.isEmpty()) {
                            System.out.println("No hay alumnos registrados.");
                        } else {
                            double suma = 0;
                            for (Students alumno : students) {
                                suma += alumno.Grade;
                            }
                            double promedio = suma / students.size();
                            System.out.println("El promedio de notas es: " + promedio);
                        }
                    }
                    case 4 -> {
                        System.out.print("Ingrese el nombre del alumno a buscar: ");
                        String nombre = scanner.nextLine().trim();
                        boolean encontrado = false;
                        for (Students alumno : students) {
                            if (alumno.Name.equalsIgnoreCase(nombre)) {
                                System.out.println("Nota de " + nombre + ": " + alumno.Grade);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Alumno no encontrado.");
                        }
                    }
                    case 5 -> {
                        System.out.print("Ingrese el nombre del alumno a modificar: ");
                        String nombre = scanner.nextLine().trim();
                        boolean encontrado = false;
                        for (Students alumno : students) {
                            if (alumno.Name.equalsIgnoreCase(nombre)) {
                                double nuevaNota = -1.0;
                                boolean notaValida = false;
                                while (!notaValida) {
                                    System.out.print("Ingrese la nueva nota (0.00 - 10.00): ");
                                    try {
                                        nuevaNota = scanner.nextDouble();
                                        scanner.nextLine(); 
                                        if (nuevaNota >= 0.0 && nuevaNota <= 10.0) {
                                            notaValida = true;
                                        } else {
                                            System.out.println("Error: La nota debe estar entre 0.00 y 10.00. Intente nuevamente.");
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("Error: Entrada no válida. Intente nuevamente.");
                                        scanner.nextLine();
                                    }
                                }
                                alumno.Grade = nuevaNota;
                                System.out.println("Nota modificada con éxito.");
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Alumno no encontrado.");
                        }
                    }
                    case 6 -> {
                        System.out.print("Ingrese el nombre del alumno a eliminar: ");
                        String Name = scanner.nextLine().trim();
                        boolean Find = false;
                        for (int i = 0; i < students.size(); i++) {
                            if (students.get(i).Name.equalsIgnoreCase(Name)) {
                                students.remove(i);
                                System.out.println("Alumno eliminado con éxito.");
                                Find = true;
                                break;
                            }
                        }
                        if (!Find) {
                            System.out.println("Alumno no encontrado.");
                        }
                    }
                    case 7 -> {
                        Exit = false;
                        System.out.println("Saliendo del programa.");
                    }
                    default -> System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Intente nuevamente.");
                scanner.nextLine(); 
            }
            }
        }
    }


}
