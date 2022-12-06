
package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/*Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños 
disponibles y si posee o no un restaurante dentro de las instalaciones.*/
public class Camping extends ExtraHoteles implements Interface{
private int maxcarpas;
private int cantbanos;
private boolean restorante;

    public Camping() {
    }

    public Camping(int maxcarpas, int cantbanos, boolean restorante, boolean tipohotelextra, double metroscuadrados, String nombre, String direccion, String gerente) {
        super(tipohotelextra, metroscuadrados, nombre, direccion, gerente);
        this.maxcarpas = maxcarpas;
        this.cantbanos = cantbanos;
        this.restorante = restorante;
    }

    public int getMaxcarpas() {
        return maxcarpas;
    }

    public void setMaxcarpas(int maxcarpas) {
        this.maxcarpas = maxcarpas;
    }

    public int getCantbanos() {
        return cantbanos;
    }

    public void setCantbanos(int cantbanos) {
        this.cantbanos = cantbanos;
    }

    public boolean isRestorante() {
        return restorante;
    }

    public void setRestorante(boolean restorante) {
        this.restorante = restorante;
    }

    @Override
    public void CalcularPrecio() {
        
    }

}
