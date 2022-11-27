package ej01herencia;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;
import java.util.ArrayList;

/**
 *
 * @author Tonna/SA FR34K
 *
 */

/*1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:*/
public class Ej01Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList();

        Animal Perro1 = new Perro("Marvin", 2, "Caniche", "Royal Canin");
        Perro1.Alimentarse();
        animales.add(Perro1);
        Animal Gato1 = new Gato("Deku", 4, "Siames", "Wiskas");
        Gato1.Alimentarse();
        animales.add(Gato1);
        Animal Caballo1 = new Caballo("Toscano", 8, "Overo", "Fardo de Pasto");
        Caballo1.Alimentarse();
        animales.add(Caballo1);

        System.out.println("");
        for (Animal aux : animales) {
            System.out.println(aux.toString());
        }

    }

}
