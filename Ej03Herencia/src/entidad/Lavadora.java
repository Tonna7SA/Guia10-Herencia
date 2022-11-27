package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, String consumo, int peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public void PrecioFinal() {
        super.PrecioFinal(); //To change body of generated methods, choose Tools | Templates.
        if (getCarga() > 30) {
            setPrecio(getPrecio() + 500.0);
        }
    }

}
