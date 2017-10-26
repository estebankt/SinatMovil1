
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UsoPecuario {

    @SerializedName("version")
    @Expose
    private Object version;
    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("bovino")
    @Expose
    private boolean bovino;
    @SerializedName("caprino")
    @Expose
    private boolean caprino;
    @SerializedName("porcino")
    @Expose
    private boolean porcino;
    @SerializedName("avicola")
    @Expose
    private boolean avicola;
    @SerializedName("otro")
    @Expose
    private boolean otro;
    @SerializedName("tipoExplotacionPecuaria")
    @Expose
    private String tipoExplotacionPecuaria;

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public boolean isBovino() {
        return bovino;
    }

    public void setBovino(boolean bovino) {
        this.bovino = bovino;
    }

    public boolean isCaprino() {
        return caprino;
    }

    public void setCaprino(boolean caprino) {
        this.caprino = caprino;
    }

    public boolean isPorcino() {
        return porcino;
    }

    public void setPorcino(boolean porcino) {
        this.porcino = porcino;
    }

    public boolean isAvicola() {
        return avicola;
    }

    public void setAvicola(boolean avicola) {
        this.avicola = avicola;
    }

    public boolean isOtro() {
        return otro;
    }

    public void setOtro(boolean otro) {
        this.otro = otro;
    }

    public String getTipoExplotacionPecuaria() {
        return tipoExplotacionPecuaria;
    }

    public void setTipoExplotacionPecuaria(String tipoExplotacionPecuaria) {
        this.tipoExplotacionPecuaria = tipoExplotacionPecuaria;
    }

}
