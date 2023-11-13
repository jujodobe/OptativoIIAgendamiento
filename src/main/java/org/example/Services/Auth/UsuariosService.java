package org.example.Services.Auth;

import org.example.Infraestructure.DbManagment.auth.Authentication;
import org.example.Infraestructure.Models.UsuariosModel;


public class UsuariosService {

    private Authentication usuarioDB;
    public UsuariosService(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        usuarioDB = new Authentication(userBD, passDB, hostDB, portDB, dataBase);
    }
    
    public UsuariosModel autenticar(String usuario){
       return usuarioDB.Autenticar(usuario);
    }

    public void registrarUsuario(UsuariosModel usuario){
        if(validarDatos(usuario))
            usuarioDB.registrarUsuario(usuario);
    }
   

    private boolean validarDatos(UsuariosModel usuario) {
        try {
            if (usuario.getUsuario().trim().isEmpty()) {
                throw new Exception("El nombre no debe estar vacío");
            } else if (usuario.getUsuario().trim().length() < 3) {
                throw new Exception("El nombre no tiene la longitud necesaria");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}