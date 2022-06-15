/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1;

import Caracteristicas.PersonaCaracteristicas;
import Entidades.Persona;


/**
 *
 * @author Usuario
 */
public class Poo1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
     PersonaCaracteristicas pc = new PersonaCaracteristicas();
      Persona p1 =  pc.personaCaract();    
         System.out.println(p1.toString());
    }
    
}
