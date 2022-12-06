
package ej04herencia;

import entidad.Circulo;
import entidad.Formas;
import entidad.Rectangulo;
import java.util.ArrayList;

/**
 *
* @author Tonna/SA FR34K
**/

/*4. Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.*/

public class Ej04Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Formas> forma = new ArrayList();
        
        Rectangulo recta1 = new Rectangulo(5, 10);
        Rectangulo recta2 = new Rectangulo(3, 7);
        Circulo circ1 = new Circulo(5);
        Circulo circ2 = new Circulo(10);
        
        forma.add(recta1);
        forma.add(recta2);
        forma.add(circ1);
        forma.add(circ2);
        
        for (Formas aux : forma) {
            aux.Mostrar();
        }
        
    }

}
