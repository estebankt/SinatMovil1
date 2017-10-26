
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UsoSocial {

    @SerializedName("version")
    @Expose
    private Object version;
    @SerializedName("educacion")
    @Expose
    private boolean educacion;
    @SerializedName("salud")
    @Expose
    private boolean salud;
    @SerializedName("culto")
    @Expose
    private boolean culto;
    @SerializedName("cementerio")
    @Expose
    private boolean cementerio;
    @SerializedName("recreacion")
    @Expose
    private boolean recreacion;
    @SerializedName("espacioPublico")
    @Expose
    private boolean espacioPublico;
    @SerializedName("casaComunal")
    @Expose
    private boolean casaComunal;

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public boolean isEducacion() {
        return educacion;
    }

    public void setEducacion(boolean educacion) {
        this.educacion = educacion;
    }

    public boolean isSalud() {
        return salud;
    }

    public void setSalud(boolean salud) {
        this.salud = salud;
    }

    public boolean isCulto() {
        return culto;
    }

    public void setCulto(boolean culto) {
        this.culto = culto;
    }

    public boolean isCementerio() {
        return cementerio;
    }

    public void setCementerio(boolean cementerio) {
        this.cementerio = cementerio;
    }

    public boolean isRecreacion() {
        return recreacion;
    }

    public void setRecreacion(boolean recreacion) {
        this.recreacion = recreacion;
    }

    public boolean isEspacioPublico() {
        return espacioPublico;
    }

    public void setEspacioPublico(boolean espacioPublico) {
        this.espacioPublico = espacioPublico;
    }

    public boolean isCasaComunal() {
        return casaComunal;
    }

    public void setCasaComunal(boolean casaComunal) {
        this.casaComunal = casaComunal;
    }

}
