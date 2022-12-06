package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de 
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones. 
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de 
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier 
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro 
será. */
public class Hotel5Estrellas extends Hotel4Estrellas implements Interface{

    private int cantidadconferecncia;
    private int cantidadsuites;
    private int cantidadlimosinas;
    private String tipogimnasio;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(int cantidadconferecncia, int cantidadsuites, int cantidadlimosinas, String tipogimnasio, boolean gimnasio, String nombreresto, int capacidadresto, Integer cantidadhab, Integer numerocamas, Integer cantidadpisos, Integer preciohabitacion, String nombre, String direccion, String gerente) {
        super(gimnasio, nombreresto, capacidadresto, cantidadhab, numerocamas, cantidadpisos, preciohabitacion, nombre, direccion, gerente);
        this.cantidadconferecncia = cantidadconferecncia;
        this.cantidadsuites = cantidadsuites;
        this.cantidadlimosinas = cantidadlimosinas;
        this.tipogimnasio = tipogimnasio;
    }
   
    public int getCantidadconferecncia() {
        return cantidadconferecncia;
    }

    public void setCantidadconferecncia(int cantidadconferecncia) {
        this.cantidadconferecncia = cantidadconferecncia;
    }

    public int getCantidadsuites() {
        return cantidadsuites;
    }

    public void setCantidadsuites(int cantidadsuites) {
        this.cantidadsuites = cantidadsuites;
    }

    public int getCantidadlimosinas() {
        return cantidadlimosinas;
    }

    public void setCantidadlimosinas(int cantidadlimosinas) {
        this.cantidadlimosinas = cantidadlimosinas;
    }

    public String getTipogimnasio() {
        return tipogimnasio;
    }

    public void setTipogimnasio(String tipogimnasio) {
        this.tipogimnasio = tipogimnasio;
    }

   

    @Override
    public void CalcularPrecio() {
        if (tipogimnasio.equalsIgnoreCase("A")) {
            preciohabitacion += 50;
        }
        if (tipogimnasio.equalsIgnoreCase("B")) {
          preciohabitacion += 30;
        }
        preciohabitacion+= cantidadlimosinas*15;
    }

    @Override
    public void Mostrar() {
        super.Mostrar(); //To change body of generated methods, choose Tools | Templates.
    }
    

}
