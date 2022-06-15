/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Usuario
 */
public class Poo11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int dia, mes, anio;
        System.out.println("ingere dia de nacimiento");
        dia = leer.nextInt();
        System.out.println("ingere mes de nacimiento");
        mes = leer.nextInt();
        System.out.println("ingere año de nacimiento");
        anio = leer.nextInt();

        LocalDate nacimiento = LocalDate.of(anio, Month.of(mes),dia);
        LocalDate hoy = LocalDate.now();

        System.out.println("nacimiento " +nacimiento);
        System.out.println("hoy es: " +hoy);
        
        Period diferencia = Period.between(nacimiento, hoy);
        System.out.println("dias: " +diferencia.getDays());
        System.out.println("meses: " +diferencia.getMonths());
        System.out.println("años: " +diferencia.getYears());
        
        
        
        
        
        
/*
        SimpleDateFormat hoyyy = new SimpleDateFormat("dd/MM/yyyy");
        String fechahoy = hoyyy.format(hoy);
        System.out.println("hoy es " + hoy);

        //SimpleDateFormat nueva = new SimpleDateFormat("dd/MM/yyyy");
        //String ff = nueva.format(nacimiento);
        long diferencia;
        diferencia = hoy.getTime() - nacimiento.getTime();
        
        //TimeUnit edad = TimeUnit.DAYS;
        //long Dias  = edad.convert(diferencia, TimeUnit.MILLISECONDS);

        //System.out.println(Dias);
        SimpleDateFormat edad1 = new SimpleDateFormat("dd/MM/yyyy");
        String diferencia1 = edad1.format(diferencia);
        System.out.println(diferencia1);

        //String edad1 = edad.toLocaleString();
        //      SimpleDateFormat nueva = new SimpleDateFormat("yyyy");
//        String fa = nueva.format(edad);
        //System.out.println("hay " + edad1 + " años diferencia");
   
        
        
        
        
*/}

}
