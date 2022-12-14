package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).*/
public class PersonalServicio extends Empleados {

    private String seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion, Integer anoincorp, Integer numerodespacho, String nombre, String apellido, Integer DNI, String estadocivil) {
        super(anoincorp, numerodespacho, nombre, apellido, DNI, estadocivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "[ Personal de Servicio ] Seccion: " + seccion + " " + super.toString();
    }

    @Override
    public PersonalServicio IngresoPersona() {
        super.IngresoPersona(); //To change body of generated methods, choose Tools | Templates.
        int opcion;
        do {
            System.out.println("Ingrese la seccion de trabajo ");
           
            
            
            System.out.println("1- Biblioteca");
            System.out.println("2- Decanato");
            System.out.println("3- Secretaria");
            System.out.println("Ingrese opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    seccion = "Biblioteca";
                    break;
                case 2:
                    seccion = "Decanato";
                    break;
                case 3:
                    seccion = "Secretaria";
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
        } while (opcion < 1 && opcion > 3);
        return new PersonalServicio(seccion, opcion, opcion, nombre, apellido, DNI, estadocivil);
    }

}
