
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Propietario {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("version")
    @Expose
    private Object version;
    @SerializedName("idPredio")
    @Expose
    private long idPredio;
    @SerializedName("persona")
    @Expose
    private Persona persona;
    @SerializedName("representanteLegal")
    @Expose
    private Object representanteLegal;
    @SerializedName("anyosPosesion")
    @Expose
    private long anyosPosesion;
    @SerializedName("conyuge")
    @Expose
    private Object conyuge;
    @SerializedName("estadoCivil")
    @Expose
    private Object estadoCivil;
    @SerializedName("conviveConyugue")
    @Expose
    private Object conviveConyugue;
    @SerializedName("alicuota")
    @Expose
    private long alicuota;
    @SerializedName("ciu")
    @Expose
    private Object ciu;
    @SerializedName("exento")
    @Expose
    private Object exento;
    @SerializedName("representante")
    @Expose
    private boolean representante;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public long getIdPredio() {
        return idPredio;
    }

    public void setIdPredio(long idPredio) {
        this.idPredio = idPredio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Object getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(Object representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public long getAnyosPosesion() {
        return anyosPosesion;
    }

    public void setAnyosPosesion(long anyosPosesion) {
        this.anyosPosesion = anyosPosesion;
    }

    public Object getConyuge() {
        return conyuge;
    }

    public void setConyuge(Object conyuge) {
        this.conyuge = conyuge;
    }

    public Object getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Object estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Object getConviveConyugue() {
        return conviveConyugue;
    }

    public void setConviveConyugue(Object conviveConyugue) {
        this.conviveConyugue = conviveConyugue;
    }

    public long getAlicuota() {
        return alicuota;
    }

    public void setAlicuota(long alicuota) {
        this.alicuota = alicuota;
    }

    public Object getCiu() {
        return ciu;
    }

    public void setCiu(Object ciu) {
        this.ciu = ciu;
    }

    public Object getExento() {
        return exento;
    }

    public void setExento(Object exento) {
        this.exento = exento;
    }

    public boolean isRepresentante() {
        return representante;
    }

    public void setRepresentante(boolean representante) {
        this.representante = representante;
    }

}
