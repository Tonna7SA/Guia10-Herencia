
package entidad;

import ejmao02herencia.Interface.InterfaceGato;
import ejmao02herencia.Interface.InterfacePerro;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Animal implements InterfacePerro, InterfaceGato{

    public void HacerRuido(){
        System.out.println("Hola");
    }

    @Override
    public void Ladrar(int cantidad) {
        System.out.println("El perro ladro "+cantidad+" veces.");
    }

    @Override
    public void Maullar(int cantidad) {
        System.out.println("El gato maullo "+cantidad+" veces.");
    }
}
