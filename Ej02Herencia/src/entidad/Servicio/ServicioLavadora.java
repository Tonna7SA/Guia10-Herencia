package entidad.Servicio;

import entidad.Lavadora;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/
public class ServicioLavadora extends ServicioElectrodomestico{
    
    
    Lavadora l1 = new Lavadora();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public void CrearElectrodomesico() {
        super.CrearElectrodomesico(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ingrese cuantos kilos de carga tiene: ");
        l1.setCarga(leer.nextInt());
          
    }

    @Override
    public void PrecioFinal() {
        super.PrecioFinal(); //To change body of generated methods, choose Tools | Templates.
        if(l1.getCarga()>30){
            e1.setPrecio(e1.getPrecio()+500.0);
        }
    }

    @Override
    public void Mostrar() {
        System.out.println("");
        System.out.println("Lavadora: ");
        System.out.println("Cap. Carga: "+l1.getCarga()+" kg.");
        super.Mostrar(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
