package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.*/
public class Hotel4Estrellas extends Hoteles implements Interface{

    private boolean gimnasio;
    private String nombreresto;
    private int capacidadresto;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(boolean gimnasio, String nombreresto, int capacidadresto, Integer cantidadhab, Integer numerocamas, Integer cantidadpisos, Integer preciohabitacion, String nombre, String direccion, String gerente) {
        super(cantidadhab, numerocamas, cantidadpisos, preciohabitacion, nombre, direccion, gerente);
        this.gimnasio = gimnasio;
        this.nombreresto = nombreresto;
        this.capacidadresto = capacidadresto;
    }


    public boolean isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreresto() {
        return nombreresto;
    }

    public void setNombreresto(String nombreresto) {
        this.nombreresto = nombreresto;
    }

    public int getCapacidadresto() {
        return capacidadresto;
    }

    public void setCapacidadresto(int capacidadresto) {
        this.capacidadresto = capacidadresto;
    }

    @Override
    public void CalcularPrecio() {
        if (capacidadresto < 30) {
            preciohabitacion += 10;
        }
        if (capacidadresto >= 30 && capacidadresto <= 50) {
            preciohabitacion += 30;
        }
        if (capacidadresto > 50) {
            preciohabitacion += 50;
        }
        if (gimnasio) {
            preciohabitacion += 30;
        }
    }

    @Override
    public void Mostrar() {
        super.Mostrar();
        System.out.println("Restaurante: " + nombreresto);
        if (gimnasio) {
            System.out.println("Gimnasio: Si");
        } else {
            System.out.println("Gimnasio: No");
        }
        System.out.println("Precio hanitacion: "+super.preciohabitacion);
    }

}
