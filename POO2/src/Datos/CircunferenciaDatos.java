/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Scanner;

import poo2.Entidades.Circunferencia;

/**
 *
 * @author Usuario
 */
public class CircunferenciaDatos {
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia CircunferenciaRelleno(){
        
        
       Circunferencia C1 = new Circunferencia();
       System.out.println("ingrese el radio de la circunferencia"); 
       C1.setRadio(leer.nextInt());
        return C1;
        
    }
    
    public void area(Circunferencia C1){
       C1.setArea(3.14 * (C1.getRadio() * C1.getRadio()));
    }
    
    public void perimetro(Circunferencia C1){
    C1.setPerimetro((int) (2 * 3.14 * C1.getRadio()));
    }
    
}
