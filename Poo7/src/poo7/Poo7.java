package poo7;

import poo7.Entidades.Crear.CrearPersona;
import poo7.Entidades.Persona;

public class Poo7 {

    public static void main(String[] args) {

        System.out.println("-------------");
        System.out.println("1ra persona");

        CrearPersona Pp = new CrearPersona();
        Persona P1 = Pp.CrearPersona();
        Pp.CalcularIMC(P1);
        int IMC1 = P1.IMC;
        Pp.MayorEdad(P1);

        System.out.println("-------------");
        System.out.println("2da persona");

        Persona P2 = Pp.CrearPersona();
        Pp.CalcularIMC(P2);
        int IMC2 = P2.IMC;
        Pp.MayorEdad(P2);

        System.out.println("-------------");
        System.out.println("3ra persona");

        Persona P3 = Pp.CrearPersona();
        Pp.CalcularIMC(P3);
        int IMC3 = P3.IMC;
        Pp.MayorEdad(P3);

        System.out.println("-------------");
        System.out.println("4ta persona");

        Persona P4 = Pp.CrearPersona();
        Pp.CalcularIMC(P4);
        int IMC4 = P4.IMC;
        Pp.MayorEdad(P4);

        System.out.println("-------------");

        int IMCmalo = 0;
        int IMCbien = 0;
        int IMCpasado = 0;

        int[] vector;
        vector = new int[4];
        vector[0] = IMC1;
        vector[1] = IMC2;
        vector[2] = IMC3;
        vector[3] = IMC4;

        for (int i = 0; i < 4; i++) {
            switch (vector[i]) {
                case -1:
                    IMCmalo = 1 + IMCmalo;
                    break;
                case 0:
                    IMCbien = IMCbien + 1;
                    break;
                case 1:
                    IMCpasado = IMCpasado + 1;
                    break;
            }
        }

        System.out.println(IMCmalo);
        System.out.println(IMCbien);
        System.out.println(IMCpasado);
        double IMCmalo1 = (IMCmalo * 100) / 4;
        double IMCbien1 = (IMCbien * 100) / 4;
        double IMCpasado1 = (IMCpasado * 100) / 4;

        System.out.print("un " + IMCmalo1 + " % esta por debajo, un " + IMCbien1 + "% esta en el peso ideal, un " + IMCpasado1 + "% esta en sobrepeso");
        System.out.println(" ");
        
        int[] edades;
        edades = new int[4];
        edades[0] = P1.getEdad();
        edades[1] = P2.getEdad();
        edades[2] = P3.getEdad();
        edades[3] = P4.getEdad();

        int MayorEdad = 0;
        int Menoredad = 0;
        
        for (int i = 0; i < 4; i++) {
            if (edades[i] >= 18) {
                MayorEdad = MayorEdad + 1;
            } if (edades[i] < 18) {
               Menoredad = Menoredad + 1; 
            }
        }
        System.out.println("hay " +MayorEdad+ " que son mayores de edad y " +Menoredad+ " que son menores");
        System.out.println(" ");

    }
}
