
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UsoConservacion {

    @SerializedName("version")
    @Expose
    private Object version;
    @SerializedName("reservaNatural")
    @Expose
    private boolean reservaNatural;
    @SerializedName("proteccion")
    @Expose
    private boolean proteccion;
    @SerializedName("otro")
    @Expose
    private boolean otro;

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public boolean isReservaNatural() {
        return reservaNatural;
    }

    public void setReservaNatural(boolean reservaNatural) {
        this.reservaNatural = reservaNatural;
    }

    public boolean isProteccion() {
        return proteccion;
    }

    public void setProteccion(boolean proteccion) {
        this.proteccion = proteccion;
    }

    public boolean isOtro() {
        return otro;
    }

    public void setOtro(boolean otro) {
        this.otro = otro;
    }

}
