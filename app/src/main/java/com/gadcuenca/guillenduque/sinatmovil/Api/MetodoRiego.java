
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MetodoRiego {

    @SerializedName("version")
    @Expose
    private long version;
    @SerializedName("aspersion")
    @Expose
    private boolean aspersion;
    @SerializedName("bombeo")
    @Expose
    private boolean bombeo;
    @SerializedName("gravedad")
    @Expose
    private boolean gravedad;
    @SerializedName("goteo")
    @Expose
    private boolean goteo;
    @SerializedName("otro")
    @Expose
    private boolean otro;
    @SerializedName("permante")
    @Expose
    private boolean permante;
    @SerializedName("noTiene")
    @Expose
    private boolean noTiene;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public boolean isAspersion() {
        return aspersion;
    }

    public void setAspersion(boolean aspersion) {
        this.aspersion = aspersion;
    }

    public boolean isBombeo() {
        return bombeo;
    }

    public void setBombeo(boolean bombeo) {
        this.bombeo = bombeo;
    }

    public boolean isGravedad() {
        return gravedad;
    }

    public void setGravedad(boolean gravedad) {
        this.gravedad = gravedad;
    }

    public boolean isGoteo() {
        return goteo;
    }

    public void setGoteo(boolean goteo) {
        this.goteo = goteo;
    }

    public boolean isOtro() {
        return otro;
    }

    public void setOtro(boolean otro) {
        this.otro = otro;
    }

    public boolean isPermante() {
        return permante;
    }

    public void setPermante(boolean permante) {
        this.permante = permante;
    }

    public boolean isNoTiene() {
        return noTiene;
    }

    public void setNoTiene(boolean noTiene) {
        this.noTiene = noTiene;
    }

}
