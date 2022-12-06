
package entidad;

import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/*Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase 
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico. */
public abstract class Edificio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected double ancho;
    protected double alto;
    protected double largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void CalcularSuperficie(){
        double superficie = ancho*largo;
        System.out.println("Superficie = "+superficie+" mts2");
        
    }
    public void CalcularVolumen(){
        double volumen= (ancho*largo)*alto;
        System.out.println("Volumen = "+volumen+" mts3");
    }
}
