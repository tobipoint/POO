/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo8;

import poo8.Entidades.Cadena;
import poo8.Entidades.Servicio.CadenaServicio;

/**
 *
 * @author Usuario
 */
public class Poo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicio Cs = new CadenaServicio();
        Cadena C1 = Cs.CadenaServicio();
        Cs.MostrarVocales(C1);
        Cs.InvertirFrase(C1);
        Cs.VecesRepetido(C1);
        Cs.CompararFrases(C1);
        Cs.Unir(C1);
        Cs.reemplazar(C1);
        Cs.Contiene(C1);
        
    }
    
}
