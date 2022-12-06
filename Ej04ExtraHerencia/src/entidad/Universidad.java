package entidad;

import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.*/
public abstract class Universidad {

    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String nombre;
    protected String apellido;
    protected Integer DNI;
    protected String estadocivil;

    public Universidad() {
    }

    public Universidad(String nombre, String apellido, Integer DNI, String estadocivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.estadocivil = estadocivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    @Override
    public String toString() {
        return " Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + DNI + ", Estado Civil: " + estadocivil;
    }
    
    public Universidad IngresoPersona() {
        System.out.println("Ingrese el nombre: ");
        nombre = leer.next();
        System.out.println("Ingrese el apellido: ");
        apellido = leer.next();
        System.out.println("Ingrese DNI: ");
        DNI = leer.nextInt();
        int opcion;
        do {
            System.out.println("Estado Civil");
            System.out.println("------------");
            System.out.println("1- Soltero/a");
            System.out.println("2- Casado/a");
            System.out.println("3- Separado/a");
            System.out.println("4- Viudo/a");
            System.out.println("Ingrese su opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    estadocivil = "Soltero/a";
                    break;
                case 2:
                    estadocivil = "Casado/a";
                    break;
                case 3:
                    estadocivil = "Separado/a";
                    break;
                case 4:
                    estadocivil = "Viudo/a";
                    break;
                default:
                    System.out.println("Opcion invalida");
                    System.out.println("Intente nuevamente...");
            }
        } while (opcion < 1 && opcion > 4);
        return new Universidad() {};
    }
}
