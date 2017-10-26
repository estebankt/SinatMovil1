
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SinUso {

    @SerializedName("version")
    @Expose
    private Object version;
    @SerializedName("sinAprovechamiento")
    @Expose
    private boolean sinAprovechamiento;
    @SerializedName("noUtilizable")
    @Expose
    private boolean noUtilizable;

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public boolean isSinAprovechamiento() {
        return sinAprovechamiento;
    }

    public void setSinAprovechamiento(boolean sinAprovechamiento) {
        this.sinAprovechamiento = sinAprovechamiento;
    }

    public boolean isNoUtilizable() {
        return noUtilizable;
    }

    public void setNoUtilizable(boolean noUtilizable) {
        this.noUtilizable = noUtilizable;
    }

}
