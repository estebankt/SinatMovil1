
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UsoTierra {

    @SerializedName("version")
    @Expose
    private Object version;
    @SerializedName("usoAgricola")
    @Expose
    private UsoAgricola usoAgricola;
    @SerializedName("usoPecuario")
    @Expose
    private UsoPecuario usoPecuario;
    @SerializedName("usoForestal")
    @Expose
    private UsoForestal usoForestal;
    @SerializedName("usoAcuacultura")
    @Expose
    private UsoAcuacultura usoAcuacultura;
    @SerializedName("usoConservacion")
    @Expose
    private UsoConservacion usoConservacion;
    @SerializedName("usoHabitacional")
    @Expose
    private String usoHabitacional;
    @SerializedName("sinUso")
    @Expose
    private SinUso sinUso;
    @SerializedName("usoOtroProductivo")
    @Expose
    private UsoOtroProductivo usoOtroProductivo;
    @SerializedName("usoSocial")
    @Expose
    private UsoSocial usoSocial;
    @SerializedName("usoOtro")
    @Expose
    private UsoOtro usoOtro;

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public UsoAgricola getUsoAgricola() {
        return usoAgricola;
    }

    public void setUsoAgricola(UsoAgricola usoAgricola) {
        this.usoAgricola = usoAgricola;
    }

    public UsoPecuario getUsoPecuario() {
        return usoPecuario;
    }

    public void setUsoPecuario(UsoPecuario usoPecuario) {
        this.usoPecuario = usoPecuario;
    }

    public UsoForestal getUsoForestal() {
        return usoForestal;
    }

    public void setUsoForestal(UsoForestal usoForestal) {
        this.usoForestal = usoForestal;
    }

    public UsoAcuacultura getUsoAcuacultura() {
        return usoAcuacultura;
    }

    public void setUsoAcuacultura(UsoAcuacultura usoAcuacultura) {
        this.usoAcuacultura = usoAcuacultura;
    }

    public UsoConservacion getUsoConservacion() {
        return usoConservacion;
    }

    public void setUsoConservacion(UsoConservacion usoConservacion) {
        this.usoConservacion = usoConservacion;
    }

    public String getUsoHabitacional() {
        return usoHabitacional;
    }

    public void setUsoHabitacional(String usoHabitacional) {
        this.usoHabitacional = usoHabitacional;
    }

    public SinUso getSinUso() {
        return sinUso;
    }

    public void setSinUso(SinUso sinUso) {
        this.sinUso = sinUso;
    }

    public UsoOtroProductivo getUsoOtroProductivo() {
        return usoOtroProductivo;
    }

    public void setUsoOtroProductivo(UsoOtroProductivo usoOtroProductivo) {
        this.usoOtroProductivo = usoOtroProductivo;
    }

    public UsoSocial getUsoSocial() {
        return usoSocial;
    }

    public void setUsoSocial(UsoSocial usoSocial) {
        this.usoSocial = usoSocial;
    }

    public UsoOtro getUsoOtro() {
        return usoOtro;
    }

    public void setUsoOtro(UsoOtro usoOtro) {
        this.usoOtro = usoOtro;
    }

}
