package entidad;

import java.util.Date;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• Potencia en CV y número de camarotes para yates de lujo.*/
public class Yate extends Barco {

    private int camarotes;

    public Yate() {
    }

    public Yate(int camarotes, int CV, String nombre, int DNI, Date fechainicio, Date fechafinal, int posicion, int matricula, double eslora, int ano, double alquiler) {
        super(CV, nombre, DNI, fechainicio, fechafinal, posicion, matricula, eslora, ano, alquiler);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public void Alquiler() {
        super.Alquiler(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ingrese la cantidad de camarotes de la embarcacion: ");
        camarotes = leer.nextInt();
    }

    @Override
    public void CalculoAlquiler() {
        super.CalculoAlquiler(); //To change body of generated methods, choose Tools | Templates.
        alquiler += camarotes;
    }

    @Override
    public void Mostrar() {
        System.out.println("Yate");
        System.out.println("Camarotes: "+camarotes);
        super.Mostrar(); //To change body of generated methods, choose Tools | Templates.
    }

}
