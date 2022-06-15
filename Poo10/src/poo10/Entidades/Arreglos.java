/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo10.Entidades;

/**
 *
 * @author Usuario
 */
public class Arreglos {
    
    
    public int arregloA[];
    public int []arregloB;

    public Arreglos() {
    }

    public Arreglos(int[] arregloA, int[] arregloB) {
        this.arregloA = arregloA;
        this.arregloB = arregloB;
    }

    public int[] getArregloA() {
        return arregloA;
    }

    public void setArregloA(int[] arregloA) {
        this.arregloA = arregloA;
    }

    public int[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(int[] arregloB) {
        this.arregloB = arregloB;
    }

    
    
}
