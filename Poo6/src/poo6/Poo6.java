package poo6;

import java.util.Scanner;
import poo6.Entidades.Cafetera;
import poo6.Nespresso.CafeteraNespresso;


public class Poo6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraNespresso Cn = new CafeteraNespresso();
        Cafetera C1 = Cn.LLenarCafetera();
        System.out.println("que desea realizar?");
        int op;
        do {
            System.out.println("1: servir Taza");
            System.out.println("2: vaciar cafetera");
            System.out.println("3: agregar cafe");
            System.out.println("4: ver cantidad actual");
            System.out.println("5: finalizar");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    Cn.ServirTaza(C1);
                    break;
                case 2:
                    Cn.VaciarCafetera(C1);
                    break;
                case 3:
                    Cn.AgregarCafe(C1);
                    break;
                case 4:
                    System.out.println("la capacidad actual es de: " +C1.getCantActual()+ " ml");
                    break;
                case 5:
                    System.out.println("hasta el proximo cafe");
                    break;
            }
        } while (op != 5);

    }

}
