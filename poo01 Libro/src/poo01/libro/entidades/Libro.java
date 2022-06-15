/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo01.libro.entidades;

/**
 *
 * @author Usuario
 */
public class Libro {
    
    public int ISB;
     public String titulo;
     public String autor;
     public int Paginas;

    public Libro() {
    }

    public Libro(int ISB, String titulo, String autor, int Paginas) {
        this.ISB = ISB;
        this.titulo = titulo;
        this.autor = autor;
        this.Paginas = Paginas;
    }

    public int getISB() {
        return ISB;
    }

    public void setISB(int ISB) {
        this.ISB = ISB;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISB=" + ISB + ", titulo=" + titulo + ", autor=" + autor + ", Paginas=" + Paginas + '}';
    }

    
}
