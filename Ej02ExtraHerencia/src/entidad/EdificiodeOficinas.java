
package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas 
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y 
los atributos del padre. 
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el 
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso 
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre 
cuantas personas entrarían en un piso y cuantas en todo el edificio.*/
public class EdificiodeOficinas extends Edificio{
    private String nombre;
    private int numerooficinas;
    private int persof;
    private int pisos;

    public EdificiodeOficinas() {
    }

    public EdificiodeOficinas(String nombre, int numerooficinas, int persof, int pisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.numerooficinas = numerooficinas;
        this.persof = persof;
        this.pisos = pisos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public int getNumerooficinas() {
        return numerooficinas;
    }

    public void setNumerooficinas(int numerooficinas) {
        this.numerooficinas = numerooficinas;
    }

    public int getPersof() {
        return persof;
    }

    public void setPersof(int persof) {
        this.persof = persof;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
    
    
    public void CantidadPersonas(){
        int result1, result2;
        result1=persof*numerooficinas;
        result2=result1*pisos;
        System.out.println("Edificio: "+nombre);
        System.out.println("Cantidad de personas por piso: "+result1);
        System.out.println("Cantidad de personas en todo el edificio: "+result2);
    }

    @Override
    public void CalcularSuperficie() {
        System.out.println("Edificio "+nombre);
        super.CalcularSuperficie(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CalcularVolumen() {
        super.CalcularVolumen(); //To change body of generated methods, choose Tools | Templates.
    }

}
