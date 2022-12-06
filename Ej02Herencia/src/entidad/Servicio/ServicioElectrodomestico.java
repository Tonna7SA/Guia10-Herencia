package entidad.Servicio;

import entidad.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
13
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
LETRA PRECIO
A $1000                  PESO PRECIO
B $800                  Entre 1 y 19 kg $100
C $600                  Entre 20 y 49 kg $500
D $500                  Entre 50 y 79 kg $800
E $300                  Mayor que 80 kg $1000
F $100
 */
public class ServicioElectrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Electrodomestico e1 = new Electrodomestico();

    public void ConsumoEnergetico() {
        e1.setConsumo(leer.next().toUpperCase());
        if (!(e1.getConsumo().equalsIgnoreCase("A") || e1.getConsumo().equalsIgnoreCase("B") || e1.getConsumo().equalsIgnoreCase("C") || e1.getConsumo().equalsIgnoreCase("D")
                || e1.getConsumo().equalsIgnoreCase("E") || e1.getConsumo().equalsIgnoreCase("F"))) {
            System.out.println("El consumo energetico no corresponde a las especificaciones, se tomara como (F)...");
            e1.setConsumo("F");
        }
    }

    public void ComprobarColor() {
        String color=leer.next();
        color = color.toUpperCase().substring(0, 1).concat(color.substring(1));
        e1.setColor(color);
        int cont = 0;
        String colores[] = {"Blanco", "Negro", "Rojo", "Azul", "Gris","Blanca","Negra","Roja"};
        for (int i = 0; i < colores.length; i++) {
            if (!(e1.getColor().equalsIgnoreCase(colores[i]))) {
                cont++;
            }
        }
        if (cont == 8) {
            System.out.println("El color seleccionado, no esta en nuestro catalogo, se tomara como color (Blanco).");
            e1.setColor("Blanco");
        }
    }

    public void CrearElectrodomesico() {
        System.out.println("Ingrese el color del electrodomestico: ");
        ComprobarColor();
        System.out.println("Ingrese el peso del electrodomestico: ");
        e1.setPeso(leer.nextInt());
        System.out.println("Ingrese el consumo energetico del electrodomestico (A - B - C - D - E - F): ");
        ConsumoEnergetico();
        System.out.println("-----------------------------");
    }

    public void PrecioFinal() {
        switch (e1.getConsumo()) {
            case "A":
                e1.setPrecio(e1.getPrecio() + 1000);
                break;
            case "B":
                e1.setPrecio(e1.getPrecio() + 800);
                break;
            case "C":
                e1.setPrecio(e1.getPrecio() + 600);
                break;
            case "D":
                e1.setPrecio(e1.getPrecio() + 500);
                break;
            case "E":
                e1.setPrecio(e1.getPrecio() + 300);
                break;
            case "F":
                e1.setPrecio(e1.getPrecio() + 100);
                break;
        }
        if ((e1.getPeso() >= 1) && (e1.getPeso() < 20)) {
            e1.setPrecio(e1.getPrecio() + 100);
            
        }
        if (e1.getPeso() >= 20 && e1.getPeso() < 50) {
            e1.setPrecio(e1.getPrecio() + 500);
        }
        if (e1.getPeso() >= 50 && e1.getPeso() < 80) {
            e1.setPrecio(e1.getPrecio() + 800);
        }
        if (e1.getPeso() >= 80) {
            e1.setPrecio(e1.getPrecio() + 1000);
        }
    }
    public void Mostrar(){
        System.out.println("Color: "+e1.getColor()+"\nConsumo Tipo: "+e1.getConsumo()+"\nPeso: "+e1.getPeso()+" kg.\nValor Final: $ "+e1.getPrecio());
    }
    
}

