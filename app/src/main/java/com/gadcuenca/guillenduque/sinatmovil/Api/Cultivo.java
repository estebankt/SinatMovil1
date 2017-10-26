
package com.gadcuenca.guillenduque.sinatmovil.Api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cultivo {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("version")
    @Expose
    private Object version;
    @SerializedName("coberturaA")
    @Expose
    private CoberturaA coberturaA;
    @SerializedName("estadoCoberturaA")
    @Expose
    private String estadoCoberturaA;
    @SerializedName("anyosA")
    @Expose
    private long anyosA;
    @SerializedName("porcentajeA")
    @Expose
    private long porcentajeA;
    @SerializedName("coberturaB")
    @Expose
    private Object coberturaB;
    @SerializedName("estadoCoberturaB")
    @Expose
    private Object estadoCoberturaB;
    @SerializedName("anyosB")
    @Expose
    private Object anyosB;
    @SerializedName("pertenecePoses")
    @Expose
    private boolean pertenecePoses;
    @SerializedName("fechaLevantamiento")
    @Expose
    private long fechaLevantamiento;
    @SerializedName("area")
    @Expose
    private double area;
    @SerializedName("valoresAjustes")
    @Expose
    private List<Object> valoresAjustes = null;
    @SerializedName("idPredio")
    @Expose
    private Object idPredio;
    @SerializedName("cacheCapas")
    @Expose
    private List<Object> cacheCapas = null;
    @SerializedName("geom")
    @Expose
    private String geom;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public CoberturaA getCoberturaA() {
        return coberturaA;
    }

    public void setCoberturaA(CoberturaA coberturaA) {
        this.coberturaA = coberturaA;
    }

    public String getEstadoCoberturaA() {
        return estadoCoberturaA;
    }

    public void setEstadoCoberturaA(String estadoCoberturaA) {
        this.estadoCoberturaA = estadoCoberturaA;
    }

    public long getAnyosA() {
        return anyosA;
    }

    public void setAnyosA(long anyosA) {
        this.anyosA = anyosA;
    }

    public long getPorcentajeA() {
        return porcentajeA;
    }

    public void setPorcentajeA(long porcentajeA) {
        this.porcentajeA = porcentajeA;
    }

    public Object getCoberturaB() {
        return coberturaB;
    }

    public void setCoberturaB(Object coberturaB) {
        this.coberturaB = coberturaB;
    }

    public Object getEstadoCoberturaB() {
        return estadoCoberturaB;
    }

    public void setEstadoCoberturaB(Object estadoCoberturaB) {
        this.estadoCoberturaB = estadoCoberturaB;
    }

    public Object getAnyosB() {
        return anyosB;
    }

    public void setAnyosB(Object anyosB) {
        this.anyosB = anyosB;
    }

    public boolean isPertenecePoses() {
        return pertenecePoses;
    }

    public void setPertenecePoses(boolean pertenecePoses) {
        this.pertenecePoses = pertenecePoses;
    }

    public long getFechaLevantamiento() {
        return fechaLevantamiento;
    }

    public void setFechaLevantamiento(long fechaLevantamiento) {
        this.fechaLevantamiento = fechaLevantamiento;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public List<Object> getValoresAjustes() {
        return valoresAjustes;
    }

    public void setValoresAjustes(List<Object> valoresAjustes) {
        this.valoresAjustes = valoresAjustes;
    }

    public Object getIdPredio() {
        return idPredio;
    }

    public void setIdPredio(Object idPredio) {
        this.idPredio = idPredio;
    }

    public List<Object> getCacheCapas() {
        return cacheCapas;
    }

    public void setCacheCapas(List<Object> cacheCapas) {
        this.cacheCapas = cacheCapas;
    }

    public String getGeom() {
        return geom;
    }

    public void setGeom(String geom) {
        this.geom = geom;
    }

}
