/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CuentaBancariaCuenta {
    
    public CuentaBancaria CuentaBancariaCuenta(){
        Scanner leer = new Scanner(System.in);
        CuentaBancaria C1 = new CuentaBancaria();
        
        System.out.println("ingrese su DNI");
        C1.setDNI(leer.nextDouble());
        
        System.out.println("ingrese numero de cuenta");
        C1.setNumeroCuenta(leer.nextInt());
        
        System.out.println("su cuenta bancaria esta en 0");
        C1.setSaldoActual(0);
        
        return C1;
    }
     
    public void Ingreso(CuentaBancaria C1){
        Scanner leer = new Scanner(System.in);
        System.out.println("cuanto dinero quiere ingresar?");
        int ingresar = leer.nextInt();
        C1.setSaldoActual(C1.getSaldoActual() + ingresar);
    }
    
    public void Retiro (CuentaBancaria C1){
        Scanner leer = new Scanner(System.in);
        System.out.println("cuanto dinero quiere ingresar?");
        double retirar = leer.nextDouble();
        
        if (retirar > C1.getSaldoActual()) {
           C1.setSaldoActual(0);
        } else
        C1.setSaldoActual(C1.getSaldoActual() - (int) retirar);
    }
    
    public void ExtraccionRapida (CuentaBancaria C1){
      Scanner leer = new Scanner(System.in);
      System.out.println("Podra extraer solamente el 20% de su dinero");
      System.out.println("desea retirarlo? (s/n)");
      String confirma = leer.next();
        if (confirma.equalsIgnoreCase("s") ) {
         C1.setSaldoActual((int) (C1.getSaldoActual() * 0.20));
        }
    }
    
    public void Saldo (CuentaBancaria C1){
         System.out.println("su saldo acutal es de: " +C1.getSaldoActual());
     }
     
    public void Datos  (CuentaBancaria C1){
         System.out.println("su numero de cuenta es: " +C1.getNumeroCuenta() );
         System.out.println("su DNI es: " +C1.getDNI());
         System.out.println("su saldo actual es de: " +C1.getSaldoActual()  );
     }
     
}
