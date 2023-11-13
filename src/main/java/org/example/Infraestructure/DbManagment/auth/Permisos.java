/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Infraestructure.DbManagment.auth;

import java.sql.SQLException;
import org.example.Infraestructure.Conections.Conexiones;
import org.example.Infraestructure.DbManagment.contactos.Personas;
import org.example.Infraestructure.Models.PermisosModel;
import org.example.Infraestructure.Models.UsuariosModel;
import org.example.Services.Auth.UsuariosService;

/**
 *
 * @author Usuario
 */
public class Permisos {
     private Conexiones conexion;
     private Authentication usuarios;
     
     public Permisos(String userBD, String passDB, String hostDB, String portDB, String dataBase) {
        this.conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
        this.usuarios = new Authentication(userBD, passDB, hostDB, portDB, dataBase);
     }
     
     public void registrarPermisos(PermisosModel permisos){
           try {
            UsuariosModel usuarioModel = new UsuariosModel();
            PermisosModel permisosModelo = new PermisosModel();
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            
            
            conexion.getQuerySQL().execute("INSERT INTO permisos("
                    +                                                               " idUsuario, "
                    +                                                               " grupo, "
                    +                                                               " pantalla, "
                    +                                                               " insertar, "
                    +                                                               " modificar, "
                    +                                                               " eliminar, "
                    +                                                               " consultar)"
                                                                                  + "values(" + 
                                                                                    permisos.usuario.getIdUsuario() + ", '" +
                                                                                    permisos.grupo + "', '"+ 
                                                                                    permisos.pantalla + "', '" + 
                                                                                    permisos.insertar + "," + 
                                                                                    permisos.modificar + "," + 
                                                                                    permisos.eliminar + "," + 
                                                                                    permisos.consultar + " ) ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
     }
}
