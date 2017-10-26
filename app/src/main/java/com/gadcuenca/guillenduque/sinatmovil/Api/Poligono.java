
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Poligono {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("codCatastral")
    @Expose
    private String codCatastral;
    @SerializedName("geom")
    @Expose
    private Object geom;
    @SerializedName("parroquia")
    @Expose
    private Parroquia_ parroquia;

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

    public Object getGeom() {
        return geom;
    }

    public void setGeom(Object geom) {
        this.geom = geom;
    }

    public Parroquia_ getParroquia() {
        return parroquia;
    }

    public void setParroquia(Parroquia_ parroquia) {
        this.parroquia = parroquia;
    }

}
