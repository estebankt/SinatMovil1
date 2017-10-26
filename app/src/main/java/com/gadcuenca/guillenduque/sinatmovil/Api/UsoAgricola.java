
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UsoAgricola {

    @SerializedName("version")
    @Expose
    private Object version;
    @SerializedName("tecnificada")
    @Expose
    private boolean tecnificada;
    @SerializedName("tradicional")
    @Expose
    private boolean tradicional;
    @SerializedName("subsistencia")
    @Expose
    private boolean subsistencia;
    @SerializedName("huertoFamiliar")
    @Expose
    private boolean huertoFamiliar;

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public boolean isTecnificada() {
        return tecnificada;
    }

    public void setTecnificada(boolean tecnificada) {
        this.tecnificada = tecnificada;
    }

    public boolean isTradicional() {
        return tradicional;
    }

    public void setTradicional(boolean tradicional) {
        this.tradicional = tradicional;
    }

    public boolean isSubsistencia() {
        return subsistencia;
    }

    public void setSubsistencia(boolean subsistencia) {
        this.subsistencia = subsistencia;
    }

    public boolean isHuertoFamiliar() {
        return huertoFamiliar;
    }

    public void setHuertoFamiliar(boolean huertoFamiliar) {
        this.huertoFamiliar = huertoFamiliar;
    }

}
