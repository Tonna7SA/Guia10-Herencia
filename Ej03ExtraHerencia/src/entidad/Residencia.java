package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/* Para las residencias se indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no 
campo deportivo.*/
public class Residencia extends ExtraHoteles implements Interface {

    private int cantidadhabitaciones;
    private boolean descuentogremios;
    private boolean campodepor;

    public Residencia() {
    }

    public Residencia(int cantidadhabitaciones, boolean descuentogremios, boolean campodepor, boolean tipohotelextra, double metroscuadrados, String nombre, String direccion, String gerente) {
        super(tipohotelextra, metroscuadrados, nombre, direccion, gerente);
        this.cantidadhabitaciones = cantidadhabitaciones;
        this.descuentogremios = descuentogremios;
        this.campodepor = campodepor;
    }

    public int getCantidadhabitaciones() {
        return cantidadhabitaciones;
    }

    public void setCantidadhabitaciones(int cantidadhabitaciones) {
        this.cantidadhabitaciones = cantidadhabitaciones;
    }

    public boolean isDescuentogremios() {
        return descuentogremios;
    }

    public void setDescuentogremios(boolean descuentogremios) {
        this.descuentogremios = descuentogremios;
    }

    public boolean isCampodepor() {
        return campodepor;
    }

    public void setCampodepor(boolean campodepor) {
        this.campodepor = campodepor;
    }

    @Override
    public void CalcularPrecio() {

    }
}
