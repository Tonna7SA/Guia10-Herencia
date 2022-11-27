
package ejmao02herencia;

import entidad.Animal;
import entidad.Gato;
import entidad.Perro;
import java.util.ArrayList;

/**
 *
* @author Tonna/SA FR34K
**/

/*Vamos a crear una interfaz con un método abstracto. Luego desde el main intentaremos instanciar
un objeto a partir de la interfaz*/
public class EjMAO02Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         ArrayList<Animal> animales = new ArrayList();
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        
        for (Animal aux : animales) {
            aux.HacerRuido();
            aux.Ladrar(5);
            aux.Maullar(3);
            
        }

    }

}
