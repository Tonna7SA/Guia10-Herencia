package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.*/
public class Estudiantes extends Universidad {

    private String curso;

    public Estudiantes() {
    }

    public Estudiantes(String curso, String nombre, String apellido, Integer DNI, String estadocivil) {
        super(nombre, apellido, DNI, estadocivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "[ Estudiante ] Curso: "+curso+" "+super.toString(); 
    }


    @Override
    public Estudiantes IngresoPersona() {
        int opcion;
        super.IngresoPersona();
        do {
            System.out.println("Ingrese el Curso ");
            System.out.println("1- Ingenieria");
            System.out.println("2- Arquitectura");
            System.out.println("3- Medicina");
            System.out.println("Ingrese opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    curso = "Ingenieria";
                    break;
                case 2:
                    curso = "Arquitectura";
                    break;
                case 3:
                    curso = "Medicina";
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
        } while (opcion < 1 && opcion > 3);
        return new Estudiantes(curso, nombre, apellido, DNI, estadocivil);
    }

}
