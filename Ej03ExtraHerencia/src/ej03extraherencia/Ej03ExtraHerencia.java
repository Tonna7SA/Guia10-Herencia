package ej03extraherencia;

import entidad.Alojamientos;
import entidad.Camping;
import static entidad.Comparadores.ordenp;
import entidad.Hotel4Estrellas;
import entidad.Hotel5Estrellas;
import entidad.Hoteles;
import entidad.Residencia;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Tonna/SA FR34K
 *
 */

/*3. Una compañía de promociones turísticas desea mantener información sobre la infraestructura 
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de 
acuerdo con sus posibilidades. 

El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula: 
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor 
agregado por gimnasio) + (valor agregado por limosinas). 
Donde: 
Valor agregado por el restaurante: 
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas. 
• $50 si es mayor de 50. 
Valor agregado por el gimnasio: 
• $50 si el tipo del gimnasio es A. 
• $30 si el tipo del gimnasio es B. 
Valor agregado por las limosinas: 
• $15 por la cantidad de limosinas del hotel.

 Existen dos tipos de alojamientos extrahoteleros: los Camping y las 
Residencias.  Realizar un programa en el que se representen todas las relaciones 
descriptas. 
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios: 
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento. */
public class Ej03ExtraHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alojamientos> lugar = new ArrayList();
        ArrayList<Hoteles> hotel = new ArrayList();
        Alojamientos h1 = new Hotel4Estrellas(true, "Las Papas locas", 30, 10, 20, 5, 0, "El Hotelucho", "Donde topa lo pandito 1223", "Jean Pier Lamastique");
        Alojamientos h2 = new Hotel4Estrellas(false, "Jamon del Medio", 50, 20, 30, 15, 0, "Hotel El Torrador", "Doblando la esquina 223", "Juancho Talarga");
        Alojamientos h3 = new Hotel4Estrellas(false, "Carton Prensado", 10, 20, 10, 18, 0, "Hotel La Miseria", "Por Ahi 2223", "Ceferino Montes");
        Alojamientos h4 = new Hotel5Estrellas(50, 10, 5, "A", true, "Uy, nos rompieron el tuje", 80, 23, 12, 60, 0, "Los Acaros", "Detras de la villa 5643", "El Cartonero Baez");
        Alojamientos h5 = new Hotel5Estrellas(20, 12, 6, "B", false, "El Tenedor Libre", 60, 12, 22, 33, 0, "Los Pica Pica", "Juan B Justo, esq. Venado Tuerto", "Johan Sebastian Mastropiero");
        Alojamientos h6 = new Hotel5Estrellas(10, 19, 10, "A", false, "Solo hay Sopa", 40, 32, 26, 36, 0, "El Cheraton", "Al lado del Vivero 321", "Paris Hilton");
        Alojamientos h7 = new Camping(120, 5, true, true, 1200, "La Carpita Feliz", "Detras del Cerro s/n", "El Oso Yogui");
        Alojamientos h8 = new Camping(50, 2, false, false, 120, "Apretados", "En lo de Visconte", "Tio Jessi");
        Alojamientos h9 = new Camping(30, 8, false, true, 220, "Donde aiga lugar", "Aiga va con j 123456", "Analfabeto Ponce");
        Alojamientos h10 = new Residencia(12, true, true, true, 250, "La Posada", "Desposada 2121", "Armando Esteban Quito");
        Alojamientos h11 = new Residencia(5, false, true, true, 1250, "La Estancia", "Alla Lejos 121", "Pedro Picapiedra");
        Alojamientos h12 = new Residencia(30, true, false, true, 550, "La Pocilga", "Lejos Lejos Lejos 21", "Pablo Marmol");
        lugar.add(h1);
        lugar.add(h2);
        lugar.add(h3);
        lugar.add(h4);
        lugar.add(h5);
        lugar.add(h6);
        lugar.add(h7);
        lugar.add(h8);
        lugar.add(h9);
        lugar.add(h10);
        lugar.add(h11);
        lugar.add(h12);
        hotel.add((Hoteles) h1);
        hotel.add((Hoteles) h2);
        hotel.add((Hoteles) h3);
        hotel.add((Hoteles) h4);
        hotel.add((Hoteles) h5);
        hotel.add((Hoteles) h6);
        System.out.println("Todos Los Alojamientos");
        System.out.println("----------------------");
        for (Alojamientos aux : lugar) {
            System.out.println("");
            if (aux instanceof Hotel5Estrellas) {
                System.out.println("Hotel 5 Estrellas");
                aux.CalcularPrecio();
                aux.Mostrar();
                continue;
            }
            if (aux instanceof Hotel4Estrellas) {
                System.out.println("Hotel 4 Estrellas");
                aux.CalcularPrecio();
                aux.Mostrar();
                continue;
            }
            if (aux instanceof Camping) {
                System.out.println("Camping");
                aux.CalcularPrecio();
                aux.Mostrar();
                continue;
            }
            if (aux instanceof Residencia) {
                System.out.println("Residencia");
                aux.CalcularPrecio();
                aux.Mostrar();
            }
        }

        System.out.println("");
        System.out.println("Hoteles Mayor Precio");
        System.out.println("--------------------");
        Collections.sort(hotel, ordenp);
        for (Hoteles aux : hotel) {
            System.out.println("");
            if (aux instanceof Hotel5Estrellas) {
                System.out.println("Hotel 5 Estrellas");
                aux.Mostrar();
                continue;
            }
            if (aux instanceof Hotel4Estrellas) {
                System.out.println("Hotel 4 Estrellas");
                aux.Mostrar();
            }

        }
        System.out.println("");
        System.out.println("Campings con Restoran y Residencias con Descuento");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        for (Alojamientos aux : lugar) {
            if (aux instanceof Camping) {
                if (((Camping) aux).isRestorante()) {
                    System.out.println("Camping: ");
                    aux.Mostrar();
                    System.out.println("");
                    continue;
                }
            }
            if (aux instanceof Residencia) {
                if (((Residencia) aux).isDescuentogremios()) {
                    System.out.println("Residencia: ");
                    aux.Mostrar();
                    System.out.println("");
                }
            }
        }
    }
}
