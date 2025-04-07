package Semana2;
import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        if (edad > 0) {
            this.edad = edad;
        } else {
            this.edad = 1; 
            System.out.println("La edad debe ser mayor que 0. Se establece en 1.");
        }
        if (promedio >= 0 && promedio <= 20) {
            this.promedio = promedio;
        } else {
            this.promedio = 0; 
            System.out.println("El promedio debe estar entre 0 y 20. Se establece en 0.");
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Promedio: " + this.promedio);
    }

    public void actualizarPromedio(double nuevoPromedio) {
        if (nuevoPromedio >= 0 && nuevoPromedio <= 20) {
            this.promedio = nuevoPromedio;
        } else {
            System.out.println("El promedio debe estar entre 0 y 20.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        int edad = obtenerEdadValida(scanner);

        System.out.print("Ingrese su promedio (entre 0 y 20): ");
        double promedio = obtenerPromedioValido(scanner);

        Estudiante estudiante = new Estudiante(nombre, edad, promedio);
        estudiante.mostrarDatos();

        System.out.print("Ingrese un nuevo promedio (entre 0 y 20): ");
        double nuevoPromedio = obtenerPromedioValido(scanner);
        estudiante.actualizarPromedio(nuevoPromedio);
        estudiante.mostrarDatos();
    }

    private static int obtenerEdadValida(Scanner scanner) {
        while (true) {
            System.out.print("Ingrese su edad: ");
            String entrada = scanner.nextLine();
            if (esNumeroEntero(entrada)) {
                int edad = Integer.parseInt(entrada);
                if (edad > 0) {
                    return edad;
                } else {
                    System.out.println("La edad debe ser mayor que 0.");
                }
            } else {
                System.out.println("Por favor, ingrese un número entero válido.");
            }
        }
    }

    private static double obtenerPromedioValido(Scanner scanner) {
        while (true) {
            String entrada = scanner.nextLine();
            if (esNumeroDecimal(entrada)) {
                double promedio = Double.parseDouble(entrada);
                if (promedio >= 0 && promedio <= 20) {
                    return promedio;
                } else {
                    System.out.println("El promedio debe estar entre 0 y 20.");
                }
            } else {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
    }

    private static boolean esNumeroEntero(String entrada) {
        try {
            Integer.parseInt(entrada);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean esNumeroDecimal(String entrada) {
        try {
            Double.parseDouble(entrada);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
