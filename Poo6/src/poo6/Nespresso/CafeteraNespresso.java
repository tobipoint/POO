/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6.Nespresso;

import java.util.Scanner;
import poo6.Entidades.Cafetera;

/**
 *
 * @author Usuario
 */
public class CafeteraNespresso {
    
   public Cafetera LLenarCafetera(){
       System.out.println("la cafetera trae una capacidad de 1 lt");
       Cafetera C1 = new Cafetera();
       C1.setCapMaxima(1000);
       C1.setCantActual(C1.getCapMaxima());
       return C1;
   }
   
   public void ServirTaza (Cafetera C1){
       Scanner leer = new Scanner(System.in);
       System.out.println("ingrese tamaño de la taza");
       int taza = leer.nextInt();
       
       if (taza > C1.getCantActual()) {
         int cantidad = (taza - C1.getCantActual());
         C1.setCantActual(0);
           System.out.println("la taza no se ha  llenado, tiene: " +cantidad+ "ml");
       }else{
       C1.setCantActual(C1.getCantActual() - taza);
       System.out.println("la taza se ha llenado");
       }
   }
   
   public void VaciarCafetera (Cafetera C1){
       C1.setCantActual(0);
       System.out.println("cafetera vaciada");
   }
   
   public void AgregarCafe (Cafetera C1){
       Scanner leer = new Scanner(System.in);
       System.out.println("cuanto cafe le colocara?");
       int cafe = leer.nextInt();
       C1.setCantActual(cafe);
       System.out.println("cafetera con" +cafe+ "ml");
   }
   
    
}
