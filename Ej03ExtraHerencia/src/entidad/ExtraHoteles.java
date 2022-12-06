
package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/*En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los 
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada 
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros 
cuadrados que ocupa.*/
public class ExtraHoteles extends Alojamientos{
private boolean tipohotelextra;
private double metroscuadrados;

    public ExtraHoteles() {
    }

    public ExtraHoteles(boolean tipohotelextra, double metroscuadrados, String nombre, String direccion, String gerente) {
        super(nombre, direccion, gerente);
        this.tipohotelextra = tipohotelextra;
        this.metroscuadrados = metroscuadrados;
    }

    public boolean isTipohotelextra() {
        return tipohotelextra;
    }

    public void setTipohotelextra(boolean tipohotelextra) {
        this.tipohotelextra = tipohotelextra;
    }

    public double getMetroscuadrados() {
        return metroscuadrados;
    }

    public void setMetroscuadrados(double metroscuadrados) {
        this.metroscuadrados = metroscuadrados;
    }

}
