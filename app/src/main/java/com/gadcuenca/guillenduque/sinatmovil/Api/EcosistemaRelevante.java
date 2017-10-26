
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EcosistemaRelevante {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("valor")
    @Expose
    private String valor;
    @SerializedName("codigo")
    @Expose
    private Object codigo;
    @SerializedName("version")
    @Expose
    private Object version;
    @SerializedName("prioridad")
    @Expose
    private Object prioridad;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Object getCodigo() {
        return codigo;
    }

    public void setCodigo(Object codigo) {
        this.codigo = codigo;
    }

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public Object getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Object prioridad) {
        this.prioridad = prioridad;
    }

}
