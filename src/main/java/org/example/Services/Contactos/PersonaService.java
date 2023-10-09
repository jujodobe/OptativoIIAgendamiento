package org.example.Services.Contactos;

import org.example.Infraestructure.DbManagment.contactos.Personas;
import org.example.Infraestructure.Models.PersonaModels;

public class PersonaService {

    Personas personasDB;
    public PersonaService(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        personasDB = new Personas(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarPersona(PersonaModels persona){
        if(validarDatos(persona)){
           return personasDB.registrarPersona(persona);
        }
        return "Ocurrió algún error, contactese con el Administrador";
    }

    public String modificarPersona(PersonaModels persona){
        if(validarDatos(persona)){
            return personasDB.modificarPersona(persona);
        }
        return "Ocurrió algún error, contactese con el Administrador";
    }


    public PersonaModels consultarPersonaPorId(int id){
        return  personasDB.consultarPersona(id);
    }
    
    public PersonaModels consultarPersonaPorDocumento(int documento){
        return  personasDB.consultarPersonaPorDocumento(documento);
    }

    private boolean validarDatos(PersonaModels persona) {
        try {
        if(persona.Nombre.trim().isEmpty())
            throw new Exception("El nombre no debe estar vacío");
        else if (persona.Nombre.trim().length() < 3) {
            throw new Exception("El nombre no tiene la longitud necesaria");
        }

    } catch (Exception e) {
        throw new RuntimeException(e);
    }
        return true;
    }

}