
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comunicacion {

    @SerializedName("version")
    @Expose
    private long version;
    @SerializedName("telefonoFijo")
    @Expose
    private boolean telefonoFijo;
    @SerializedName("internet")
    @Expose
    private boolean internet;
    @SerializedName("coberturaCelular")
    @Expose
    private boolean coberturaCelular;
    @SerializedName("noTiene")
    @Expose
    private boolean noTiene;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public boolean isTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(boolean telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean isCoberturaCelular() {
        return coberturaCelular;
    }

    public void setCoberturaCelular(boolean coberturaCelular) {
        this.coberturaCelular = coberturaCelular;
    }

    public boolean isNoTiene() {
        return noTiene;
    }

    public void setNoTiene(boolean noTiene) {
        this.noTiene = noTiene;
    }

}
