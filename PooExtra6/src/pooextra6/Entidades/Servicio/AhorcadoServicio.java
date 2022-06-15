/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra6.Entidades.Servicio;

import java.util.Scanner;
import pooextra6.Entidades.Ahorcado;

/**
 *
 * @author Usuario
 */
public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in);
    Ahorcado Ah = new Ahorcado();

    public Ahorcado CrearJuego() {
        System.out.println("ingrese la palabra");
        String palabra = leer.next();

        Ah.setLargo(palabra.length());
        Ah.setVector(new String[Ah.getLargo()]);
        String arreglo[];
        arreglo = new String[Ah.getLargo()];

        for (int i = 0; i < Ah.getLargo(); i++) {
            arreglo[i] = palabra.substring(i, i + 1);
        }

        Ah.setVector(arreglo);

        Ah.setVidas(6);

        return Ah;
    }

    public void Longitud(Ahorcado Ah) {

        System.out.println(" EMPEZEMOS EL JUEGO ");
        System.out.println("Tiene 6 vidas");
        // System.out.println("si ingresa la palabra /vidas/ le dira cuantas vidas tiene");
        // System.out.println("si ingresa la palabra /letras/ le dira cuantas letras le faltan encontrar");

        System.out.println("la palabra tiene " + Ah.getLargo() + " letras");
    }

    public void BuscarLetra(Ahorcado Ah) {
        Ah.setJugadas(0);
        boolean terminado = false;

        boolean flag;
        while (!terminado) {

            System.out.println("ingrese una letra");
            String letra = (leer.next());
            flag = false;
            for (int i = 0; i < Ah.getLargo(); i++) {

                if (letra.equals(Ah.getVector()[i])) {
                    String[] aux = Ah.getVector();
                    aux[i] = "@";
                    LetraEncontrada(Ah);
                    flag = true;
                }

                if ((i == Ah.getLargo() - 1) && !flag) {

                    LetraNOEnontrada(Ah);

                }

            }
            if ((Ah.getJugadas() == Ah.getLargo()) || ((Ah.getVidas() == 0))) {
                terminado = true;
            }
        }
        if ((Ah.getVidas() == 5)) {
            System.out.println("Perdio el juego, suerte la proxima");
        } else if (Ah.getJugadas() == Ah.getLargo()) {
            System.out.println("FELICIDADES, ENCONTRO LA PALABRA");
        }

    }

    public void LetraEncontrada(Ahorcado Ah) {
        System.out.println("la letra si esta");
        // System.out.println("en el espacio " + i);
        Ah.setJugadas(Ah.getJugadas() + 1);
        System.out.println("lleva " + Ah.getJugadas() + " letras encontradas");
    }

    public void LetraNOEnontrada(Ahorcado Ah) {
        System.out.println("no esta, perdio una vida");
        int vidas = Ah.getVidas() - 1;
        Ah.setVidas(vidas);
        dibujo(Ah);
    }

    /*public void Encontradas(Ahorcado Ah) {
        System.out.println("ha encontrado" + Ah.getJugadas() + " letras");
    }

    public void Vidas(Ahorcado Ah) {
        System.out.println("le quedan " + Ah.getVidas() + "vidas");
        dibujo(Ah);
    }
     */
    public void dibujo(Ahorcado Ah) {

        if (Ah.getVidas() > 6) {
            System.out.println(".___________    ");
            System.out.println("|           |   ");

        } else if (Ah.getVidas() > 5) {
            System.out.println(".___________    ");
            System.out.println("|          |    ");
            System.out.println("|          O    ");

        } else if (Ah.getVidas() > 4) {
            System.out.println(".___________    ");
            System.out.println("|          |    ");
            System.out.println("|          O    ");
            System.out.println("|          |    ");
            System.out.println("|          |    ");
            System.out.println("|                ");
            System.out.println("|                ");
        } else if (Ah.getVidas() > 3) {
            System.out.println(".___________    ");
            System.out.println("|          |    ");
            System.out.println("|          O    ");
            System.out.println("|         /|    ");
            System.out.println("|          |    ");

        } else if (Ah.getVidas() > 2) {
            System.out.println(".___________    ");
            System.out.println("|          |    ");
            System.out.println("|          O    ");
            System.out.println("|         /|\\  ");
            System.out.println("|          |    ");

        } else if (Ah.getVidas() > 1) {
            System.out.println(".___________    ");
            System.out.println("|          |    ");
            System.out.println("|          O    ");
            System.out.println("|         /|\\  ");
            System.out.println("|          |    ");
            System.out.println("|           \\  ");
        } else if (Ah.getVidas() > 0) {
            System.out.println(".___________     ");
            System.out.println("|           |    ");
            System.out.println("|           O    ");
            System.out.println("|          /|\\  ");
            System.out.println("|           |    ");
            System.out.println("|          / \\  ");
        } else {
            System.out.println(".___________    ");
            System.out.println("|          |    ");
            System.out.println("|          0    ");
            System.out.println("|         /|\\  ");
            System.out.println("|          |    ");
            System.out.println("|         / \\  ");
            System.out.println("|         ***   ");

        }
    }

    public void JuegoAhorcado(Ahorcado Ah) {
        Longitud(Ah);
        BuscarLetra(Ah);

    }
}
