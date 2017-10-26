
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UsoOtroProductivo {

    @SerializedName("version")
    @Expose
    private Object version;
    @SerializedName("comercio")
    @Expose
    private boolean comercio;
    @SerializedName("turismo")
    @Expose
    private boolean turismo;
    @SerializedName("industria")
    @Expose
    private boolean industria;
    @SerializedName("mineria")
    @Expose
    private boolean mineria;
    @SerializedName("hidrocarburos")
    @Expose
    private boolean hidrocarburos;

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public boolean isComercio() {
        return comercio;
    }

    public void setComercio(boolean comercio) {
        this.comercio = comercio;
    }

    public boolean isTurismo() {
        return turismo;
    }

    public void setTurismo(boolean turismo) {
        this.turismo = turismo;
    }

    public boolean isIndustria() {
        return industria;
    }

    public void setIndustria(boolean industria) {
        this.industria = industria;
    }

    public boolean isMineria() {
        return mineria;
    }

    public void setMineria(boolean mineria) {
        this.mineria = mineria;
    }

    public boolean isHidrocarburos() {
        return hidrocarburos;
    }

    public void setHidrocarburos(boolean hidrocarburos) {
        this.hidrocarburos = hidrocarburos;
    }

}
