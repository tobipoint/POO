/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caracteristicas;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaCaracteristicas {
    
    public Persona personaCaract(){
        
        // instanciar
        
        Persona p1 = new Persona();
        
        // rellenar atributos
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese su nommbre");
        p1.setNombre(leer.next());
        System.out.println("ingrese su apellido");
        p1.setApellido(leer .next());
        System.out.println("ingrese su dni");
        p1.setDni(leer .nextInt());
        System.out.println("ingrese su altura");
        p1.setAltura(leer .nextInt());
        return p1; 
    }
}
