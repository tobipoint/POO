/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo9;

import poo9.Entidades.Calculos.MatematicasCalculos;
import poo9.Entidades.Matematicas;

/**
 *
 * @author Usuario
 */
public class Poo9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematicasCalculos Ms = new MatematicasCalculos();
        Matematicas M1 =  Ms.MatematicasCalculos();
        Ms.Mayor(M1);
        Ms.Potencia(M1, 0);
        Ms.Raiz(M1);
        
    }

}
