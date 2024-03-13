/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 5.    Ambas clases (estudiante y profesor) deberán derivar de la clase persona que definirá los atributos y métodos que sean comunes a ambas. El tipo de relación entre persona, estudiante y profesor la deberás decidir en el diseño de tu aplicación.
 * <p>
 * 6.    Además definiremos una interfaz (se puede llamar GestionAcademica que deberán implementar las clases estudiante y profesor con los siguientes métodos:
 * <p>
 * ·         validarCodigo que devolverá el valor lógico indicando si el código pasado como parámetro es o no correcto.
 * <p>
 * ·         informeResultados que devolverá una cadena formateada con el informe del estudiante o profesor pasado como parámetros.
 *
 * @author manuelfdez
 * extiende de persona:
 * String dni;
 * String indentificador;
 * String nombreCompleto;
 * String correoElectronico; //hay que validar que tenga un formato correcto
 */


public class Estudiante extends Persona {

    private String fechaMatriculacion; // comprobar que esta comprendida entre fecha inicio y final de curso, el curso debe estar creado

    public Estudiante(String identificador, String nombreCompleto, String fechaMatriculacion, String dni, String correoElectronico) {
        this.dni = dni;
        this.identificador = identificador;
        this.nombreCompleto = nombreCompleto;
        this.fechaMatriculacion = fechaMatriculacion;
        this.correoElectronico = correoElectronico;
    }


    public String getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(String fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }
}
