/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7.Entidades.Crear;

import java.util.Scanner;
import poo7.Entidades.Persona;


public class CrearPersona {
    
    Scanner leer = new Scanner(System.in);
    Persona P1 = new Persona();
    
    public Persona CrearPersona (){
        System.out.println("nombre");
        P1.setNombre(leer.next());
        
        System.out.println("edad");
        P1.setEdad(leer.nextInt());
        
        System.out.println("sexo (h/m)");
        P1.setSexo(leer.next());
        
        System.out.println("peso");
        P1.setPeso(leer.nextDouble());
        
        System.out.println("altura");
        P1.setAltura(leer.nextDouble());
        
        return P1;
    }
    
    public int CalcularIMC(Persona P1){
     int IMC1; 
        IMC1 = (int) (P1.getPeso() / (Math.pow(P1.getAltura(),2)));
        
        if (IMC1 < 20) {
            System.out.println("estas debajo del peso ideal");
           P1.setIMC(-1);
        }else if (IMC1 >= 20 && IMC1 <= 25) {
            System.out.println("estas en tu peso ideal");
            P1.setIMC(0);
        }else if (IMC1 > 25) {
            System.out.println("estas en sobrepeso");
            P1.setIMC(1);
        }
        return P1.IMC;
    }
    
    public void MayorEdad(Persona P1){
        boolean edades = false;
        
        if (P1.getEdad() > 18) {
            edades = true;
        }
    }

}
