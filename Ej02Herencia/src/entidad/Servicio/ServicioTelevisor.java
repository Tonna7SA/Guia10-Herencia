package entidad.Servicio;

import entidad.Televisor;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.*/
public class ServicioTelevisor extends ServicioElectrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Televisor t1 = new Televisor();
    String a;

    @Override
    public void CrearElectrodomesico() {
        super.CrearElectrodomesico(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ingrese la resolucion, en pulgadas: ");
        t1.setResolucion(leer.nextInt());
        System.out.println("Tiene sintonizador TDT?? (S/N)");
        String opcion = leer.next();
        if (opcion.equalsIgnoreCase("S")) {
            t1.setTDT(true);
            a = "Si";
        } else {
            t1.setTDT(false);
            a = "No";
        }
    }

    @Override
    public void PrecioFinal() {
        super.PrecioFinal(); //To change body of generated methods, choose Tools | Templates.
        if (t1.getResolucion() > 40) {
            e1.setPrecio((e1.getPrecio() * 0.3) + e1.getPrecio());
        }
        if (t1.isTDT()) {
            e1.setPrecio((e1.getPrecio() + 500));
        }

    }

    @Override
    public void Mostrar() {
        System.out.println("");
        System.out.println("Televisor: ");
        System.out.println("Resolucion: " + t1.getResolucion() + " pulgadas.");
        System.out.println("TDT: "+a);
        super.Mostrar(); //To change body of generated methods, choose Tools | Templates.

    }

}
