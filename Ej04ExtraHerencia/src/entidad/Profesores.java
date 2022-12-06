package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).*/
public class Profesores extends Empleados {

    private String materia;

    public Profesores() {
    }

    public Profesores(String materia, Integer anoincorp, Integer numerodespacho, String nombre, String apellido, Integer DNI, String estadocivil) {
        super(anoincorp, numerodespacho, nombre, apellido, DNI, estadocivil);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "[ Profesor ] Materia: " + materia + " " + super.toString();
    }

    @Override
    public Profesores IngresoPersona() {
        super.IngresoPersona(); //To change body of generated methods, choose Tools | Templates.
        int opcion;
        do {
            System.out.println("Ingrese la Materia ");
            System.out.println("1- Literatura");
            System.out.println("2- Matematica");
            System.out.println("3- Fisica");
            System.out.println("Ingrese opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    materia = "Literatura";
                    break;
                case 2:
                    materia = "Matematica";
                    break;
                case 3:
                    materia = "Fisica";
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
        } while (opcion < 1 && opcion > 3);
        return new Profesores(materia, opcion, opcion, nombre, apellido, DNI, estadocivil);
    }

}
