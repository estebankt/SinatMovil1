
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Direccion {

    @SerializedName("version")
    @Expose
    private Object version;
    @SerializedName("sector")
    @Expose
    private String sector;
    @SerializedName("calle")
    @Expose
    private Object calle;
    @SerializedName("numero")
    @Expose
    private Object numero;
    @SerializedName("pisoOficina")
    @Expose
    private Object pisoOficina;
    @SerializedName("ciudad")
    @Expose
    private Object ciudad;
    @SerializedName("telefono")
    @Expose
    private Object telefono;
    @SerializedName("tipoTelefono")
    @Expose
    private String tipoTelefono;
    @SerializedName("parroquia")
    @Expose
    private Parroquia parroquia;
    @SerializedName("email")
    @Expose
    private Object email;

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Object getCalle() {
        return calle;
    }

    public void setCalle(Object calle) {
        this.calle = calle;
    }

    public Object getNumero() {
        return numero;
    }

    public void setNumero(Object numero) {
        this.numero = numero;
    }

    public Object getPisoOficina() {
        return pisoOficina;
    }

    public void setPisoOficina(Object pisoOficina) {
        this.pisoOficina = pisoOficina;
    }

    public Object getCiudad() {
        return ciudad;
    }

    public void setCiudad(Object ciudad) {
        this.ciudad = ciudad;
    }

    public Object getTelefono() {
        return telefono;
    }

    public void setTelefono(Object telefono) {
        this.telefono = telefono;
    }

    public String getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

    public Parroquia getParroquia() {
        return parroquia;
    }

    public void setParroquia(Parroquia parroquia) {
        this.parroquia = parroquia;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

}
