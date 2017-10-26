
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UsoForestal {

    @SerializedName("version")
    @Expose
    private Object version;
    @SerializedName("madera")
    @Expose
    private boolean madera;
    @SerializedName("pulpa")
    @Expose
    private boolean pulpa;
    @SerializedName("lenyaCarbon")
    @Expose
    private boolean lenyaCarbon;

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public boolean isMadera() {
        return madera;
    }

    public void setMadera(boolean madera) {
        this.madera = madera;
    }

    public boolean isPulpa() {
        return pulpa;
    }

    public void setPulpa(boolean pulpa) {
        this.pulpa = pulpa;
    }

    public boolean isLenyaCarbon() {
        return lenyaCarbon;
    }

    public void setLenyaCarbon(boolean lenyaCarbon) {
        this.lenyaCarbon = lenyaCarbon;
    }

}
