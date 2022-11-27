package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT, double precio, String color, String consumo, int peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public void PrecioFinal() {
        super.PrecioFinal(); //To change body of generated methods, choose Tools | Templates.
        if (getResolucion() > 40) {
            setPrecio((getPrecio() * 0.3) + getPrecio());
        }
        if (isTDT()) {
            setPrecio((getPrecio() + 500));
        }
    }

}
