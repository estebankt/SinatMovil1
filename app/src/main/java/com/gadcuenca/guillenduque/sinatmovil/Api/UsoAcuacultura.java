
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UsoAcuacultura {

    @SerializedName("version")
    @Expose
    private Object version;
    @SerializedName("camaronera")
    @Expose
    private boolean camaronera;
    @SerializedName("otros")
    @Expose
    private boolean otros;

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public boolean isCamaronera() {
        return camaronera;
    }

    public void setCamaronera(boolean camaronera) {
        this.camaronera = camaronera;
    }

    public boolean isOtros() {
        return otros;
    }

    public void setOtros(boolean otros) {
        this.otros = otros;
    }

}
