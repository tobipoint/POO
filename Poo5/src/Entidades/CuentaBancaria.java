/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    
    private int numeroCuenta;
    private double DNI;
    private int SaldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, double DNI, int SaldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.SaldoActual = SaldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getDNI() {
        return DNI;
    }

    public void setDNI(double DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(int SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    
}
