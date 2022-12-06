package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.*/
public class Empleados extends Universidad {

    private Integer anoincorp;
    private Integer numerodespacho;

    public Empleados() {
    }

    public Empleados(Integer anoincorp, Integer numerodespacho, String nombre, String apellido, Integer DNI, String estadocivil) {
        super(nombre, apellido, DNI, estadocivil);
        this.anoincorp = anoincorp;
        this.numerodespacho = numerodespacho;
    }

    @Override
    public String toString() {
        return  super.toString()+ ", Año de Ingreso: " + anoincorp + ", Numero de Despacho: " + numerodespacho;
    }

    public Integer getAnoincorp() {
        return anoincorp;
    }

    public void setAnoincorp(Integer anoincorp) {
        this.anoincorp = anoincorp;
    }

    public Integer getNumerodespacho() {
        return numerodespacho;
    }

    public void setNumerodespacho(Integer numerodespacho) {
        this.numerodespacho = numerodespacho;
    }

    
    @Override
    public Empleados IngresoPersona() {
        super.IngresoPersona(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ingrese el año de incorporacion: ");
        anoincorp=leer.nextInt();
        System.out.println("Ingrese numero de legajo: ");
        numerodespacho=leer.nextInt();
        return new Empleados(anoincorp, numerodespacho, nombre, apellido, DNI, estadocivil);
    }
}
