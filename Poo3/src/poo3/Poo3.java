/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3;

import Crear.OperacionCrear;
import Entidades.Operacion;

/**
 *
 * @author Usuario
 */
public class Poo3 {

    
    public static void main(String[] args) {
    
        OperacionCrear Oc = new OperacionCrear();
        Operacion Op = Oc.CrearOperacion();
        Oc.sumar(Op);
        Oc.restar(Op);
        Oc.multiplicar(Op);
        Oc.dividir(Op);
        
        
    }
}
