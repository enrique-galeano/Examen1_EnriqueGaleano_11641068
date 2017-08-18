
import java.util.ArrayList;
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
public class Usuario {
    private String nombredeUsuario;
    private String contra;
    private Date fecha;
    private int numeroTelefonico;
    private String correo;
    private String nombreCompleto;
    private String generoFavorito;
    private ArrayList amigos = new ArrayList();

    public Usuario() {
    }
    
    public Usuario(String nombredeUsuario, String contra, Date fecha, int numeroTelefonico, String correo, String nombreCompleto, String generoFavorito) {
        this.nombredeUsuario = nombredeUsuario;
        this.contra = contra;
        this.fecha = fecha;
        this.numeroTelefonico = numeroTelefonico;
        this.correo = correo;
        this.nombreCompleto = nombreCompleto;
        this.generoFavorito = generoFavorito;
    }

    public String getNombredeUsuario() {
        return nombredeUsuario;
    }

    public void setNombredeUsuario(String nombredeUsuario) {
        this.nombredeUsuario = nombredeUsuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getGeneroFavorito() {
        return generoFavorito;
    }

    public void setGeneroFavorito(String generoFavorito) {
        this.generoFavorito = generoFavorito;
    }

    public ArrayList getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList amigos) {
        this.amigos = amigos;
    }
    
    
    
    
}
