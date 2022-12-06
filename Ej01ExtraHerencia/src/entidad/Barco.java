package entidad;

import java.util.Date;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• Potencia en CV para barcos a motor.*/
public class Barco extends Amarre {

    private int CV;

    public Barco() {
    }

    public Barco(int CV, String nombre, int DNI, Date fechainicio, Date fechafinal, int posicion, int matricula, double eslora, int ano, double alquiler) {
        super(nombre, DNI, fechainicio, fechafinal, posicion, matricula, eslora, ano, alquiler);
        this.CV = CV;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }

    @Override
    public void Alquiler() {
        super.Alquiler(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ingrese los CV del motor, de la embarcacion: ");
        CV=leer.nextInt();
    }

    @Override
    public void CalculoAlquiler() {
        super.CalculoAlquiler(); //To change body of generated methods, choose Tools | Templates.
        alquiler+=CV;
    }

    @Override
    public void Mostrar() {
        System.out.println("Barco");
        System.out.println("CV de Motor: "+CV);
        super.Mostrar(); //To change body of generated methods, choose Tools | Templates.
    }

}
