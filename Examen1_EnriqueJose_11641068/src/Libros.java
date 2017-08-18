
import java.util.ArrayList;

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
    private String libros;
    private String descripcion;
    private int puntaje;
    private int copiasDisponibles;
    private String genero; // Fantasia, Romance, Accion, Historia
    private int valor;
    private String edicion;
    private String autor;
    private ArrayList lista; /*le puse lista por que no ehh creado la Clase Lista de AMIGOS*/

    public Libros() {
    }

    public Libros(String libros, String descripcion, int puntaje, int copiasDisponibles, String genero, int valor, String edicion, String autor, ArrayList lista) {
        this.libros = libros;
        this.descripcion = descripcion;
        this.puntaje = puntaje;
        this.copiasDisponibles = copiasDisponibles;
        this.genero = genero;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
        this.lista = lista;
    }

    public String getLibros() {
        return libros;
    }

    public void setLibros(String libros) {
        this.libros = libros;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Libros{" + "libros=" + libros + ", descripcion=" + descripcion + ", puntaje=" + puntaje + ", copiasDisponibles=" + copiasDisponibles + ", genero=" + genero + ", valor=" + valor + ", edicion=" + edicion + ", autor=" + autor + '}';
    }
    
    
    
}
