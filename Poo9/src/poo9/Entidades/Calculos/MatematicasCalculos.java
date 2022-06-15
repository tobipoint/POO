package poo9.Entidades.Calculos;

import java.util.Scanner;
import poo9.Entidades.Matematicas;

public class MatematicasCalculos {

    Scanner leer = new Scanner(System.in);
    Matematicas M1 = new Matematicas();

    public Matematicas MatematicasCalculos() {
        System.out.println("valores aleatorios: ");
        M1.setNum1((int) (Math.random() *10));
        M1.setNum2((int) (Math.random() * 10));
        System.out.println("los numeros son: " +M1.getNum1()+ " y " +M1.getNum2());
        return M1;
    }

    public int Mayor(Matematicas M1) {
        int mayor;
        mayor = Math.max(M1.getNum1(), M1.getNum2());
        System.out.println("el numero mayor es: " + mayor);
        return mayor;
    }

    public void Potencia(Matematicas M1, int mayor) {
        double potencia;
        potencia = Math.pow(Mayor(M1), Math.min(M1.getNum1(), M1.getNum2()));
        System.out.println("el numero mayor elevado al minimo es: " +potencia);
    }

    public void Raiz(Matematicas M1) {
        int menor;
        menor = Math.min(M1.getNum1(), M1.getNum2());
        int absoluto = Math.abs(menor);
        double raiz = Math.sqrt(absoluto);
        System.out.println("la raiz del numero mas chico es: " +raiz);
    }

}
