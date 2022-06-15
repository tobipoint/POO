/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo01.libro;

import poo01.libro.Servicio.LibroSevicio;
import poo01.libro.entidades.Libro;


public class Poo01Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      LibroSevicio Nv = new LibroSevicio();
      Libro L1 = Nv.RellenoLibro();
        System.out.println(L1);
    }
    
}
