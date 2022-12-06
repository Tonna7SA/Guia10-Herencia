package ej04extraherencia;

import entidad.Empleados;
import entidad.Estudiantes;
import entidad.PersonalServicio;
import entidad.Profesores;
import entidad.Universidad;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 *
 */

/*4. Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:

El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.*/
public class Ej04ExtraHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Universidad> perso = new ArrayList();
        PersonalServicio ps1 = new PersonalServicio();

        Profesores p1 = new Profesores();
        Estudiantes e1 = new Estudiantes();
        int opcion;
        do {
            System.out.println("Universidad");
            System.out.println("-----------");
            System.out.println("1- Ingrese Personal");
            System.out.println("2- Ingrese Alumno");
            System.out.println("3- Modificar Datos");
            System.out.println("4- Mostrar Datos");
            System.out.println("5- Salir");
            System.out.println("Ingrese Opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    int opcion1;
                    do {
                        System.out.println("Personal: ");
                        System.out.println("1- Profesorado");
                        System.out.println("2- Servicios");
                        System.out.println("Ingrese su opcion: ");
                        opcion1 = leer.nextInt();
                        switch (opcion1) {
                            case 1:
                                p1.IngresoPersona();
                                perso.add(p1);
                                opcion1 = 3;
                                break;
                            case 2:
                                ps1.IngresoPersona();
                                perso.add(ps1);
                                opcion1 = 3;
                                break;
                            default:
                                System.out.println("Opcion invalida, intente nuevamente...");

                        }
                    } while (opcion1 > 1 && opcion1 < 2);
                    break;
                case 2:
                    e1.IngresoPersona();
                    perso.add(e1);
                    break;
                case 3:
                    String opcion2;
                    int opcion3;
                    do {
                        System.out.println("Modificar Datos");
                        System.out.println("1- Cambio Estado Civil");
                        System.out.println("2- Cambio Numero de Despacho de Empleado");
                        System.out.println("3- Cambio Curso de Alumno");
                        System.out.println("4- Cambio Materia de Profesor");
                        System.out.println("5- Cambio Seccion de Personal de Servicio");
                        System.out.println("Ingrese opcion: ");
                        opcion3 = leer.nextInt();
                        String nombre;
                        String apellido;
                        switch (opcion3) {
                            case 1:
                                System.out.println("Ingrese nombre y apellido");
                                System.out.print("Nombre: ");
                                nombre = leer.next();
                                System.out.print("Apellido: ");
                                apellido = leer.next();
                                int a = 0;
                                for (Universidad aux : perso) {
                                    if (aux.getNombre().equalsIgnoreCase(nombre) && aux.getApellido().equalsIgnoreCase(apellido)) {
                                        int opc;
                                        a++;
                                        do {
                                            System.out.println("Ingrese el nuevo Estado Civil");
                                            System.out.println("1- Soltero/a");
                                            System.out.println("2- Casado/a");
                                            System.out.println("3- Separado/a");
                                            System.out.println("4- Viudo/a");
                                            System.out.println("Ingrese su opcion: ");
                                            opc = leer.nextInt();
                                            switch (opcion) {
                                                case 1:
                                                    aux.setEstadocivil("Soltero/a");
                                                    break;
                                                case 2:
                                                    aux.setEstadocivil("Casado/a");
                                                    break;
                                                case 3:
                                                    aux.setEstadocivil("Separado/a");
                                                    break;
                                                case 4:
                                                    aux.setEstadocivil("Viudo/a");
                                                    break;
                                                default:
                                                    System.out.println("Opcion invalida");
                                                    System.out.println("Intente nuevamente...");
                                            }
                                        } while (opc < 1 && opc > 3);
                                    }
                                }
                                if (a == 0) {
                                    System.out.println("No encontrado");
                                } else {
                                    System.out.println("Cambiado");
                                }
                                break;
                            case 2:
                                System.out.println("Ingrese nombre y apellido");
                                System.out.print("Nombre: ");
                                nombre = leer.next();
                                System.out.print("Apellido: ");
                                apellido = leer.next();
                                for (Universidad aux : perso) {
                                    if (aux instanceof Empleados) {
                                        if (aux.getNombre().equalsIgnoreCase(nombre) && aux.getApellido().equalsIgnoreCase(apellido)) {
                                            System.out.println("Ingrese el nuevo numero de Despacho: ");
                                            int despacho = leer.nextInt();
                                            ((Empleados) aux).setNumerodespacho(despacho);
                                        }
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Ingrese nombre y apellido");
                                System.out.print("Nombre: ");
                                nombre = leer.next();
                                System.out.print("Apellido: ");
                                apellido = leer.next();
                                for (Universidad aux : perso) {
                                    if (aux instanceof Estudiantes) {
                                        if (aux.getNombre().equalsIgnoreCase(nombre) && aux.getApellido().equalsIgnoreCase(apellido)) {
                                            int opc1;
                                            do {
                                                System.out.println("Ingrese el Nuevo Curso ");
                                                System.out.println("1- Ingenieria");
                                                System.out.println("2- Arquitectura");
                                                System.out.println("3- Medicina");
                                                System.out.println("Ingrese opcion: ");
                                                opc1 = leer.nextInt();
                                                switch (opc1) {
                                                    case 1:
                                                        ((Estudiantes) aux).setCurso("Ingenieria");
                                                        break;
                                                    case 2:
                                                        ((Estudiantes) aux).setCurso("Arquitectura");
                                                        break;
                                                    case 3:
                                                        ((Estudiantes) aux).setCurso("Medicina");
                                                        break;
                                                    default:
                                                        System.out.println("Opcion Invalida");
                                                }
                                            } while (opc1 < 1 && opc1 > 3);
                                        }
                                    }
                                }
                                break;

                            case 4:
                                System.out.println("Ingrese nombre y apellido");
                                System.out.print("Nombre: ");
                                nombre = leer.next();
                                System.out.print("Apellido: ");
                                apellido = leer.next();
                                for (Universidad aux : perso) {
                                    if (aux instanceof Profesores) {
                                        if (aux.getNombre().equalsIgnoreCase(nombre) && aux.getApellido().equalsIgnoreCase(apellido)) {
                                            int op1;
                                            do {
                                                System.out.println("Ingrese la nueva Materia ");
                                                System.out.println("1- Literatura");
                                                System.out.println("2- Matematica");
                                                System.out.println("3- Fisica");
                                                System.out.println("Ingrese opcion: ");
                                                op1 = leer.nextInt();
                                                switch (op1) {
                                                    case 1:
                                                        ((Profesores) aux).setMateria("Literatura");
                                                        break;
                                                    case 2:
                                                        ((Profesores) aux).setMateria("Matematica");
                                                        break;
                                                    case 3:
                                                        ((Profesores) aux).setMateria("Fisica");
                                                        break;
                                                    default:
                                                        System.out.println("Opcion Invalida");
                                                }
                                            } while (op1 < 1 && op1 > 3);
                                        }
                                    }
                                }
                                break;

                            case 5:
                                System.out.println("Ingrese nombre y apellido");
                                System.out.print("Nombre: ");
                                nombre = leer.next();
                                System.out.print("Apellido: ");
                                apellido = leer.next();
                                for (Universidad aux : perso) {
                                    if (aux instanceof PersonalServicio) {
                                        if (aux.getNombre().equalsIgnoreCase(nombre) && aux.getApellido().equalsIgnoreCase(apellido)) {
                                            int op2;
                                            do {
                                                System.out.println("Ingrese la seccion de trabajo ");
                                                System.out.println("1- Biblioteca");
                                                System.out.println("2- Decanato");
                                                System.out.println("3- Secretaria");
                                                System.out.println("Ingrese opcion: ");
                                                opcion = leer.nextInt();
                                                switch (opcion) {
                                                    case 1:
                                                        ((PersonalServicio) aux).setSeccion("Biblioteca");
                                                        break;
                                                    case 2:
                                                        ((PersonalServicio) aux).setSeccion("Decanato");
                                                        break;
                                                    case 3:
                                                        ((PersonalServicio) aux).setSeccion("Secretaria");
                                                        break;
                                                    default:
                                                        System.out.println("Opcion Invalida, intente nuevamente");
                                                }
                                            } while (opcion < 1 && opcion > 3);
                                        }
                                    }
                                }
                                break;
                            default:
                                System.out.println("Opcion invalida, intente nuevamente");
                        }
                        System.out.println("Desea Cambiar otra persona (S/N)");
                        opcion2 = leer.next();
                    } while (opcion2.equalsIgnoreCase("s"));
                    break;
                case 4:
                    for (Universidad aux : perso) {
                        System.out.println(aux);
                    }
                    break;
                case 5:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Opcion Invalida, intente nuevamente...");
            }
        } while (opcion != 5);
    }
}
