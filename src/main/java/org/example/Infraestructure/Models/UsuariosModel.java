package org.example.Infraestructure.Models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class UsuariosModel {
    private int IdUsuario;
    private PersonaModels persona;
    private String Usuario;
    private String Contraseña;
    private String estado;

    /**
     * <p> WARNING: </p> Constructor utilizado solamente para cargar las consultas realizadas desde la base de datos
     * @param IdUsuario
     * @param persona
     * @param Usuario
     * @param Contraseña
     * @param estado 
     */
    
    public UsuariosModel(int IdUsuario, PersonaModels persona, String Usuario, String Contraseña, String estado) {
        this.IdUsuario = IdUsuario;
        this.persona = persona;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.estado = estado;
    }

    public UsuariosModel() {
        
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public PersonaModels getPersona() {
        return persona;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public String getEstado() {
        return estado;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public void setPersona(PersonaModels persona) {
        this.persona = persona;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
