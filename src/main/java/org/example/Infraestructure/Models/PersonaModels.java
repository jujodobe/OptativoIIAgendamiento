package org.example.Infraestructure.Models;
import java.util.Date;
public class PersonaModels {

    public int IdPersona;
    public String Nombre;
    public String Apellido;
    public String TipoDocumento;
    public String NroDocumento;
    public String Direccion;
    public String Celular;
    public String Email;
    public Date FechaNacimiento;
    public String estado;

    public PersonaModels(int IdPersona, String Nombre, String Apellido, String TipoDocumento, String NroDocumento, String Direccion, String Celular, String Email, Date FechaNacimiento, String estado) {
        this.IdPersona = IdPersona;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.TipoDocumento = TipoDocumento;
        this.NroDocumento = NroDocumento;
        this.Direccion = Direccion;
        this.Celular = Celular;
        this.Email = Email;
        this.FechaNacimiento = FechaNacimiento;
        this.estado = estado;
    }

    public PersonaModels() {
    }

    public int getIdPersona() {
        return IdPersona;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public String getNroDocumento() {
        return NroDocumento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getCelular() {
        return Celular;
    }

    public String getEmail() {
        return Email;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setIdPersona(int IdPersona) {
        this.IdPersona = IdPersona;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public void setNroDocumento(String NroDocumento) {
        this.NroDocumento = NroDocumento;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
