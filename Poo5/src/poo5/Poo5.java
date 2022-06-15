/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

import Cuenta.CuentaBancariaCuenta;
import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Poo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      CuentaBancariaCuenta Cb = new CuentaBancariaCuenta();
      CuentaBancaria C1 = Cb.CuentaBancariaCuenta();
      Scanner leer = new Scanner(System.in);
        int  op;
        
     do {
      System.out.println("que operacion desea realizar?");
         System.out.println("1: ingresar dinero");
         System.out.println("2: retirar dinero");
         System.out.println("3: extraccion rapida");
         System.out.println("4: consultar saldo");
         System.out.println("5: consultar datos de cuenta");
         System.out.println("6: salir");
         op = leer.nextInt();
         
     switch (op){
         case 1: 
             Cb.Ingreso(C1);
             break;
         case 2:
             Cb.Retiro(C1);
             break;
         case 3:
             Cb.ExtraccionRapida(C1);
             break;
         case 4:
             Cb.Saldo(C1);
             break;
         case 5:
             Cb.Datos(C1);
             break;
         case 6:
             System.out.println("hasta pronto");
             break;
     }
     } while (op != 6);
    }
}
    

