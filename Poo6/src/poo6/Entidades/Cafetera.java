/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6.Entidades;

/**
 *
 * @author Usuario
 */
public class Cafetera {
    private int CapMaxima;
    private int CantActual;

    public Cafetera() {
    }
    
    public Cafetera(int CapMaxima, int CantActual) {
        this.CapMaxima = CapMaxima;
        this.CantActual = CantActual;
    }

    public int getCapMaxima() {
        return CapMaxima;
    }

    public void setCapMaxima(int CapMaxima) {
        this.CapMaxima = CapMaxima;
    }

    public int getCantActual() {
        return CantActual;
    }

    public void setCantActual(int CantActual) {
        this.CantActual = CantActual;
    }

    
    
    
    
    
}
