package entidad;

import java.util.Objects;

/**
 *
 * @author Tonna/SA FR34K
 */
/*Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de 
Pisos, Precio de Habitaciones. */
public class Hoteles extends Alojamientos implements Interface{

    protected Integer cantidadhab;
    protected Integer numerocamas;
    protected Integer cantidadpisos;
    protected Integer preciohabitacion;

    public Hoteles() {
        preciohabitacion = 50;
    
    }

    public Hoteles(Integer cantidadhab, Integer numerocamas, Integer cantidadpisos, Integer preciohabitacion, String nombre, String direccion, String gerente) {
        super(nombre, direccion, gerente);
        this.cantidadhab = cantidadhab;
        this.numerocamas = numerocamas;
        this.cantidadpisos = cantidadpisos;
        this.preciohabitacion = preciohabitacion;
    }

    public Integer getCantidadhab() {
        return cantidadhab;
    }

    public void setCantidadhab(Integer cantidadhab) {
        this.cantidadhab = cantidadhab;
    }

    public Integer getNumerocamas() {
        return numerocamas;
    }

    public void setNumerocamas(Integer numerocamas) {
        this.numerocamas = numerocamas;
    }

    public Integer getCantidadpisos() {
        return cantidadpisos;
    }

    public void setCantidadpisos(Integer cantidadpisos) {
        this.cantidadpisos = cantidadpisos;
    }

    public Integer getPreciohabitacion() {
        return preciohabitacion;
    }

    public void setPreciohabitacion(Integer preciohabitacion) {
        this.preciohabitacion = preciohabitacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.preciohabitacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hoteles other = (Hoteles) obj;
        if (!Objects.equals(this.preciohabitacion, other.preciohabitacion)) {
            return false;
        }
        return true;
    }

    @Override
    public void CalcularPrecio() {
        preciohabitacion += (cantidadhab*numerocamas)*cantidadpisos;
    }

}
