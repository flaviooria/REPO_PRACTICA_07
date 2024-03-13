/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.time.LocalDate;

/**
 * @author manuelfdez
 */
/*1.    La clase Curso nos servirá para mantener las notas de un curso de un grupo de alumnos
(se limitará a un máximo que estará definido en la clase como un valor constante MAX_ALUMNOS que se fijará a 100)
y de un conjunto de asignaturas que para todos los alumnos será el mismo (definido en la constante NUM_ASIGNATURAS que se fijará a 7).
Las notas no tendrán decimales y tomarán valores entre 0 y 10. Datos del curso:

·         Nombre del curso (valor constante que tendrá el valor “DAM 1 E-Learning”.
·         Fecha inicial del curso.
·         Fecha final del curso (no puede ser anterior a la inicial).
·         Relación de alumnos (hasta un máximo de 100).
·         Relación de profesores que imparten las asignaturas.
·         Notas de las 7 asignaturas para todos los alumnos registrados en el curso.
·         Número de alumnos matriculados (se usará para saber dónde almacenar un nuevo alumno cuando se quiera añadir uno nuevo).

Aunque el ejercicio se basa en entidades del mundo académico se hacen algunas simplificaciones que difieren de la vida real:

·         Todos los alumnos cursan todas las asignaturas.
·         Cada profesor imparte una sola asignatura.
*/
public class Curso {

    private static final String NOMBRECURSO = "DAM 1 E-Learning";
    private static final int MAX_ALUMNOS = 100;
    private static final int NUM_ASIGNATURAS = 7;
    private static int numeroAlumnosMatriculados; //numero de alumnos actuales
    private final LocalDate fechaInicio;
    private final LocalDate fechaFinal;

    private final Estudiante[] relacionAlumnos = new Estudiante[MAX_ALUMNOS];

    private final Profesor[] relacionProfesores = new Profesor[NUM_ASIGNATURAS];

    public static int getNumeroAlumnosMatriculados() {
        return numeroAlumnosMatriculados;
    }

    public static void setNumeroAlumnosMatriculados(int numeroAlumnosMatriculados) {
        Curso.numeroAlumnosMatriculados = numeroAlumnosMatriculados;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public Estudiante[] getRelacionAlumnos() {
        return relacionAlumnos;
    }

    public Profesor[] getRelacionProfesores() {
        return relacionProfesores;
    }

    public Curso(LocalDate fechaInicio, LocalDate fechaFinal) {
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    @Override
    public String toString() {
        return Curso.NOMBRECURSO;
    }

    // Otros métodos
    public Estudiante buscaAlumno(String identificador) {
        for (int i = 0; i < this.relacionAlumnos.length; i++) {
            Estudiante alumno = this.relacionAlumnos[i];

            if (alumno.getIndentificador().equals(identificador)) {
                return alumno;
            }

        }
        return null;
    }

    public int insertaAlumno(Estudiante alumno) {

        boolean listaLlena = true;

        for (int i = 0; i < this.relacionAlumnos.length; i++) {
            if (this.relacionAlumnos[i] == null) {
                listaLlena = false;
                break;
            }
        }

        if (listaLlena) {
            return -3;
        }


        for (int i = 0; i < this.relacionAlumnos.length; i++) {
            Estudiante alumnoEncontrado = this.relacionAlumnos[i];

            if (alumnoEncontrado == null) {
                this.relacionAlumnos[i] = alumno;
                return 0;
            } else {
                if (alumnoEncontrado.getIndentificador().equals(alumno.getIndentificador())) {
                    return -2;
                }
            }
        }

        return -3;
    }
}


