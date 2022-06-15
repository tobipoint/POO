/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo01.libro.Servicio;

import java.util.Scanner;
import poo01.libro.entidades.Libro;

/**
 *
 * @author Usuario
 */
public class LibroSevicio {
    
    public Libro RellenoLibro(){
        
       Scanner leer = new Scanner (System.in).useDelimiter("\n");
       Libro L1 = new Libro();
       
        System.out.println("ingrese titulo al libro");
        L1.setTitulo(leer .next());
        
        System.out.println("ingrese el autor");
        L1.setAutor(leer .next());
        
        System.out.println("ingrese cantidad de paginas");
        L1.setPaginas(leer .nextInt());
        
        int numero = 545478577 ;
        L1.setISB(numero);
        return L1;
        
    }
    
}
