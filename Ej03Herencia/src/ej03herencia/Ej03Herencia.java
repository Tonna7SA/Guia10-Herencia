package ej03herencia;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Tonna/SA FR34K
*
 */

/*3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.*/
public class Ej03Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electro = new ArrayList();
        Televisor tele1 = new Televisor(42, true, 1000, "Blanco", "A", 20);
        Televisor tele2 = new Televisor(32, false, 500, "Negro", "C", 15);
        Lavadora lava1 = new Lavadora(20, 1000, "Azul", "E", 30);
        Lavadora lava2 = new Lavadora(30, 1500, "Gris", "A", 40);
        electro.add(tele1);
        electro.add(tele2);
        electro.add(lava1);
        electro.add(lava2);
        
        System.out.println("");
        for (Electrodomestico aux : electro) {
            aux.PrecioFinal();
            System.out.println(aux);    
        }
       double suma=0;
       double suma1=0;
       
        for (Electrodomestico aux : electro) {
            if (aux instanceof Televisor) {
                Televisor tele = (Televisor) aux;
                suma +=(aux.getPrecio());
            }
            if (aux instanceof Lavadora) {
                Lavadora lava = (Lavadora) aux;
                suma1 +=(aux.getPrecio());
            }
        }
        System.out.println("");
        System.out.println("La suma de los Televisores es: $ "+suma);
        System.out.println("La suma de las Lavadoras es: $ "+suma1);
        System.out.println("La suma de todos los electrodomesticos es: $ "+(suma+suma1));
        System.out.println("");
    }
}
