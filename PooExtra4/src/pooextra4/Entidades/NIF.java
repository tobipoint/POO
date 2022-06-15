/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra4.Entidades;

/**
 *
 * @author Usuario
 */
public class NIF {
    
    public int DNI;
    public char NIF;

    public NIF() {
    }

    public NIF(int DNI, char NIF) {
        this.DNI = DNI;
        this.NIF = NIF;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public char getNIF() {
        return NIF;
    }

    public void setNIF(char NIF) {
        this.NIF = NIF;
    }
    
    
}
