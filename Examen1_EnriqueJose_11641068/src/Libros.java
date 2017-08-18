
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriq
 */
public class Libros {
    private String titulo;
    private String discrepcion;
    private int puntaje;
    private int copias;
    private String g1, g2, g3, g4;
    private int valor;
    private String edicion;
    private String autor;
    private Date publica;

    public Libros() {
    }

    public Libros(String titulo, String discrepcion, int puntaje, int copias, String g1, String g2, String g3, String g4, int valor, String edicion, String autor, Date publica) {
        this.titulo = titulo;
        this.discrepcion = discrepcion;
        this.puntaje = puntaje;
        this.copias = copias;
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
        this.g4 = g4;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
        this.publica = publica;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiscrepcion() {
        return discrepcion;
    }

    public void setDiscrepcion(String discrepcion) {
        this.discrepcion = discrepcion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public String getG1() {
        return g1;
    }

    public void setG1(String g1) {
        this.g1 = g1;
    }

    public String getG2() {
        return g2;
    }

    public void setG2(String g2) {
        this.g2 = g2;
    }

    public String getG3() {
        return g3;
    }

    public void setG3(String g3) {
        this.g3 = g3;
    }

    public String getG4() {
        return g4;
    }

    public void setG4(String g4) {
        this.g4 = g4;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getPublica() {
        return publica;
    }

    public void setPublica(Date publica) {
        this.publica = publica;
    }

    @Override
    public String toString() {
        return "Libros " + "titulo " + titulo;
    }
    
}
