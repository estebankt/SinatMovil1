
package com.gadcuenca.guillenduque.sinatmovil.Api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Provincia_ {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("geom")
    @Expose
    private Object geom;
    @SerializedName("cantones")
    @Expose
    private List<Object> cantones = null;

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

    public Object getGeom() {
        return geom;
    }

    public void setGeom(Object geom) {
        this.geom = geom;
    }

    public List<Object> getCantones() {
        return cantones;
    }

    public void setCantones(List<Object> cantones) {
        this.cantones = cantones;
    }

}
