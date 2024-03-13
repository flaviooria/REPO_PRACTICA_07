import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Curso curso = null;
        boolean salirMenu = false;

        Scanner entradaTeclado = new Scanner(System.in);

        int opcionMenu;

        do {
            System.out.println("1. Crear curso");
            System.out.println("2. Nuevo profesor");
            System.out.println("3. Nuevo estudiante");
            System.out.println("4. Actualizar nota");
            System.out.println("5. Obtener informe de profesor");
            System.out.println("6. Obtener informe de estudiante");
            System.out.println("7. Obtener informe general");
            System.out.println("8. Salir");

            opcionMenu = entradaTeclado.nextInt();

            switch (opcionMenu) {
                case 1:
                    int dia, mes, anio;
                    LocalDate fechaInicio, fechaFinal;

                    System.out.println("Crear curso");

                    System.out.println("Introduce el dia de inicio");
                    dia = entradaTeclado.nextInt();

                    System.out.println("Introduce el mes de inicio");
                    mes = entradaTeclado.nextInt();

                    System.out.println("Introduce el año de inicio");
                    anio = entradaTeclado.nextInt();

                    fechaInicio = LocalDate.of(anio, mes, dia);

                    System.out.println("Introduce el dia de final");
                    dia = entradaTeclado.nextInt();

                    System.out.println("Introduce el mes de final");
                    mes = entradaTeclado.nextInt();

                    System.out.println("Introduce el año de final");
                    anio = entradaTeclado.nextInt();

                    fechaFinal = LocalDate.of(anio, mes, dia);

                    if (fechaInicio.isBefore(fechaFinal)) {
                        curso = new Curso(fechaInicio, fechaFinal);
                        System.out.println("Curso creado correctamente");
                    } else {
                        System.out.println("la fecha final no es posterior a la inicial");
                    }
                    System.out.println();
                    break;
                case 2:
                    if (curso != null) {
                        String nombre, correo, fechaMatriculacion, dni, identificador;

                        System.out.println("Crear estudiante: ");

                        System.out.println("Ingresa nombre: ");
                        nombre = entradaTeclado.nextLine();

                        System.out.println("Ingresa correo: ");
                        correo = entradaTeclado.nextLine();

                        System.out.println("Ingresa fecha de matriculación: ");
                        fechaMatriculacion = entradaTeclado.nextLine();

                        System.out.println("Introduce el identificador del profesor");
                        identificador = entradaTeclado.nextLine();

                        System.out.println("Introduce dni: ");
                        dni = entradaTeclado.nextLine();

                        Estudiante nuevoAlumno = new Estudiante(identificador, nombre, fechaMatriculacion, dni, correo);

                        int codigoRespuesta = curso.insertaAlumno(nuevoAlumno);

                        switch (codigoRespuesta) {
                            case 0:
                                System.out.println("Alumno creado correctamente");
                                break;
                            case -2:
                                System.out.println("Alumno ya existe con el mismo identificador");
                                break;
                            case -3:
                                System.out.println("Ya no hay mas plazas disponibles");
                                break;
                        }

                    } else {
                        System.out.println("Debes de crear un curso primero.");
                    }
                    System.out.println();
                    break;
                case 8:
                    salirMenu = true;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        } while (!salirMenu);

    }
}
