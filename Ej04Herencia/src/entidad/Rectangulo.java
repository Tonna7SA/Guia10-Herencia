
package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Rectangulo implements Formas{

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    

    @Override
    public double CalcularArea() {
        double resultado = lado1 * lado2;
        return resultado;
    }

    @Override
    public double CalcularPerimetro() {
        double resultado = (lado1+lado2)*2;
        return resultado;
    }

    @Override
    public void Mostrar() {
        System.out.println("El Rectangulo, de lado1 = "+lado1+" y lado2 = "+lado2);
        System.out.println("Tiene un area de: "+CalcularArea());
        System.out.println("Tiene un perimetro de: "+CalcularPerimetro());
    }
    
}
