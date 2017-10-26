
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Parroquia {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("codCatastral")
    @Expose
    private String codCatastral;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("geom")
    @Expose
    private Object geom;
    @SerializedName("canton")
    @Expose
    private Canton canton;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodCatastral() {
        return codCatastral;
    }

    public void setCodCatastral(String codCatastral) {
        this.codCatastral = codCatastral;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getGeom() {
        return geom;
    }

    public void setGeom(Object geom) {
        this.geom = geom;
    }

    public Canton getCanton() {
        return canton;
    }

    public void setCanton(Canton canton) {
        this.canton = canton;
    }

}
