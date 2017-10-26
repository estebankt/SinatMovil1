
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UsoOtro {

    @SerializedName("version")
    @Expose
    private long version;
    @SerializedName("infraestructuraEspecial")
    @Expose
    private boolean infraestructuraEspecial;
    @SerializedName("otros")
    @Expose
    private boolean otros;
    @SerializedName("otrosDescripcion")
    @Expose
    private Object otrosDescripcion;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public boolean isInfraestructuraEspecial() {
        return infraestructuraEspecial;
    }

    public void setInfraestructuraEspecial(boolean infraestructuraEspecial) {
        this.infraestructuraEspecial = infraestructuraEspecial;
    }

    public boolean isOtros() {
        return otros;
    }

    public void setOtros(boolean otros) {
        this.otros = otros;
    }

    public Object getOtrosDescripcion() {
        return otrosDescripcion;
    }

    public void setOtrosDescripcion(Object otrosDescripcion) {
        this.otrosDescripcion = otrosDescripcion;
    }

}
