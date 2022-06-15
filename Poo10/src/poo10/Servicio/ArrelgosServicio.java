package poo10.Servicio;

import poo10.Entidades.Arreglos;

public class ArrelgosServicio {

    Arreglos A1 = new Arreglos();

    public Arreglos ArrelgosServicio() {
        A1.setArregloA(new int[50]);
        A1.setArregloB(new int[20]);

        return A1;
    }

    public void Rellenoarreglo(Arreglos A1) {
        int num;
        int arreglos[];
        arreglos = new int[50];

        for (int i = 0; i < 50; i++) {
            arreglos[i] = (int) (Math.random() * 30);
        }

        A1.setArregloA(arreglos);

        for (int i = 0; i < 50; i++) {
            System.out.print(" / " + A1.getArregloA()[i]);
        }
        System.out.println("   ");

        int aux;

        for (int i = 0; i < (50 - 1); i++) {
            for (int j = 0; j < (50 - 1); j++) {
                if (arreglos[j] > arreglos[j + 1]) {
                    aux = arreglos[j];
                    arreglos[j] = arreglos[j + 1];
                    arreglos[j + 1] = aux;
                }
            }
        }

        System.out.println("arreglo ordenado ");
        A1.setArregloA(arreglos);

        for (int i = 0; i < 50; i++) {
            System.out.print(" / " + A1.getArregloA()[i]);
        }
        System.out.println(" ");

        int arreglos2[];
        arreglos2 = new int[20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                System.arraycopy(arreglos, 0, arreglos2, 0, 10);
            }
            arreglos2[i] = 5;
        }
        System.out.println("2do Arreglo");

        A1.setArregloB(arreglos2);
        System.out.println(" ");

        for (int i = 0; i < 20; i++) {
            System.out.print(" / " + A1.getArregloB()[i]);
        }
        System.out.println(" ");

    }
}
