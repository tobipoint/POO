package poo8.Entidades.Servicio;

import java.util.Scanner;
import poo8.Entidades.Cadena;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena C1 = new Cadena();

    public Cadena CadenaServicio() {
        System.out.println("ingrese una frase");
        C1.setFrase(leer.next());

        C1.setLargo(C1.getFrase().length());
        System.out.println("la frase tiene " + C1.getLargo() + " letras");
        return C1;
    }

    public void MostrarVocales(Cadena C1) {
        int cont = 0;
        for (int i = 0; i < C1.getLargo(); i++) {
            switch (C1.getFrase().charAt(i)) {
                case 'a':
                    cont = cont + 1;
                    break;
                case 'e':
                    cont = cont + 1;
                    break;
                case 'i':
                    cont = cont + 1;
                    break;
                case 'o':
                    cont = cont + 1;
                    break;
                case 'u':
                    cont = cont + 1;
                    break;
            }
        }
        System.out.println("hay " + cont + " cantidad de vocales");
    }

    public void InvertirFrase(Cadena C1) {
        char Frase2;
        System.out.println("la frase invertida es: ");
        for (int i = C1.getLargo(); i > 0; i--) {
            Frase2 = (C1.getFrase().charAt(i - 1));
            System.out.print("" + Frase2);
        }
        System.out.println(" ");
    }

    public void VecesRepetido(Cadena C1) {
        System.out.println("ingrese una letra y contaremos las repeticiones");
        char a = leer.next().charAt(0);
        int cont = 0;
        for (int i = 0; i < C1.getLargo(); i++) {
            switch (C1.getFrase().charAt(i)) {
                case 'a':
                    cont = cont + 1;
            }         
        }
        System.out.println("la letra " +a+ " se encontro " + cont + " veces");
    }

    public void CompararFrases(Cadena C1) {
        String Frase2;
        System.out.println("ingrese una nueva frase");
        Frase2 = leer.next();
        int largo2 = Frase2.length();
        int comparacion = C1.getLargo() - largo2;
        System.out.println("las frases tienen " + comparacion + " letras de diferencia");
    }

    public void Unir(Cadena C1) {
        String Unir;
        String frase2;
        System.out.println("ingrese una frase para unirla");
        frase2 = leer.next();
        Unir = C1.getFrase().concat(frase2);
        System.out.println(Unir);
    }

    public void reemplazar(Cadena C1) {
        String letra;
        String nueva;
        System.out.println("ingrese un caracter reemplazar las letras a");
        letra = leer.next();
        nueva = C1.getFrase().replace("a", letra);
        System.out.println(nueva);

    }

    public void Contiene(Cadena C1) {
        boolean esta = false;
        System.out.println("ingrese un caracter para saber si esta");
        char letra = leer.next().charAt(0);
        for (int i = 0; i < C1.getLargo(); i++) {
            if (C1.getFrase().equals(letra)) {
                esta = true;
                System.out.println(esta);
                break;
            } else {
                System.out.println(esta);
            }
            break;
        }

    }
}
