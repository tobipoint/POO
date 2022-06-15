
package poo4;

import Calculos.RectanguloCalculos;
import Entidades.Rectangulo;

/**
 *
 * @author Usuario
 */
public class Poo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        RectanguloCalculos Rc = new RectanguloCalculos();
        Rectangulo R1 = Rc.Calculos();
        Rc.Perimetro(R1);
        Rc.Superficie(R1);
        System.out.println(" ");
        Rc.dibujo(R1);
        
    }
    
}
