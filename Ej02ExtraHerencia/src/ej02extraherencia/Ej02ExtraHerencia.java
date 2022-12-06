package ej02extraherencia;

import entidad.Edificio;
import entidad.EdificiodeOficinas;
import entidad.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author Tonna/SA FR34K
 *
 */

/*
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener 
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los 
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la 
superficie y el volumen de cada edificio. 
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son 
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método 
cantPersonas() y mostrar los resultados de cada edificio de oficinas.*/
public class Ej02ExtraHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Edificio> constr = new ArrayList();
        Edificio p1 = new Polideportivo("Yupanqui", true, 50, 3, 100);
        Edificio p2 = new Polideportivo("Atlas", false, 70, 2, 90);
        Edificio e1 = new EdificiodeOficinas("Petronas", 3, 5, 6, 100, 100, 250);
        Edificio e2 = new EdificiodeOficinas("Empire", 6, 10, 12, 130, 120, 280);

        constr.add(p1);
        constr.add(p2);
        constr.add(e1);
        constr.add(e2);

        for (Edificio aux : constr) {
            aux.CalcularSuperficie();
            aux.CalcularVolumen();
            System.out.println("");
        }
        System.out.println("");
        int a = 0, b = 0;
        for (Edificio aux : constr) {
            if (aux instanceof Polideportivo) {
                if (((Polideportivo) aux).getTechado()) {
                    a++;
                } else {
                    b++;
                }
            }
        }

        System.out.println("Polideportivos techados: " + a + " y polideportivos descubiertos: " + b);

        System.out.println("");
        for (Edificio aux : constr) {
            if (aux instanceof EdificiodeOficinas) {
                ((EdificiodeOficinas) aux).CantidadPersonas();
                System.out.println("");
            }
        }
    }

}
