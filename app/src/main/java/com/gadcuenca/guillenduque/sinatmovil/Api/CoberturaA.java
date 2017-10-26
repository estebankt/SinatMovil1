
package com.gadcuenca.guillenduque.sinatmovil.Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoberturaA {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("idPadre")
    @Expose
    private long idPadre;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("codigo")
    @Expose
    private String codigo;
    @SerializedName("codigoGrupo")
    @Expose
    private String codigoGrupo;
    @SerializedName("codigoSubGrupo")
    @Expose
    private String codigoSubGrupo;
    @SerializedName("codigoGrupoTipo")
    @Expose
    private Object codigoGrupoTipo;
    @SerializedName("abreviatura")
    @Expose
    private String abreviatura;
    @SerializedName("agregaciones")
    @Expose
    private Object agregaciones;
    @SerializedName("fuente")
    @Expose
    private String fuente;
    @SerializedName("aplicaRiego")
    @Expose
    private Object aplicaRiego;
    @SerializedName("asociable")
    @Expose
    private boolean asociable;
    @SerializedName("edadMinima")
    @Expose
    private long edadMinima;
    @SerializedName("edadMaxima")
    @Expose
    private long edadMaxima;
    @SerializedName("idAgrupacion")
    @Expose
    private long idAgrupacion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(long idPadre) {
        this.idPadre = idPadre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public String getCodigoSubGrupo() {
        return codigoSubGrupo;
    }

    public void setCodigoSubGrupo(String codigoSubGrupo) {
        this.codigoSubGrupo = codigoSubGrupo;
    }

    public Object getCodigoGrupoTipo() {
        return codigoGrupoTipo;
    }

    public void setCodigoGrupoTipo(Object codigoGrupoTipo) {
        this.codigoGrupoTipo = codigoGrupoTipo;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public Object getAgregaciones() {
        return agregaciones;
    }

    public void setAgregaciones(Object agregaciones) {
        this.agregaciones = agregaciones;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public Object getAplicaRiego() {
        return aplicaRiego;
    }

    public void setAplicaRiego(Object aplicaRiego) {
        this.aplicaRiego = aplicaRiego;
    }

    public boolean isAsociable() {
        return asociable;
    }

    public void setAsociable(boolean asociable) {
        this.asociable = asociable;
    }

    public long getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(long edadMinima) {
        this.edadMinima = edadMinima;
    }

    public long getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(long edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public long getIdAgrupacion() {
        return idAgrupacion;
    }

    public void setIdAgrupacion(long idAgrupacion) {
        this.idAgrupacion = idAgrupacion;
    }

}
