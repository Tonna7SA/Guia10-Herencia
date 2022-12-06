package entidad;

import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/*Los alojamientos se identifican por un nombre, una dirección, 
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de 
alojamientos: Hoteles y Alojamientos Extrahoteleros.*/
public class Alojamientos implements Interface{

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private String direccion;
    private String gerente;

    public Alojamientos() {
    }

    public Alojamientos(String nombre, String direccion, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Alojamientos{" + "nombre=" + nombre + ", direccion=" + direccion + ", gerente=" + gerente + '}';
    }

    public void IngreseDatos() {
        System.out.println("Ingrese nombre del establecimiento: ");
        nombre = leer.next();
        System.out.println("Ingrese direccion del establecimiento: ");
        direccion = leer.next();
        System.out.println("Ingrese el nombre del Gerente: ");
        gerente = leer.next();
    }

    public void Mostrar() {
        System.out.println("Establecimiento: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Gerente: " + gerente);

    }

    @Override
    public void CalcularPrecio() {
    }

}
