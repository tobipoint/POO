/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Persona {
    // atributos 
    private String nombre;
    private String apellido;
    private Integer dni;
    private int altura;
    
    // constructores por defecto

    public Persona() {
    }
    // parametros
    public Persona(String nombre, String apellido, Integer dni, int altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
       this.altura = altura;
    }
    // getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", altura=" + altura + '}';
    }
    
    
    
    
}
