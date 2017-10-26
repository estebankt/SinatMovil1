
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FactoresDesglose {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("version")
    @Expose
    private long version;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("factor")
    @Expose
    private double factor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

}
