/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra4;

import pooextra4.Entidades.NIF;
import pooextra4.Servicios.NIFServicios;

/**
 *
 * @author Usuario
 */
public class PooExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NIFServicios Ns = new NIFServicios();
       NIF N1 = Ns.crearNIF();
       
    }
    
}
