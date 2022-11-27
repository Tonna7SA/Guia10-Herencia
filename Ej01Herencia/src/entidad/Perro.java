
package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Perro extends Animal{

    public Perro(String nombre, int edad, String raza, String alimento) {
        super(nombre, edad, raza, alimento);
    }

    public void Alimentar(){
        System.out.println("El perro se alimenta con: "+alimento);
    }
    
}
