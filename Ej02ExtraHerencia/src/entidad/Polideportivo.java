
package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o 
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.*/
public class Polideportivo extends Edificio {
private String nombre;
private Boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, Boolean techado, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTechado() {
        return techado;
    }

    public void setTechado(Boolean techado) {
        this.techado = techado;
    }

    @Override
    public void CalcularSuperficie() {
        System.out.println("Polideportivo "+nombre);
        super.CalcularSuperficie(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CalcularVolumen() {
        super.CalcularVolumen(); //To change body of generated methods, choose Tools | Templates.
    }


}
