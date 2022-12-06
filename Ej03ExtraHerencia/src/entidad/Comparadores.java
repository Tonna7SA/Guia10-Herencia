package entidad;

import java.util.Comparator;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Comparadores {

    public static Comparator<Hoteles> ordenp = new Comparator<Hoteles>() {
        @Override
        public int compare(Hoteles t, Hoteles t1) {
            return t1.getPreciohabitacion().compareTo(t.getPreciohabitacion());
        }
    };

}
