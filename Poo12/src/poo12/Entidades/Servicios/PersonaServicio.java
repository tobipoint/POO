/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo12.Entidades.Servicios;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import poo12.Entidades.Persona;

/**
 *
 * @author Usuario
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    Persona P1 = new Persona();

    public Persona crearPersona() {
        System.out.println("introduzca su nombre");
        P1.setNombre(leer.next());
        System.out.println("introduza fecha de nacimiento");

        P1.setDia(leer.nextInt());
        P1.setMes(leer.nextInt());
        P1.setAnio(leer.nextInt() - 1900);
        Date fecha = new Date(P1.getAnio(), P1.getMes(), P1.getDia());
        P1.setNacimiento(fecha);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechanacim = sdf.format(P1.getNacimiento());
        System.out.println("nacimiento: " + fechanacim);
        CalcularEdad(P1);
        return P1;
    }

    public void CalcularEdad(Persona P1) {
        SimpleDateFormat aa = new SimpleDateFormat("dd/MM/yyyy");
        String fechahoy = aa.format(P1.getHoy());
        System.out.println("hoy es: " +fechahoy);

        LocalDate h = LocalDate.now();
        LocalDate n = LocalDate.of(P1.getAnio() + 1900, Month.of(P1.getMes()), P1.getDia());
        int edad1 = (int) (ChronoUnit.YEARS.between(n, h));
        System.out.println("tu edad es: " + edad1);

        /*        
         LocalDate h = LocalDate.now();
         LocalDate n = LocalDate.of(P1.getAnio(), Month.of(P1.getMes()),P1.getDia());
         Period diferencia = Period.between(n,h);
         System.out.println("tu edad es: " +diferencia.getYears()+ " años");
         */
        Menorque(P1, edad1);
    }

    public void Menorque(Persona P1, int edad1) {
        System.out.println("introduzca una edad");
        int edad2 = leer.nextInt();
        boolean s = false;
        if (edad2 < edad1) {
            s = true;
            System.out.println(s);
            System.out.println("es menor que vos");
        } else {
            System.out.println(s);
            System.out.println("es mayor que vos");
        }
    }

}
