/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *        con metodos estaticos para poderlos utilizar desde cualquier clase):
 ·         validaDNI devolverá un valor lódigo indicando ei el DNI/NIE pasado como argumento es correcto o no
 ·         validarMail devolverá un valor lódigo indicando si la cadena pasada como argumento se ajusta al patrón de un email.

 * @author manuelfdez
 */
public class Validaciones {


    public static boolean validaDNI(String dni){

        boolean documentoValidado=false; //(cambiar a false al implementar el metodo)
        if (dni.length() != 9) {

            documentoValidado=false;

            return documentoValidado;
        }

        char letra = dni.charAt(8);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        if (Character.isLetter(dni.charAt(0)) && Character.isDigit(dni.charAt(8))) {
            // NIF de formato letra + 7 dígitos + letra
            char letraCalculada = letras.charAt(Integer.parseInt(dni.substring(1, 8)) % 23);

            documentoValidado = letraCalculada == letra;

            return documentoValidado;
        }
        else if (Character.isDigit(dni.charAt(0)) && Character.isLetter(dni.charAt(8))) {
            // NIF de formato numérico de 8 dígitos y letra
            char letraCalculada = letras.charAt(Integer.parseInt(dni.substring(0, 8)) % 23);

            return letraCalculada == letra;
        }

        return documentoValidado;
    }

    public static boolean validarEmail(String correo) {
        for (int i = 0; i < correo.length(); i++) {
            if (correo.charAt(i) == '@' || correo.charAt(i) == '.') {
                return true;
            }
        }
        return false;
    }
    public static boolean validarIdentificadorProfesor(String identificador) {
        String regex = "(590|591|592)\\d{5}(INF|ING|FOL|SIA)";

        return identificador.matches(regex);
    }

}