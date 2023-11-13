package org.example.Infraestructure.DbManagment.contactos;

import org.example.Infraestructure.Conections.Conexiones;
import org.example.Infraestructure.Models.PersonaModels;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Personas {


    private Conexiones conexion;

    public Personas(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarPersona(PersonaModels persona){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO personas(" +
                    "'nombre', " +
                    "'apellido', " +
                    "'tipodocumento', " +
                    "'nro_documento', " +
                    "'direccion'," +
                    "'celular', " +
                    "'email', " +
                    "'fechaNacimiento', " +
                    "'estado') " +
                    "values('" +
                    persona.Nombre + "', '" +
                    persona.Apellido + "', '" +
                    persona.TipoDocumento + "', '" +
                    persona.NroDocumento + "', '" +
                    persona.Direccion + "', '" +
                    persona.Celular + "', '" +
                    persona.Email + "', '" +
                    persona.FechaNacimiento + "', '" +
                    persona.estado + "'))");
            conexion.conexionDB().close();
            return "La persona " + persona.Nombre + " fue registrado correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarPersona(PersonaModels persona){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE personas SET " +
                    "nombre' = '" + persona.Nombre + "'," +
                    "apellido = '" + persona.Apellido + "'," +
                    "tipodocumento = '" + persona.TipoDocumento + "'," +
                    "nrodocumento = '" + persona.NroDocumento + "'," +
                    "direccion = '" + persona.Direccion + "'," +
                    "celular = '" + persona.Celular + "'," +
                    "email = '" + persona.Email + "'," +
                    "fechaNacimiento = '" + persona.FechaNacimiento + "'," +
                    "estado = '" + persona.estado + "' Where personas.idPersona = " + persona.IdPersona);
            conexion.conexionDB().close();
            return "Los datos de la persona " + persona.Nombre + " fue modificado correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public PersonaModels consultarPersona(int id){
        PersonaModels persona = new PersonaModels();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from personas where id = " + id));
            if(conexion.getResultadoQuery().next()){
                return cargarDatosPersona(persona, conexion);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    public PersonaModels consultarPersonaPorDocumento(String documento){
        PersonaModels persona = new PersonaModels();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from personas where nroDocumento = '" + documento + "'"));
            if(conexion.getResultadoQuery().next()){
                return cargarDatosPersona(persona, conexion);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    
    private PersonaModels cargarDatosPersona(PersonaModels persona, Conexiones conexion){
        try {
            persona.IdPersona = conexion.getResultadoQuery().getInt("id");
            persona.Nombre = conexion.getResultadoQuery().getString("nombre");
            persona.Apellido = conexion.getResultadoQuery().getString("apellido");
            persona.TipoDocumento = conexion.getResultadoQuery().getString("TipoDocumento");
            persona.NroDocumento = conexion.getResultadoQuery().getString("nroDocumento");
            persona.Direccion = conexion.getResultadoQuery().getString("direccion");
            persona.Email = conexion.getResultadoQuery().getString("email");
            persona.Celular = conexion.getResultadoQuery().getString("celular");
            return persona;
        } catch (SQLException ex) {
            Logger.getLogger(Personas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
