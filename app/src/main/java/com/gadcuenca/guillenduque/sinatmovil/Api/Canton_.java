
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Canton_ {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("codCatastral")
    @Expose
    private String codCatastral;
    @SerializedName("geom")
    @Expose
    private Object geom;
    @SerializedName("provincia")
    @Expose
    private Provincia_ provincia;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Provincia_ getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia_ provincia) {
        this.provincia = provincia;
    }

}
