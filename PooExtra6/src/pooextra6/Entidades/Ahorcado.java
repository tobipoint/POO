/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra6.Entidades;

/**
 *
 * @author Usuario
 */
public class Ahorcado {
    private String vector[];
    private int jugadas;
    private String letra;
    private int largo;
    private int vidas;
    private int intentos;
    private boolean ganaste;

    public Ahorcado() {
    }

    public Ahorcado(String[] vector, int jugadas, String letra, int largo, int vidas, int intentos, boolean ganaste) {
        this.vector = vector;
        this.jugadas = jugadas;
        this.letra = letra;
        this.largo = largo;
        this.vidas = vidas;
        this.intentos = intentos;
        this.ganaste = ganaste;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public boolean isGanaste() {
        return ganaste;
    }

    public void setGanaste(boolean ganaste) {
        this.ganaste = ganaste;
    }

   
   
    
}
