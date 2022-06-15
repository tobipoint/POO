/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculos;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RectanguloCalculos {
    
   public Rectangulo Calculos(){
     Scanner leer= new Scanner(System.in);
     Rectangulo R1 = new Rectangulo();
     System.out.println("ingrese la base");
     R1.setBase(leer.nextInt());
     System.out.println("ingrese la altura");
     R1.setAltura(leer.nextInt());
    return R1;
    }
     
   public void Superficie(Rectangulo R1){
       int superficie;
       superficie = R1.getAltura() * R1.getBase();
       System.out.println("la superficie es de:" +superficie);
   }
    
public void Perimetro(Rectangulo R1){
    int Perimetro;
    Perimetro = ((R1.getAltura() + R1.getBase()) * 2);
    System.out.println("el perimetro es de: " +Perimetro);
}  
public void dibujo(Rectangulo R1){
    int [][] vector;
    vector = new int [R1.getAltura()] [R1.getBase()];
    
        for (int i = 0; i < R1.getAltura(); i++) {
            System.out.print(" * ");
        }
        System.out.println("  ");

        for (int i = 0; i < R1.getBase()-2; i++) {
            System.out.print(" * ");
            for (int j = 0; j < R1.getAltura()-1; j++) {
                System.out.print("  ");
            }
            System.out.println(" * ");
         }
        for (int i = 0; i < R1.getAltura(); i++) {
            System.out.print(" * ");
         }
        System.out.println("  ");
     }
}
