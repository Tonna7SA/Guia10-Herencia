package ej01extraherencia;

import entidad.Amarre;
import entidad.Barco;
import entidad.Velero;
import entidad.Yate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 *
 */

/*1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.*/
public class Ej01ExtraHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Amarre> botes = new ArrayList();
        Velero v1 = new Velero();
        Barco b1 = new Barco();
        Yate y1 = new Yate();
        int eleccion;
        String opcion;
        do {
            System.out.println("Amarres de Puerto");
            System.out.println("-----------------");
            System.out.println("Tipo de Embarcacion");
            System.out.println("-------------------");
            System.out.println("1- Velero");
            System.out.println("2- Barco");
            System.out.println("3- Yate");
            System.out.println("Ingrese su opcion: ");
            eleccion = leer.nextInt();
            switch(eleccion){
                case 1:
                    v1.Alquiler();
                    v1.CalculoAlquiler();
                    botes.add(v1);
                    break;
                case 2:
                    b1.Alquiler();
                    b1.CalculoAlquiler();
                    botes.add(b1);
                    break;
                case 3:
                    y1.Alquiler();
                    y1.CalculoAlquiler();
                    botes.add(y1);
                    break;
                default:
                    System.out.println("Opcion invalida...");
            }
            System.out.println("Desea contratar otro amarre (S/N)");
            opcion=leer.next();
            
            
        }while(opcion.equalsIgnoreCase("S"));
        
        for (Amarre aux : botes) {
            aux.Mostrar();
        }
    
    
    }

}
