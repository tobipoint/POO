/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra4.Servicios;

import java.util.Scanner;
import pooextra4.Entidades.NIF;

/**
 *
 * @author Usuario
 */
public class NIFServicios {

    Scanner leer = new Scanner(System.in);
    NIF N1 = new NIF();

    public NIF crearNIF() {
        System.out.println("ingrese numero de DNI");
        N1.setDNI(leer.nextInt());
        int arreglo[];
        arreglo = new int[22];

        int resto;
        resto = (N1.getDNI() % 23);
        
        switch (resto) {
            case 0:
                N1.setNIF('T');
                break;
            case 1:
                N1.setNIF('R');
                  break;
            case 2:
                N1.setNIF('W');
                  break;
            case 3:
                N1.setNIF('A');
                  break;
            case 4:
                N1.setNIF('G');
                  break;
            case 5:
                N1.setNIF('M');
                  break;
            case 6:
                N1.setNIF('Y');
                  break;
            case 7:
                N1.setNIF('F');
                  break;
            case 8:
                N1.setNIF('P');
                  break;
            case 9:
                N1.setNIF('P');
                  break;
            case 10:
                N1.setNIF('X');
                  break;
            case 11:
                N1.setNIF('B');
                  break;
            case 12:
                N1.setNIF('N');
                  break;
            case 13:
                N1.setNIF('J');
                  break;
            case 14:
                N1.setNIF('Z');
                  break;
            case 15:
                N1.setNIF('S');
                  break;
            case 16:
                N1.setNIF('Q');
                  break;
            case 17:
                N1.setNIF('V');
                  break;
            case 18:
                N1.setNIF('H');
                  break;
            case 19:
                N1.setNIF('L');
                  break;
            case 20:
                N1.setNIF('C');
                  break;
            case 21:
                N1.setNIF('K');
                  break;
            case 22:
                N1.setNIF('E');
                  break;
        }
        mostrarDNI(N1);
        return N1;
    }
    
    public void mostrarDNI(NIF N1){
        System.out.println(N1.getDNI()+"-" +N1.getNIF());
        
    }

}
