package io.github.matirosen.calificaciones;

import java.util.Scanner;

public class Test {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce el nombre del alumno");
        Alumno alumno = new Alumno(scanner.nextLine());

        boolean error;
        do {
            try {
                error = false;
                System.out.println("Introduce la nota de la parte práctica");
                alumno.setNotaPractica(Double.parseDouble(scanner.nextLine()));

                System.out.println("Introduce la nota de la parte de problemas");
                alumno.setNotaProblemas(Double.parseDouble(scanner.nextLine()));

                System.out.println("Introduce la nota de la parte teórica");
                alumno.setNotaTeorica(Double.parseDouble(scanner.nextLine()));
            } catch (NumberFormatException e) {
                System.out.println("La nota debe ser un número (usando punto como separador decimal)");
                error = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                error = true;
            }
        } while (error);

        System.out.println("La nota final de " + alumno.getNombre() + " es " + alumno.getNotaFinal());
        scanner.close();
    }
}
