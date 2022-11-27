package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Circulo implements Formas{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    final double pi=3.14;

    @Override
    public double CalcularArea() {
        double resultado = pi*Math.pow(radio, 2);
        return resultado;
    }

    @Override
    public double CalcularPerimetro() {
        double resultado = 2*pi*radio;
        return resultado; 
    }

    @Override
    public void Mostar() {
        System.out.println("El Circulo, con radio de = "+radio);
        System.out.println("Tiene un area de: "+CalcularArea());
        System.out.println("Tiene un perimetro de: "+CalcularPerimetro());
    }
    
    

}
