package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected String consumo;
    protected int peso;

    public Electrodomestico() {
        this.precio = 1000.0;
    }

    public Electrodomestico(double precio, String color, String consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
    
    public void PrecioFinal() {
        switch (getConsumo()) {
            case "A":
                setPrecio(getPrecio() + 1000);
                break;
            case "B":
                setPrecio(getPrecio() + 800);
                break;
            case "C":
                setPrecio(getPrecio() + 600);
                break;
            case "D":
                setPrecio(getPrecio() + 500);
                break;
            case "E":
                setPrecio(getPrecio() + 300);
                break;
            case "F":
                setPrecio(getPrecio() + 100);
                break;
        }
        if ((getPeso() >= 1) && (getPeso() < 20)) {
            setPrecio(getPrecio() + 100);

        }
        if (getPeso() >= 20 && getPeso() < 49) {
            setPrecio(getPrecio() + 500);
        }
        if (getPeso() >= 50 && getPeso() < 79) {
            setPrecio(getPrecio() + 800);
        }
        if (getPeso() >= 80) {
            setPrecio(getPrecio() + 1000);
        }
    }
}
