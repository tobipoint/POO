




package poo2;

import Datos.CircunferenciaDatos;
import poo2.Entidades.Circunferencia;


public class POO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     CircunferenciaDatos Cd = new CircunferenciaDatos();
     Circunferencia C1 = Cd.CircunferenciaRelleno();
      Cd.perimetro(C1);
      Cd.area(C1);
        System.out.println(C1);
        
    }    

}
    

