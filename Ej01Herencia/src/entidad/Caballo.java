
package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Caballo extends Animal{
    
    public Caballo(String nombre, int edad, String raza, String alimento) {
        super(nombre, edad, raza, alimento);
    }

    public void Alimentar(){
        System.out.println("El perro se alimenta con: "+alimento);
    }
    
    

}
