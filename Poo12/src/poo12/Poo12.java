/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo12;

import poo12.Entidades.Persona;
import poo12.Entidades.Servicios.PersonaServicio;

/**
 *
 * @author Usuario
 */
public class Poo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio Ps = new PersonaServicio();
        Persona P1 = Ps.crearPersona();
        
    }
    
}
