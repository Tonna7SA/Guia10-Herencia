package entidad;

import java.util.Date;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• Número de mástiles para veleros.*/

public class Velero extends Amarre{

    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles, String nombre, int DNI, Date fechainicio, Date fechafinal, int posicion, int matricula, double eslora, int ano, double alquiler) {
        super(nombre, DNI, fechainicio, fechafinal, posicion, matricula, eslora, ano, alquiler);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public void Alquiler() {
        super.Alquiler(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ingrese la cantidad de mastiles de la embarcacion: ");
        mastiles=leer.nextInt();
    }

    @Override
    public void CalculoAlquiler() {
        super.CalculoAlquiler(); //To change body of generated methods, choose Tools | Templates.
    alquiler+=mastiles;
    }

    @Override
    public void Mostrar() {
        System.out.println("Velero");
        System.out.println("Mastiles: " + mastiles);
        super.Mostrar(); //To change body of generated methods, choose Tools | Templates.
    }


}
