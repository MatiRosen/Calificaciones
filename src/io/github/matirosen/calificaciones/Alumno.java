package io.github.matirosen.calificaciones;

public class Alumno {

    private double notaPractica, notaProblemas, notaTeorica;
    private String nombre;

    private final static String ERROR_NOTA = "La nota debe estar entre 0 y 10";
    private final static double PONDERACION_PRACTICA = 0.2;
    private final static double PONDERACION_PROBLEMAS = 0.5;
    private final static double PONDERACION_TEORICA = 0.3;

    public Alumno(String nombre){
        setNombre(nombre);
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void validarNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException(ERROR_NOTA);
        }
    }

    public void setNotaProblemas(double notaProblemas) throws IllegalArgumentException {
        validarNota(notaProblemas);
        this.notaProblemas = notaProblemas;
    }

    public void setNotaTeorica(double notaTeorica) throws IllegalArgumentException {
        validarNota(notaTeorica);
        this.notaTeorica = notaTeorica;
    }

    public void setNotaPractica(double notaPractica) throws IllegalArgumentException {
        validarNota(notaPractica);
        this.notaPractica = notaPractica;
    }

    public double getNotaFinal() {
        return this.notaPractica * PONDERACION_PRACTICA +
                this.notaProblemas * PONDERACION_PROBLEMAS +
                this.notaTeorica * PONDERACION_TEORICA;
    }

    public String getNombre() {
        return this.nombre;
    }
}