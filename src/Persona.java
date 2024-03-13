/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manuelfdez

 */
public class Persona {

    String dni;
    String identificador;
    String nombreCompleto;
    String correoElectronico; //hay que validar que tenga un formato correcto

    public String getDni() {
        return dni;
    }

    public String getIndentificador() {
        return identificador;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setIndentificador(String indentificador) {
        this.identificador = indentificador;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }


}
