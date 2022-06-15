/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crear;

import Entidades.Operacion;
import java.util.Scanner;


public class OperacionCrear {
    
    public Operacion CrearOperacion(){
        Operacion Op = new Operacion();
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        Op.setNum1(leer.nextInt());
        System.out.println("ingrese el segundo numero");
        Op.setNum2(leer.nextInt());
        return Op;
    }
    public void sumar(Operacion Op){
       int sumar = Op.getNum1() + Op.getNum2();
        System.out.println("la suma es igual a: " +sumar);
    }
    public void restar(Operacion Op){
       int restar = Op.getNum1() - Op.getNum2();
       System.out.println("la resta es igual a: " +restar);
    }
    public void multiplicar(Operacion Op){
       int multiplicar;
        if (Op.getNum1() == 0 || Op.getNum2() == 0) {
            System.out.println("ERROR: la multiplicacion es 0");
        }else if (Op.getNum1()!= 0 || Op.getNum2() != 0){
        multiplicar = Op.getNum1() * Op.getNum2();
        System.out.println("la miltiplicacion es igual a: " +multiplicar);
     }
    }
    
    public void dividir(Operacion Op){
        double dividir;
        if (Op.getNum1() == 0 || Op.getNum2() == 0) {
            System.out.println("ERROR: la division es 0");
        }else if (Op.getNum1()!= 0 || Op.getNum2() != 0){
       dividir = Op.getNum1() / Op.getNum2();
       System.out.println("la divicion es igual a: " +dividir);
     }
    }
    
}
