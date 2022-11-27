
package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Gato extends Animal{
    
    public Gato(String nombre, int edad, String raza, String alimento) {
        super(nombre, edad, raza, alimento);
    }

    public void Alimentar(){
        System.out.println("El perro se alimenta con: "+alimento);
    }
    

}
